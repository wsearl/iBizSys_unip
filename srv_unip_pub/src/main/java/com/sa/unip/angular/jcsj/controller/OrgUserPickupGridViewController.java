/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular.jcsj.controller;

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
import com.sa.unip.angular.AngularAppModel;


/**
 * 视图[OrgUserPickupGridView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/Angular/jcsj/OrgUserPickupGridView.do")
public class OrgUserPickupGridViewController extends net.ibizsys.paas.controller.PickupGridViewControllerBase {
    public OrgUserPickupGridViewController() throws Exception {
        super();
        this.setId("dc056086eb2b00e6f8811286c90405fb");
        this.setCaption("组织人员");
        this.setTitle("组织人员实体选择表格视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.GRID","TRUE");
        //
        this.setAttribute("UI.CTRL.SEARCHFORM","TRUE");
        //支持搜常规索
        this.setAttribute("UI.ENABLESEARCH","TRUE");

        ViewControllerGlobal.registerViewController("/Angular/jcsj/OrgUserPickupGridView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.angular.jcsj.controller.OrgUserPickupGridViewController",this);
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


    private AngularAppModel angularAppModel;
    public  AngularAppModel getAngularAppModel() {
        if(this.angularAppModel==null) {
            try {
                this.angularAppModel = (AngularAppModel)AppModelGlobal.getApplication("com.sa.unip.angular.AngularAppModel");
            } catch(Exception ex) {
            }
        }
        return this.angularAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getAngularAppModel();
    }





    private com.sa.unip.srv.subsys.demodel.OrgUserDEModel orgUserDEModel;

    public  com.sa.unip.srv.subsys.demodel.OrgUserDEModel getOrgUserDEModel() {
        if(this.orgUserDEModel==null) {
            try {
                this.orgUserDEModel = (com.sa.unip.srv.subsys.demodel.OrgUserDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgUserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgUserDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOrgUserDEModel();
    }

    public  com.sa.unip.srv.subsys.service.OrgUserService getOrgUserService() {
        try {
            return (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgUserService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOrgUserService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 grid
        ICtrlModel grid=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.angular.srv.common.ctrlmodel.OrgUserMain2GridModel");
        grid.init(this);
        this.registerCtrlModel("grid",grid);
        //注册 searchform
        ICtrlModel searchForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.angular.srv.common.ctrlmodel.OrgUserDefaultSearchFormModel");
        searchForm.init(this);
        this.registerCtrlModel("searchform",searchForm);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 grid
        ICtrlHandler grid = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.angular.jcsj.ctrlhandler.OrgUserPickupGridViewGridHandler");
        grid.init(this);
        this.registerCtrlHandler("grid",grid);
        //注册 searchform
        ICtrlHandler searchForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.angular.jcsj.ctrlhandler.OrgUserPickupGridViewSearchFormHandler");
        searchForm.init(this);
        this.registerCtrlHandler("searchform",searchForm);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}