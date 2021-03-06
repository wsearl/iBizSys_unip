/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wf.controller;

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
 * 视图[WFActionRedirectView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/wf/WFActionRedirectView.do")
public class WFActionRedirectViewController extends net.ibizsys.paas.controller.RedirectViewControllerBase {
    public WFActionRedirectViewController() throws Exception {
        super();
        this.setId("108ff1c2a21cb6e61f4d6510a1e0bd7f");
        this.setCaption("工作流用户操作");
        this.setTitle("工作流用户操作实体数据重定向视图");
        this.setAccessUserMode(2);

        ViewControllerGlobal.registerViewController("/app/wf/WFActionRedirectView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.wf.controller.WFActionRedirectViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();

        this.setEnableWorkflow(true);

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





    private net.ibizsys.psrt.srv.wf.demodel.WFActionDEModel wFActionDEModel;

    public  net.ibizsys.psrt.srv.wf.demodel.WFActionDEModel getWFActionDEModel() {
        if(this.wFActionDEModel==null) {
            try {
                this.wFActionDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFActionDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFActionDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFActionDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getWFActionDEModel();
    }

    public  net.ibizsys.psrt.srv.wf.service.WFActionService getWFActionService() {
        try {
            return (net.ibizsys.psrt.srv.wf.service.WFActionService)ServiceGlobal.getService("net.ibizsys.psrt.srv.wf.service.WFActionService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getWFActionService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}