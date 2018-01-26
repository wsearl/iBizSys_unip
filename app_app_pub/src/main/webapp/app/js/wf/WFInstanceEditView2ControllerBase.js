var WFInstanceEditView2ControllerBase = EditView2ControllerBase.extend({
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
    this.regController(new WFStepInstGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new WFStepDataGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new WFWorkListGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new WFInstanceGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new WFStepGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
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
    var config={backendurl:cfg.appctx+'/wf/WFInstanceEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/wf/wfinstanceeditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'wfworkflowid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'Md',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M5',name:'wfinstanceid',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'wfinstancename',allowBlank:false,form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M7',name:'wfworkflowname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'wfworkflowid',minChars:2,pageSize:50
,pickupView:{view:'/wf/wfworkflowpickupview.jsp',title:'工作流配置实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/wf/WFInstanceEditView2.do?SRFCTRLID=form&SRFFORMITEMID=wfworkflowname'

}));
form.register(new IBizTextField({id:this.getCId2()+'M8',name:'wfversion',allowBlank:false,form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M9',name:'starttime',fmt:'YYYY-MM-DD HH:mm:ss',form:form,width:160}));
form.register(new IBizDateField({id:this.getCId2()+'Ma',name:'endtime',fmt:'YYYY-MM-DD HH:mm:ss',form:form,width:160}));
form.register(new IBizTextField({id:this.getCId2()+'Mb',name:'userdata',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'Mc',name:'userdata4',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Me',name:'isclose',form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Mf',name:'isfinish',form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M10',name:'iserror',form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M11',name:'iscancel',form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M12',name:'cancelreason',form:form,height:200}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M13',name:'errorinfo',form:form,height:200}));
form.register(new IBizTextField({id:this.getCId2()+'M14',name:'activestepname',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
      if(drmode=='DRITEM3'){
          return {viewurl:'/wf/wfstepdatagridview.jsp',embedviewid:'C3'};
      	}
      if(drmode=='DRITEM2'){
          return {viewurl:'/wf/wfstepgridview.jsp',embedviewid:'C2'};
      	}
      if(drmode=='DRITEM5'){
          return {viewurl:'/wf/wfworklistgridview.jsp',embedviewid:'C5'};
      	}
      if(drmode=='DRITEM4'){
          return {viewurl:'/wf/wfstepinstgridview.jsp',embedviewid:'C4'};
      	}
      if(drmode=='DRITEM1'){
          return {viewurl:'/wf/wfinstancegridview.jsp',embedviewid:'C1'};
      	}
       return null;
 }
});