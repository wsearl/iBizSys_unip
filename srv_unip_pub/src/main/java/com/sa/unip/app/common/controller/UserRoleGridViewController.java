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
 * 视图[UserRoleGridView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/UserRoleGridView.do")
public class UserRoleGridViewController extends net.ibizsys.paas.controller.GridViewControllerBase {
    public UserRoleGridViewController() throws Exception {
        super();
        this.setId("642a4574faa8cf7c1d882ae6b5cc7745");
        this.setCaption("用户角色");
        this.setTitle("用户角色实体表格视图");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.GRID","TRUE");
        //
        this.setAttribute("UI.CTRL.SEARCHFORM","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");
        //支持搜常规索
        this.setAttribute("UI.ENABLESEARCH","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/UserRoleGridView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.UserRoleGridViewController",this);
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





    private net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel userRoleDEModel;

    public  net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel getUserRoleDEModel() {
        if(this.userRoleDEModel==null) {
            try {
                this.userRoleDEModel = (net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userRoleDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getUserRoleDEModel();
    }

    public  net.ibizsys.psrt.srv.common.service.UserRoleService getUserRoleService() {
        try {
            return (net.ibizsys.psrt.srv.common.service.UserRoleService)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.UserRoleService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getUserRoleService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 grid
        ICtrlModel grid=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.common.ctrlmodel.UserRoleMain2GridModel");
        grid.init(this);
        this.registerCtrlModel("grid",grid);
        //注册 searchform
        ICtrlModel searchForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.common.ctrlmodel.UserRoleDefaultSearchFormModel");
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
        ICtrlHandler grid = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.UserRoleGridViewGridHandler");
        grid.init(this);
        this.registerCtrlHandler("grid",grid);
        //注册 searchform
        ICtrlHandler searchForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.UserRoleGridViewSearchFormHandler");
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