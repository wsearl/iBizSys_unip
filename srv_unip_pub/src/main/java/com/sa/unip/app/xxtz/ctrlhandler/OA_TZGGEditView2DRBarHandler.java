/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.xxtz.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.xxtz.ctrlmodel.OA_TZGGDefaultDRBarModel;
import com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel;
import com.sa.unip.srv.xxtz.service.OA_TZGGService;
import com.sa.unip.srv.xxtz.dao.OA_TZGGDAO;
import com.sa.unip.srv.xxtz.entity.OA_TZGG;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.IDRBarModel;

public class OA_TZGGEditView2DRBarHandler extends net.ibizsys.paas.ctrlhandler.DRBarHandlerBase {

    protected OA_TZGGDefaultDRBarModel drBarModel = null;
    public OA_TZGGEditView2DRBarHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        drBarModel  = (OA_TZGGDefaultDRBarModel)this.getViewController().getCtrlModel("drbar");
        super.onInit();
    }


    @Override
    protected IDRBarModel getDRBarModel() {
        return this.getRealDRBarModel();
    }

    protected OA_TZGGDefaultDRBarModel getRealDRBarModel() {
        return this.drBarModel ;
    }



}