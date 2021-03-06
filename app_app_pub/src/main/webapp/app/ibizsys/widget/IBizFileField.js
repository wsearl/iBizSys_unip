/**
 * 单选框控件
 */
var IBizFileField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+this.getUniqueId());
		me.containerEL = me.field.find('.ibiz-fileupload-container');
		me.container = $(me.containerEL);
		me.uploadbtnEL = me.field.find('.ibiz-fileupload-upload');
		me.uploadbtn = $(me.uploadbtnEL);
		
		me.uploadbtn.click(function(){
			me.openUploadView('');
		});
		
		me.initSize(me.field);
		me.field.find('.select2-container').css('cssText','height:100%!important');
		me.field.find('.select2-choices').css('cssText','height:100%!important');
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		if(me.uploadbtn){
			me.uploadbtn.prop("disabled", disabled);
			me.uploadbtn.attr('disabled',disabled);
		}
	},
	getValue:function(){
		if(this.value){
			try 
			{ 
				if(this.value.length==0)
					return '';
			}
			catch (e)
			{
				
			}
			return JSON.stringify(this.value);
		}
		return '';
	},
	setValue:function(value){
		var me = this;
		if(value && value !== ''){
			if(typeof(value) !== 'object'){
				try 
				{ 
					value = JSON.parse(value);
				}catch (e) 
				{ 
					value = [];
				}
			}
		}else{
			value = [];
		}
		
		
		var oldVal = me.value;
		me.value = value;
		me.render(me.value);
		if(oldVal != value)
			me.onValueChanged(oldVal,me.value);
	},
	render:function(files){
		var me = this;
		if(files){
			var items = [];
			$.each(files,function(index,file){
				var id = file.id;
				var text = file.name;
				
				var item = '<li data-ibiz-fileid="'+id+'" class="ibiz-fileupload-item select2-search-choice ms-hover">';
				item +='<div>'+text+'</div>';
				item +='<a href="#" class="ibiz-fileupload-remove select2-search-choice-close" tabindex="-1"></a>';
				item +='</li>';
			
				items.push(item);
			});
			me.container.html(items.join(''));
			me.container.find('.ibiz-fileupload-remove').each(function(index,item){
				$(item).click(function(){
					me.removeFile($(this).parent().attr('data-ibiz-fileid'));
				});	
			});
			me.container.find('.ibiz-fileupload-item').each(function(index,item){
				$(item).dblclick(function(){
					me.openFile($(this).attr('data-ibiz-fileid'));
				});	
			});
		}else{
			me.container.html('');
		}
	},
	removeFile:function(fileid){
		var me = this;
		
		if(me.isDisabled())
			return;
		
		var values = [];
		if(me.value){
			$.each(me.value,function(index,file){
				if(file.id != fileid){
					values.push(file);
				}
			});
		}
		me.setValue(values);
	},
	openFile:function(fileid){
		window.open(BASEURL+'/ibizutil/exportfile.jsp?fileid='+fileid,'_blank');
	},
	uploadCallback:function(win){
		var me = win.opener;
		var data = win.files;
		if(data){
			if(me.value){
				var newVal = $.merge(me.value,data);
				me.setValue(newVal);
			}else{
				me.setValue(data);
			}
		}
	},
	openUploadView:function(codelist){
		var me = this;
		if(me.isDisabled())
			return;
		var win = $.getIBizApp().createWindow({});
		win.opener = me;
		win.title = $IGM('IBIZFILEFIELD.OPENUPLOADVIEW.INFO','上传文件');
		win.height = 500;
		win.width = 600;
		win.url = BASEURL +'/ibizutil/fileuploadview.jsp?'+$.param({windowid:win.getId()});
		win.callback = me.uploadCallback;
        win.openModal(window);
	}	
	
	
});	