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

import net.ibizsys.paas.ctrlmodel.SearchFormItemModel;
import net.ibizsys.paas.control.form.FormError;
import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.control.form.FormItemError;

/**
 * 实体[任务调度任务项]搜索表单[searchform]部件模型
 */
public class  TSSDTaskDefaultSearchFormModel extends net.ibizsys.paas.ctrlmodel.SearchFormModelBase {

    public TSSDTaskDefaultSearchFormModel() {
        super();
        this.setName("searchform");
    }


    private net.ibizsys.psrt.srv.common.demodel.TSSDTaskDEModel tSSDTaskDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.TSSDTaskDEModel getTSSDTaskDEModel() {
        if(this.tSSDTaskDEModel==null) {
            try {
                this.tSSDTaskDEModel = (net.ibizsys.psrt.srv.common.demodel.TSSDTaskDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.TSSDTaskDEModel");
            } catch(Exception ex) {
            }
        }
        return this.tSSDTaskDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getTSSDTaskDEModel();
    }


    /**
      * 准备表单项模型
      * @throws Exception
      */
    protected void prepareFormItems()throws Exception {
        super.prepareFormItems();
        IFormItem iFormItem = null;

    }

    /**
    * 填充表单值
    * @param iDataObject
    * @param bUpdate
    * @param bIgnoreEmpty
    * @param formError
    * @throws Exception
    */
    @Override
    protected void onFillInputValues(IDataObject iDataObject,boolean bUpdate,boolean bIgnoreEmpty,FormError formError)throws Exception {
        super.onFillInputValues(iDataObject,bUpdate,bIgnoreEmpty,formError);
        if(formError.hasError())
            return;


    }

}