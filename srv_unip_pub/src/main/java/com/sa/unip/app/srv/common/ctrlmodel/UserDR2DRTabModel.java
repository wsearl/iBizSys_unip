/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.common.ctrlmodel;


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
 * 实体[用户]数据分页[drtab]部件模型
 */
public class  UserDR2DRTabModel extends net.ibizsys.paas.ctrlmodel.DRTabModelBase {

    public UserDR2DRTabModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }


    private net.ibizsys.psrt.srv.common.demodel.UserDEModel userDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserDEModel getUserDEModel() {
        if(this.userDEModel==null) {
            try {
                this.userDEModel = (net.ibizsys.psrt.srv.common.demodel.UserDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 用户
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("用户");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 登录帐户
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("dritem1","");
        drCtrlItem1.setText("登录帐户");
        drCtrlItem1.setDRViewId("DRITEM1");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        drCtrlItem1.setViewParam("srfparentdeid","f4552a6291c79e3934263b31b83aec33");
        drCtrlItem1.setViewParam("srfparenttype","DER1N");
        drCtrlItem1.setViewParam("srfder1nid","DER1N_LOGINACCOUNT_USER_USERID");
        //添加 所属用户组
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem2","");
        drCtrlItem2.setText("所属用户组");
        drCtrlItem2.setDRViewId("DRITEM2");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","f4552a6291c79e3934263b31b83aec33");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_USERGROUPDETAIL_USEROBJECT_USEROBJECTID");
    }
}