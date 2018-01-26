var UniResEditView2ControllerBase = EditView2ControllerBase.extend({
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
     /*统一资源类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList16',datas:[{text:'内置页面',value:'PAGE',realtext:'内置页面'},{text:'报表',value:'REPORT',realtext:'报表'},{text:'自定义',value:'CUSTOM',realtext:'自定义'}]}));
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
  var uiaction_9 = {"type":"DEUIACTION","tag":"FirstRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"PrevRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"NextRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"LastRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_13);
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/common/UniResEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/unireseditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M10',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'uniresid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'uniresname',allowBlank:false,form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M6',name:'unirestype',allowBlank:false,form:form,codelistid:'uniPSample_CodeList16'}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'resourceid',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M8',name:'memo',form:form,height:200}));
form.register(new IBizFormGroup({id:this.getCId2()+'Ma',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mb',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mc',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Md',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Me',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
       return null;
 }
});