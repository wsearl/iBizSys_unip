/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.ywsp.controller;

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
 * 视图[OA_CPMJSQRedirectView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_CPMJSQRedirectView.do")
public class OA_CPMJSQRedirectViewController extends net.ibizsys.paas.controller.RedirectViewControllerBase {
    public OA_CPMJSQRedirectViewController() throws Exception {
        super();
        this.setId("02462d804d8d717695a8febe92299e51");
        this.setCaption("车牌门禁申请");
        this.setTitle("车牌门禁申请数据重定向视图");
        this.setCapLanResTag("DE.LNAME.OA_CPMJSQ");
        this.setTitleLanResTag("PAGE.TITLE.OA_CPMJSQ.REDIRECTVIEW");
        this.setAccessUserMode(2);

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_CPMJSQRedirectView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_CPMJSQRedirectViewController",this);
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





    private com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel oA_CPMJSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel getOA_CPMJSQDEModel() {
        if(this.oA_CPMJSQDEModel==null) {
            try {
                this.oA_CPMJSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CPMJSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CPMJSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_CPMJSQService getOA_CPMJSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_CPMJSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CPMJSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CPMJSQService();
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