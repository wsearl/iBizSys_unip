/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.ywsp.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_YBHYSQMobMainEditFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel;
import com.sa.unip.srv.ywsp.service.OA_YBHYSQService;
import com.sa.unip.srv.ywsp.dao.OA_YBHYSQDAO;
import com.sa.unip.srv.ywsp.entity.OA_YBHYSQ;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_YBHYSQMobWFStartViewEditFormHandler extends net.ibizsys.pswf.ctrlhandler.WFActionFormHandlerBase {

    protected OA_YBHYSQMobMainEditFormModel editformModel = null;
    public OA_YBHYSQMobWFStartViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_YBHYSQMobMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_YBHYSQMobMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_YBHYSQService getRealService() {
        return (OA_YBHYSQService)this.getService();
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
        //注册 'orgsectorname'
        IFormItemHandler orgsectornameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlhandler.OA_YBHYSQMobMainEditFormOrgsectornameHandler");
        orgsectornameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgsectorname",orgsectornameHandler);

        //注册 'oa_hysname'
        IFormItemHandler oa_hysnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlhandler.OA_YBHYSQMobMainEditFormOa_hysnameHandler");
        oa_hysnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"oa_hysname",oa_hysnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OA_YBHYSQ entity = new OA_YBHYSQ();
        entity.set(OA_YBHYSQ.FIELD_OA_YBHYSQID,objKeyValue);
        this.getRealService().executeAction(OA_YBHYSQService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_YBHYSQService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_YBHYSQService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_YBHYSQ entity = new OA_YBHYSQ();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_YBHYSQService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_YBHYSQ entity = new OA_YBHYSQ();
        entity.set(OA_YBHYSQ.FIELD_OA_YBHYSQID,objKeyValue);
        this.getRealService().executeAction(OA_YBHYSQService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_YBHYSQService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_YBHYSQ entity = new OA_YBHYSQ();
        entity.set(OA_YBHYSQ.FIELD_OA_YBHYSQID,objKeyValue);
        this.getRealService().executeAction(OA_YBHYSQService.ACTION_REMOVE,entity);
    }


}