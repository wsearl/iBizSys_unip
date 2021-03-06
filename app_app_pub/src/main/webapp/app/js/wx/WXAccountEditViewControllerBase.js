var WXAccountEditViewControllerBase = EditViewControllerBase.extend({
        construct: function(config) {
    if(!config)config={};
    if(!config.appctx)config.appctx='';
    if(!config.containerid)config.containerid='';
    arguments.callee.$.construct.call(this,this.getDefaultCfg(config));
    this.regCodeLists(config);
    this.regUICounters(config);
    this.regUIActions(config);
    this.regUpdatePanels(config);
    this.regControllers(config);
}
,regCodeLists:function(config)
{
     /*是否*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_YesNo',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
}
,regUICounters:function(config)
{
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
}
,regUIActions:function(config)
{
  var uiaction_0 = {"type":"DEUIACTION","tag":"Save"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"SaveAndNew"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"RemoveAndExit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"SaveAndStart"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"ViewWFStep","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Print","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"PubMenu","actiontarget":"MULTIKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"SyncOrgSector","actiontarget":"MULTIKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"SyncOrgUser","actiontarget":"MULTIKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"FirstRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"PrevRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_13);
  var uiaction_14 = {"type":"DEUIACTION","tag":"NextRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_14);
  var uiaction_15 = {"type":"DEUIACTION","tag":"LastRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_15);
  var uiaction_16 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_16);
}
,getDefaultCfg:function(cfg){
    var me=this;     
    var config={backendurl:cfg.appctx+'/wx/WXAccountEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/wx/wxaccounteditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M10',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Me',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Md',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mc',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mb',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'wxaccountid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Ma',name:'orgid'}));
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'wxaccountname',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'apiappid',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M6',name:'orgname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orgid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgfzpppickupview.jsp',title:'组织机构分组平铺选择视图'}
,ac:true
,url:this.getAppCtx()+'/wx/WXAccountEditView.do?SRFCTRLID=form&SRFFORMITEMID=orgname'

}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M7',name:'validflag',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});