/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.wf.ctrlmodel;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.datamodel.DataItemModel;
import net.ibizsys.paas.datamodel.DataItemParamModel;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;

import net.ibizsys.paas.control.drctrl.DRCtrlItem;
import net.ibizsys.paas.control.drctrl.DRCtrlRootItem;

/**
 * 实体[工作流步骤]数据关系栏[drbar]部件模型
 */
public class  WFStepDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public WFStepDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.wf.demodel.WFStepDEModel wFStepDEModel;
    protected  net.ibizsys.psrt.srv.wf.demodel.WFStepDEModel getWFStepDEModel() {
        if(this.wFStepDEModel==null) {
            try {
                this.wFStepDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFStepDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFStepDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFStepDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFStepDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 工作流步骤
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("工作流步骤");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("DE.LNAME.WFSTEP");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("aa16d05a90245cec51dc8a2fb7f63fdb","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 工作流交互操作
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem2.setText("工作流交互操作");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_WFIAACTION_WFSTEP_WFSTEPID");
        //添加 工作流步骤数据
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem3.setText("工作流步骤数据");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_WFSTEPDATA_WFSTEP_WFSTEPID");
        //添加 工作流步骤操作者
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem3","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem4.setText("工作流步骤操作者");
        drCtrlItem4.setDRViewId("DRITEM3");
        drCtrlItem4.setTextLanResTag("");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_WFSTEPACTOR_WFSTEP_WFSTEPID");
        //添加 工作流步骤操作者（临时）
        DRCtrlItem drCtrlItem5 = drCtrlRootItem.addItem("dritem4","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem5.setText("工作流步骤操作者（临时）");
        drCtrlItem5.setDRViewId("DRITEM4");
        drCtrlItem5.setTextLanResTag("");
        drCtrlItem5.setIconPath("");
        drCtrlItem5.setIconCls("");
        drCtrlItem5.setEnableMode("ALL");
        drCtrlItem5.setViewParam("srfparentdeid","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem5.setViewParam("srfparenttype","DER1N");
        drCtrlItem5.setViewParam("srfder1nid","DER1N_WFTMPSTEPACTOR_WFSTEP_PREVWFSTEPID");
        //添加 工作流步骤子实例
        DRCtrlItem drCtrlItem6 = drCtrlRootItem.addItem("dritem5","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem6.setText("工作流步骤子实例");
        drCtrlItem6.setDRViewId("DRITEM5");
        drCtrlItem6.setTextLanResTag("");
        drCtrlItem6.setIconPath("");
        drCtrlItem6.setIconCls("");
        drCtrlItem6.setEnableMode("ALL");
        drCtrlItem6.setViewParam("srfparentdeid","aa16d05a90245cec51dc8a2fb7f63fdb");
        drCtrlItem6.setViewParam("srfparenttype","DER1N");
        drCtrlItem6.setViewParam("srfder1nid","DER1N_WFSTEPINST_WFSTEP_WFSTEPID");
    }
}