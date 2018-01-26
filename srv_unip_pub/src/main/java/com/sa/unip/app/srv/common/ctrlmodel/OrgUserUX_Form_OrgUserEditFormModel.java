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

import net.ibizsys.paas.control.form.FormError;
import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.control.form.FormItemError;
import net.ibizsys.paas.ctrlmodel.EditFormItemModel;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.service.IService;

/**
 * 实体[组织人员]编辑表单[form]部件模型
 */
public class OrgUserUX_Form_OrgUserEditFormModel extends net.ibizsys.paas.ctrlmodel.EditFormModelBase {

    public OrgUserUX_Form_OrgUserEditFormModel()  {
        super();
        this.setName("form");
    }

    private com.sa.unip.srv.subsys.demodel.OrgUserDEModel orgUserDEModel;
    protected  com.sa.unip.srv.subsys.demodel.OrgUserDEModel getOrgUserDEModel() {
        if(this.orgUserDEModel==null) {
            try {
                this.orgUserDEModel = (com.sa.unip.srv.subsys.demodel.OrgUserDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgUserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgUserDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOrgUserDEModel();
    }

    /**
     * 准备表单项模型
     * @throws Exception
     */
    protected void prepareFormItems()throws Exception {
        super.prepareFormItems();
        IFormItem iFormItem = null;
        // srfupdatedate
        iFormItem = this.createFormItem("srfupdatedate");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfupdatedate");
            formItem.setDEFName("UPDATEDATE");
            formItem.setCaption("更新时间");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfupdatedate");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("UPDATEDATE");
            dataItemParam0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srforikey
        iFormItem = this.createFormItem("srforikey");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srforikey");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srforikey");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfkey
        iFormItem = this.createFormItem("srfkey");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfkey");
            formItem.setDEFName("ORGUSERID");
            formItem.setCaption("组织人员标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORGUSERID");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfmajortext
        iFormItem = this.createFormItem("srfmajortext");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfmajortext");
            formItem.setDEFName("ORGUSERNAME");
            formItem.setCaption("人员名称");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfmajortext");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORGUSERNAME");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srftempmode
        iFormItem = this.createFormItem("srftempmode");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srftempmode");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srftempmode");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfuf
        iFormItem = this.createFormItem("srfuf");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfuf");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfuf");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfdeid
        iFormItem = this.createFormItem("srfdeid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfdeid");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfdeid");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // srfsourcekey
        iFormItem = this.createFormItem("srfsourcekey");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("srfsourcekey");
            formItem.setDEFName("");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfsourcekey");
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orguserid
        iFormItem = this.createFormItem("orguserid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orguserid");
            formItem.setDEFName("ORGUSERID");
            formItem.setCaption("人员标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orguserid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgusername
        iFormItem = this.createFormItem("orgusername");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgusername");
            formItem.setDEFName("ORGUSERNAME");
            formItem.setCaption("人员名称");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgusername");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgsectorname
        iFormItem = this.createFormItem("orgsectorname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgsectorname");
            formItem.setDEFName("ORGSECTORNAME");
            formItem.setCaption("所属部门");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgsectorname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgsecusertypename
        iFormItem = this.createFormItem("orgsecusertypename");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgsecusertypename");
            formItem.setDEFName("ORGSECUSERTYPENAME");
            formItem.setCaption("职务");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgsecusertypename");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // validflag
        iFormItem = this.createFormItem("validflag");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("validflag");
            formItem.setDEFName("VALIDFLAG");
            formItem.setCodeListId("com.sa.unip.srv.codelist.YesNoCodeListModel");
            formItem.setCaption("启用标志");
            formItem.setAllowEmpty(false);
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("validflag");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // reserver5
        iFormItem = this.createFormItem("reserver5");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("reserver5");
            formItem.setDEFName("RESERVER5");
            formItem.setEnableCond(0);
            formItem.setCodeListId("com.sa.unip.srv.codelist.XBCodeListModel");
            formItem.setCaption("性别");
            formItem.setOutputCodeListConfig(true);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("reserver5");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orguserlevelname
        iFormItem = this.createFormItem("orguserlevelname");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orguserlevelname");
            formItem.setDEFName("ORGUSERLEVELNAME");
            formItem.setCaption("人员级别");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orguserlevelname");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // titlename
        iFormItem = this.createFormItem("titlename");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("titlename");
            formItem.setDEFName("TITLENAME");
            formItem.setCaption("头衔名称");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("titlename");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // reserver
        iFormItem = this.createFormItem("reserver");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("reserver");
            formItem.setDEFName("RESERVER");
            formItem.setEnableCond(1);
            formItem.setCaption("登录名");
            formItem.setAllowEmpty(false);

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("reserver");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // reserver19
        iFormItem = this.createFormItem("reserver19");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("reserver19");
            formItem.setDEFName("RESERVER19");
            formItem.setEnableCond(0);
            formItem.setCaption("生日");
            formItem.setValueTranslator("DATE|YYYY-MM-DD");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("reserver19");
            dataItem.setDataType(5);
            dataItem.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // reserver6
        iFormItem = this.createFormItem("reserver6");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("reserver6");
            formItem.setDEFName("RESERVER6");
            formItem.setEnableCond(0);
            formItem.setCaption("邮箱地址");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("reserver6");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // ordervalue
        iFormItem = this.createFormItem("ordervalue");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("ordervalue");
            formItem.setDEFName("ORDERVALUE");
            formItem.setCaption("人员排序");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("ordervalue");
            dataItem.setDataType(9);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // usercode
        iFormItem = this.createFormItem("usercode");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("usercode");
            formItem.setDEFName("USERCODE");
            formItem.setCaption("工号");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("usercode");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // reserver30
        iFormItem = this.createFormItem("reserver30");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("reserver30");
            formItem.setDEFName("RESERVER30");
            formItem.setCaption("手机号码");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("reserver30");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // reserver4
        iFormItem = this.createFormItem("reserver4");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("reserver4");
            formItem.setDEFName("RESERVER4");
            formItem.setCaption("工作证号");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("reserver4");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // userdata
        iFormItem = this.createFormItem("userdata");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("userdata");
            formItem.setDEFName("USERDATA");
            formItem.setCaption("用户数据");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("userdata");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // memo
        iFormItem = this.createFormItem("memo");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("memo");
            formItem.setDEFName("MEMO");
            formItem.setCaption("备注");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("memo");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgsectorid
        iFormItem = this.createFormItem("orgsectorid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgsectorid");
            formItem.setDEFName("ORGSECTORID");
            formItem.setCaption("所属部门");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgsectorid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orgsecusertypeid
        iFormItem = this.createFormItem("orgsecusertypeid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orgsecusertypeid");
            formItem.setDEFName("ORGSECUSERTYPEID");
            formItem.setCaption("部门人员关系");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orgsecusertypeid");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            formItem.setDataItem(dataItem);
            formItem.init();
            iFormItem = formItem;
        }
        this.registerFormItem(iFormItem);
        // orguserlevelid
        iFormItem = this.createFormItem("orguserlevelid");
        if(iFormItem==null) {
            EditFormItemModel formItem = new EditFormItemModel();
            formItem.setForm(this);
            formItem.setName("orguserlevelid");
            formItem.setDEFName("ORGUSERLEVELID");
            formItem.setCaption("人员级别");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("orguserlevelid");
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
    @Override
    protected void onTestValueRule(IService iService, IDataObject iDataObject, boolean bUpdate,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        super.onTestValueRule( iService,  iDataObject,  bUpdate, entityError) ;
    }

    @Override
    protected Boolean onTestFormItemEnabled(IFormItem iFormItem, IDataObject iDataObject, boolean bUpdate) throws Exception {
        return super.onTestFormItemEnabled(iFormItem, iDataObject, bUpdate);
    }

}