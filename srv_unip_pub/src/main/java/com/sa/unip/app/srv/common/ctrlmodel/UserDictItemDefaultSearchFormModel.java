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
 * 实体[用户词条]搜索表单[searchform]部件模型
 */
public class  UserDictItemDefaultSearchFormModel extends net.ibizsys.paas.ctrlmodel.SearchFormModelBase {

    public UserDictItemDefaultSearchFormModel() {
        super();
        this.setName("searchform");
    }


    private net.ibizsys.psrt.srv.common.demodel.UserDictItemDEModel userDictItemDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserDictItemDEModel getUserDictItemDEModel() {
        if(this.userDictItemDEModel==null) {
            try {
                this.userDictItemDEModel = (net.ibizsys.psrt.srv.common.demodel.UserDictItemDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserDictItemDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userDictItemDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserDictItemDEModel();
    }


    /**
      * 准备表单项模型
      * @throws Exception
      */
    protected void prepareFormItems()throws Exception {
        super.prepareFormItems();
        IFormItem iFormItem = null;
        // n_userdictitemname_like
        iFormItem = this.createFormItem("n_userdictitemname_like");
        if(iFormItem==null) {
            SearchFormItemModel formItem = new SearchFormItemModel();
            formItem.setForm(this);
            formItem.setName("n_userdictitemname_like");
            formItem.setDEFName("USERDICTITEMNAME");
            formItem.setCaption("词条名称(%)");
            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("n_userdictitemname_like");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);

            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);

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