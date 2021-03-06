/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wf.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.wf.ctrlmodel.WFWorkflowMainEditFormModel;
import net.ibizsys.psrt.srv.wf.demodel.WFWorkflowDEModel;
import net.ibizsys.psrt.srv.wf.service.WFWorkflowService;
import net.ibizsys.psrt.srv.wf.dao.WFWorkflowDAO;
import net.ibizsys.psrt.srv.wf.entity.WFWorkflow;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class WFWorkflowEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected WFWorkflowMainEditFormModel editformModel = null;
    public WFWorkflowEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (WFWorkflowMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected WFWorkflowMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected WFWorkflowService getRealService() {
        return (WFWorkflowService)this.getService();
    }


    /**
    * 准备部件操作数据访问能力
     * @throws Exception
     */
    @Override
    protected void prepareDataAccessActions()throws Exception {
        super.prepareDataAccessActions();
        this.registerDataAccessAction("update","UPDATE");
        this.registerDataAccessAction("loaddraftfrom","CREATE");
        this.registerDataAccessAction("remove","DELETE");
        this.registerDataAccessAction("load","READ");
        this.registerDataAccessAction("loaddraft","CREATE");
        this.registerDataAccessAction("create","CREATE");
    }



    /**
    * 准备部件成员处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlItemHandlers()throws Exception {
        super.prepareCtrlItemHandlers();

        ISystemRuntime iSystemRuntime = (ISystemRuntime)this.getSystemModel();
        //注册 'remindmsgtemplname'
        IFormItemHandler remindmsgtemplnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFWorkflowMainEditFormRemindmsgtemplnameHandler");
        remindmsgtemplnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"remindmsgtemplname",remindmsgtemplnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        WFWorkflow entity = new WFWorkflow();
        entity.set(WFWorkflow.FIELD_WFWORKFLOWID,objKeyValue);
        this.getRealService().executeAction(WFWorkflowService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return WFWorkflowService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFWorkflowService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        WFWorkflow entity = new WFWorkflow();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(WFWorkflowService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        WFWorkflow entity = new WFWorkflow();
        entity.set(WFWorkflow.FIELD_WFWORKFLOWID,objKeyValue);
        this.getRealService().executeAction(WFWorkflowService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFWorkflowService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        WFWorkflow entity = new WFWorkflow();
        entity.set(WFWorkflow.FIELD_WFWORKFLOWID,objKeyValue);
        this.getRealService().executeAction(WFWorkflowService.ACTION_REMOVE,entity);
    }


}