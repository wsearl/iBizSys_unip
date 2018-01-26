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
 * 视图[TSSDTaskPolicyPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/TSSDTaskPolicyPickupView.do")
public class TSSDTaskPolicyPickupViewController extends net.ibizsys.paas.controller.PickupViewControllerBase {
    public TSSDTaskPolicyPickupViewController() throws Exception {
        super();
        this.setId("9aaaa0e27ef6efed8a8128d1a8fc336a");
        this.setCaption("调度任务项策略");
        this.setTitle("调度任务项策略实体数据选择视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/TSSDTaskPolicyPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.TSSDTaskPolicyPickupViewController",this);
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





    private net.ibizsys.psrt.srv.common.demodel.TSSDTaskPolicyDEModel tSSDTaskPolicyDEModel;

    public  net.ibizsys.psrt.srv.common.demodel.TSSDTaskPolicyDEModel getTSSDTaskPolicyDEModel() {
        if(this.tSSDTaskPolicyDEModel==null) {
            try {
                this.tSSDTaskPolicyDEModel = (net.ibizsys.psrt.srv.common.demodel.TSSDTaskPolicyDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.TSSDTaskPolicyDEModel");
            } catch(Exception ex) {
            }
        }
        return this.tSSDTaskPolicyDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getTSSDTaskPolicyDEModel();
    }

    public  net.ibizsys.psrt.srv.common.service.TSSDTaskPolicyService getTSSDTaskPolicyService() {
        try {
            return (net.ibizsys.psrt.srv.common.service.TSSDTaskPolicyService)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.TSSDTaskPolicyService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getTSSDTaskPolicyService();
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