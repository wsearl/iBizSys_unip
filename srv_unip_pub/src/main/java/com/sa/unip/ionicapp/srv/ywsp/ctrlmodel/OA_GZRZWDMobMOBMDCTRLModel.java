/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.srv.ywsp.ctrlmodel;


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

import net.ibizsys.paas.ctrlmodel.ListDataItemModel;

/**
 * 实体[工作日志]移动端数据列表[mdctrl]部件模型
 */
public class  OA_GZRZWDMobMOBMDCTRLModel extends net.ibizsys.paas.ctrlmodel.ListModelBase {

    public OA_GZRZWDMobMOBMDCTRLModel()  {
        super();
        this.setPageSize(1000);
    }
    private com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel oA_GZRZDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel getOA_GZRZDEModel() {
        if(this.oA_GZRZDEModel==null) {
            try {
                this.oA_GZRZDEModel = (com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_GZRZDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_GZRZDEModel();
    }

    /**
    * 准备列表数据项模型
    * @throws Exception
    */
    protected void prepareListDataItemModels()throws Exception {
        super.prepareListDataItemModels();
        // srfcontent
        ListDataItemModel listDataItem0 = new ListDataItemModel();
        listDataItem0.setName("srfcontent");
        listDataItem0.setDataType(25);
        listDataItem0.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("jrgzcx");
            dataItemParam0.setDataItem(listDataItem0);
            listDataItem0.addDataItemParam(dataItemParam0);
        }

        listDataItem0.init(this);
        this.registerListDataItem(listDataItem0);
        // srfmajortext
        ListDataItemModel listDataItem1 = new ListDataItemModel();
        listDataItem1.setName("srfmajortext");
        listDataItem1.setDataType(25);
        listDataItem1.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("oa_gzrzname");
            dataItemParam0.setDataItem(listDataItem1);
            listDataItem1.addDataItemParam(dataItemParam0);
        }

        listDataItem1.init(this);
        this.registerListDataItem(listDataItem1);
        // srfsubtitle
        ListDataItemModel listDataItem2 = new ListDataItemModel();
        listDataItem2.setName("srfsubtitle");
        listDataItem2.setDataType(25);
        listDataItem2.setFormat("%1$s");

        //设置代码表 工作日志类型
        listDataItem2.setCodeListId("BBE9816D-6E00-4D36-830F-4DBFDE6493E2");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("rzlx");
            dataItemParam0.setDataItem(listDataItem2);
            listDataItem2.addDataItemParam(dataItemParam0);
        }

        listDataItem2.init(this);
        this.registerListDataItem(listDataItem2);
        // srfcontenttitle
        ListDataItemModel listDataItem3 = new ListDataItemModel();
        listDataItem3.setName("srfcontenttitle");
        listDataItem3.setDataType(25);
        listDataItem3.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("xsbt");
            dataItemParam0.setDataItem(listDataItem3);
            listDataItem3.addDataItemParam(dataItemParam0);
        }

        listDataItem3.init(this);
        this.registerListDataItem(listDataItem3);
        // srfname
        ListDataItemModel listDataItem4 = new ListDataItemModel();
        listDataItem4.setName("srfname");
        listDataItem4.setDataType(25);
        listDataItem4.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("orgusername");
            dataItemParam0.setDataItem(listDataItem4);
            listDataItem4.addDataItemParam(dataItemParam0);
        }

        listDataItem4.init(this);
        this.registerListDataItem(listDataItem4);
        // srfstate
        ListDataItemModel listDataItem5 = new ListDataItemModel();
        listDataItem5.setName("srfstate");
        listDataItem5.setDataType(25);
        listDataItem5.setFormat("%1$s");

        //设置代码表 是否已读
        listDataItem5.setCodeListId("4855258D-5F2B-4326-A234-CF17B31B435E");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("sfyd");
            dataItemParam0.setDataItem(listDataItem5);
            listDataItem5.addDataItemParam(dataItemParam0);
        }

        listDataItem5.init(this);
        this.registerListDataItem(listDataItem5);
        // srftime
        ListDataItemModel listDataItem6 = new ListDataItemModel();
        listDataItem6.setName("srftime");
        listDataItem6.setDataType(25);
        listDataItem6.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("createdate");
            dataItemParam0.setDataItem(listDataItem6);
            listDataItem6.addDataItemParam(dataItemParam0);
        }

        listDataItem6.init(this);
        this.registerListDataItem(listDataItem6);
        // srfkey
        ListDataItemModel listDataItem7 = new ListDataItemModel();
        listDataItem7.setName("srfkey");
        listDataItem7.setDataType(25);
        listDataItem7.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_GZRZID");
            dataItemParam0.setDataItem(listDataItem7);
            listDataItem7.addDataItemParam(dataItemParam0);
        }

        listDataItem7.init(this);
        this.registerListDataItem(listDataItem7);
        // orguserid
        ListDataItemModel listDataItem8 = new ListDataItemModel();
        listDataItem8.setName("orguserid");
        listDataItem8.setDataType(25);
        listDataItem8.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORGUSERID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem8);
            listDataItem8.addDataItemParam(dataItemParam0);
        }

        listDataItem8.init(this);
        this.registerListDataItem(listDataItem8);
        // rztjbz
        ListDataItemModel listDataItem9 = new ListDataItemModel();
        listDataItem9.setName("rztjbz");
        listDataItem9.setDataType(25);
        listDataItem9.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("RZTJBZ");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem9);
            listDataItem9.addDataItemParam(dataItemParam0);
        }

        listDataItem9.init(this);
        this.registerListDataItem(listDataItem9);
        // rztjzt
        ListDataItemModel listDataItem10 = new ListDataItemModel();
        listDataItem10.setName("rztjzt");
        listDataItem10.setDataType(25);
        listDataItem10.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("RZTJZT");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem10);
            listDataItem10.addDataItemParam(dataItemParam0);
        }

        listDataItem10.init(this);
        this.registerListDataItem(listDataItem10);
    }

}