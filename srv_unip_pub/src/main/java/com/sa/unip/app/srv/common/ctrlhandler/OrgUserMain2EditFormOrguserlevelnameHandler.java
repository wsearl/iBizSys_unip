/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.common.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;

public class OrgUserMain2EditFormOrguserlevelnameHandler extends net.ibizsys.paas.ctrlhandler.PickupTextFormItemHandlerBase {

    public OrgUserMain2EditFormOrguserlevelnameHandler()  {
        super();
    }



    /* (non-Javadoc)
    * @see net.ibizsys.paas.ctrlhandler.PickupTextFormItemHandlerBase#getPickupDEService()
     */
    @Override
    protected IService getPickupDEService() throws Exception {
        return (IService)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.OrgUserLevelService",this.getViewController().getSessionFactory());
    }

    /**
    * 获取拾取的实体数据集合名称
     * @return
     */
    @Override
    protected String getPickupDEDataSetName() {
        return "DEFAULT";
    }

    /**
    * 获取拾取的实体自填模式名称
     * @return
     */
    protected String getPickupDEACModeName() {
        //"DEFAULT";
        return "e6c870c62a861cfd5593212fa41d6f88";
    }


}