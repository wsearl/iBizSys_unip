/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.jcsj.controller;

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
import com.sa.unip.ionicapp.IonicAppAppModel;


/**
 * 视图[OA_CLMobPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/jcsj/OA_CLMobPickupView.do")
public class OA_CLMobPickupViewController extends net.ibizsys.paas.controller.MobPickupViewControllerBase {
    public OA_CLMobPickupViewController() throws Exception {
        super();
        this.setId("52124fd35e20bf91a82c6d066c9885c5");
        this.setCaption("车辆");
        this.setTitle("车辆选择");
        this.setCapLanResTag("DE.LNAME.OA_CL");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/jcsj/OA_CLMobPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.jcsj.controller.OA_CLMobPickupViewController",this);
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


    private IonicAppAppModel ionicAppAppModel;
    public  IonicAppAppModel getIonicAppAppModel() {
        if(this.ionicAppAppModel==null) {
            try {
                this.ionicAppAppModel = (IonicAppAppModel)AppModelGlobal.getApplication("com.sa.unip.ionicapp.IonicAppAppModel");
            } catch(Exception ex) {
            }
        }
        return this.ionicAppAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getIonicAppAppModel();
    }





    private com.sa.unip.srv.jcsj.demodel.OA_CLDEModel oA_CLDEModel;

    public  com.sa.unip.srv.jcsj.demodel.OA_CLDEModel getOA_CLDEModel() {
        if(this.oA_CLDEModel==null) {
            try {
                this.oA_CLDEModel = (com.sa.unip.srv.jcsj.demodel.OA_CLDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_CLDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CLDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CLDEModel();
    }

    public  com.sa.unip.srv.jcsj.service.OA_CLService getOA_CLService() {
        try {
            return (com.sa.unip.srv.jcsj.service.OA_CLService)ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_CLService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CLService();
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