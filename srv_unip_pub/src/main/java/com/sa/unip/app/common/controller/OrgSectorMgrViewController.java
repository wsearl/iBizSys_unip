/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import net.ibizsys.paas.appmodel.AppModelGlobal;
import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.controller.ViewControllerGlobal;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.ctrlhandler.ICtrlHandler;


import com.sa.unip.srv.UniPSampleSysModel;
import com.sa.unip.app.appAppModel;


/**
 * 视图[OrgSectorMgrView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/OrgSectorMgrView.do")
public class OrgSectorMgrViewController extends net.ibizsys.paas.controller.TreeExpViewControllerBase {
    public OrgSectorMgrViewController() throws Exception {
        super();
        this.setId("783d924f4c78dd4c0067ceab3239c939");
        this.setCaption("组织机构");
        this.setTitle("组织部门树导航视图");
        this.setCapLanResTag("DE.LNAME.ORG");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.TREEEXPBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/OrgSectorMgrView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.OrgSectorMgrViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();


    }

    private UniPSampleSysModel uniPSampleSysModel;

    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }

    @Override
    public  ISystemModel getSystemModel() {
        return this.getUniPSampleSysModel();
    }


    private appAppModel appAppModel;
    public  appAppModel getappAppModel() {
        if(this.appAppModel==null) {
            try {
                this.appAppModel = (appAppModel)AppModelGlobal.getApplication("com.sa.unip.app.appAppModel");
            } catch(Exception ex) {
            }
        }
        return this.appAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getappAppModel();
    }





    private com.sa.unip.srv.subsys.demodel.OrgDEModel orgDEModel;

    public  com.sa.unip.srv.subsys.demodel.OrgDEModel getOrgDEModel() {
        if(this.orgDEModel==null) {
            try {
                this.orgDEModel = (com.sa.unip.srv.subsys.demodel.OrgDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOrgDEModel();
    }

    public  com.sa.unip.srv.subsys.service.OrgService getOrgService() {
        try {
            return (com.sa.unip.srv.subsys.service.OrgService)ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOrgService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 treeexpbar
        ICtrlModel treeexpbar=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.common.ctrlmodel.OrgtreeexpbarTreeExpBarModel");
        treeexpbar.init(this);
        this.registerCtrlModel("treeexpbar",treeexpbar);
        //注册 treeexpbar_tree
        ICtrlModel treeexpbar_tree=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.common.ctrlmodel.OrgAllOrg2TreeModel");
        treeexpbar_tree.init(this);
        this.registerCtrlModel("treeexpbar_tree",treeexpbar_tree);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 treeexpbar
        ICtrlHandler treeexpbar = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.OrgSectorMgrViewTreeExpBarHandler");
        treeexpbar.init(this);
        this.registerCtrlHandler("treeexpbar",treeexpbar);
        //注册 treeexpbar_tree
        ICtrlHandler treeexpbar_tree = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.OrgSectorMgrViewTreeexpbar_treeHandler");
        treeexpbar_tree.init(this);
        this.registerCtrlHandler("treeexpbar_tree",treeexpbar_tree);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}