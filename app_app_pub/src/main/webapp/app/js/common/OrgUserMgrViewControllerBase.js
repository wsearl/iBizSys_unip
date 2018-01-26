var OrgUserMgrViewControllerBase = TreeExpViewControllerBase.extend({
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
    this.regController(new OrgUserGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OrgUserGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OrgUserGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OrgUserGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/common/OrgUserMgrView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/orgusermgrview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{'treeexpbar':
{treeCfg:{contextmenu:{









}
}}}};
    return  $.extend({},config,cfg);
}  
,getExpItemView:function(arg){
       if(!arg)arg={}
       var expmode=arg.viewid.toUpperCase();
       if(!expmode)expmode='';
      if(expmode=='ORGSECTOR'){
          return {viewurl:'/common/orgusergridview.jsp',embedviewid:'C4',viewparam:{"srfparentkey":"%NODEID%","srfparenttype":"DER1N","srfder1nid":"DER1N_ORGUSER_ORGSECTOR_ORGSECTORID"}};
      	}
      if(expmode=='ORGSECTOR2'){
          return {viewurl:'/common/orgusergridview.jsp',embedviewid:'C3',viewparam:{"srfparentkey":"%NODEID%","srfparenttype":"DER1N","srfder1nid":"DER1N_ORGUSER_ORGSECTOR_ORGSECTORID"}};
      	}
      if(expmode=='ORG'){
          return {viewurl:'/common/orgusergridview.jsp',embedviewid:'C2',viewparam:{"srfparentkey":"%NODEID%","srfparenttype":"DER1N","srfder1nid":"DER1N_ORGUSER_ORG_ORGID"}};
      	}
      if(expmode=='CURORG'){
          return {viewurl:'/common/orgusergridview.jsp',embedviewid:'C1',viewparam:{"srfparentkey":"%NODEID%","srfparenttype":"DER1N","srfder1nid":"DER1N_ORGUSER_ORG_ORGID"}};
      	}
       return null;
 }
,getNewDataView:function(arg){
       if(!arg)arg={};
       var newmode=arg.srfnewmode;
       if(!newmode)newmode='';

     var parts=newmode.split('@');
     if(parts.length !=2)
         return null;
       return null;
    }

,getEditDataView:function(arg){
       var editmode=arg.srfeditmode;
       if(!editmode)editmode='';
      var parts=editmode.split('@');
     if(parts.length !=2)
         return null;
       return null;
    }
});