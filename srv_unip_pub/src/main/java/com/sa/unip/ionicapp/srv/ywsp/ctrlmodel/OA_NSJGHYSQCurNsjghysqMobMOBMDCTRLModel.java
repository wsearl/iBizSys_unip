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
 * 实体[内设机构会议申请]移动端数据列表[mdctrl]部件模型
 */
public class  OA_NSJGHYSQCurNsjghysqMobMOBMDCTRLModel extends net.ibizsys.paas.ctrlmodel.ListModelBase {

    public OA_NSJGHYSQCurNsjghysqMobMOBMDCTRLModel()  {
        super();
        this.setPageSize(1000);
    }
    private com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel oA_NSJGHYSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel getOA_NSJGHYSQDEModel() {
        if(this.oA_NSJGHYSQDEModel==null) {
            try {
                this.oA_NSJGHYSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_NSJGHYSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_NSJGHYSQDEModel();
    }

    /**
    * 准备列表数据项模型
    * @throws Exception
    */
    protected void prepareListDataItemModels()throws Exception {
        super.prepareListDataItemModels();
        // srfmajortext
        ListDataItemModel listDataItem0 = new ListDataItemModel();
        listDataItem0.setName("srfmajortext");
        listDataItem0.setDataType(25);
        listDataItem0.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("oa_nsjghysqname");
            dataItemParam0.setDataItem(listDataItem0);
            listDataItem0.addDataItemParam(dataItemParam0);
        }

        listDataItem0.init(this);
        this.registerListDataItem(listDataItem0);
        // srfsubtitle
        ListDataItemModel listDataItem1 = new ListDataItemModel();
        listDataItem1.setName("srfsubtitle");
        listDataItem1.setDataType(25);
        listDataItem1.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("hysname");
            dataItemParam0.setDataItem(listDataItem1);
            listDataItem1.addDataItemParam(dataItemParam0);
        }

        listDataItem1.init(this);
        this.registerListDataItem(listDataItem1);
        // srftime
        ListDataItemModel listDataItem2 = new ListDataItemModel();
        listDataItem2.setName("srftime");
        listDataItem2.setDataType(25);
        listDataItem2.setFormat("%1$tm-%1$td %1$tH:%1$tM");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("hysj");
            dataItemParam0.setDataItem(listDataItem2);
            listDataItem2.addDataItemParam(dataItemParam0);
        }

        listDataItem2.init(this);
        this.registerListDataItem(listDataItem2);
        // srfkey
        ListDataItemModel listDataItem3 = new ListDataItemModel();
        listDataItem3.setName("srfkey");
        listDataItem3.setDataType(25);
        listDataItem3.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_NSJGHYSQID");
            dataItemParam0.setDataItem(listDataItem3);
            listDataItem3.addDataItemParam(dataItemParam0);
        }

        listDataItem3.init(this);
        this.registerListDataItem(listDataItem3);
        // orguserid
        ListDataItemModel listDataItem4 = new ListDataItemModel();
        listDataItem4.setName("orguserid");
        listDataItem4.setDataType(25);
        listDataItem4.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORGUSERID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem4);
            listDataItem4.addDataItemParam(dataItemParam0);
        }

        listDataItem4.init(this);
        this.registerListDataItem(listDataItem4);
        // orgsectorid
        ListDataItemModel listDataItem5 = new ListDataItemModel();
        listDataItem5.setName("orgsectorid");
        listDataItem5.setDataType(25);
        listDataItem5.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORGSECTORID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem5);
            listDataItem5.addDataItemParam(dataItemParam0);
        }

        listDataItem5.init(this);
        this.registerListDataItem(listDataItem5);
        // hysid
        ListDataItemModel listDataItem6 = new ListDataItemModel();
        listDataItem6.setName("hysid");
        listDataItem6.setDataType(25);
        listDataItem6.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("HYSID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem6);
            listDataItem6.addDataItemParam(dataItemParam0);
        }

        listDataItem6.init(this);
        this.registerListDataItem(listDataItem6);
        // nsjghysqbz
        ListDataItemModel listDataItem7 = new ListDataItemModel();
        listDataItem7.setName("nsjghysqbz");
        listDataItem7.setDataType(25);
        listDataItem7.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("NSJGHYSQBZ");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem7);
            listDataItem7.addDataItemParam(dataItemParam0);
        }

        listDataItem7.init(this);
        this.registerListDataItem(listDataItem7);
        // nsjghysqzt
        ListDataItemModel listDataItem8 = new ListDataItemModel();
        listDataItem8.setName("nsjghysqzt");
        listDataItem8.setDataType(25);
        listDataItem8.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("NSJGHYSQZT");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem8);
            listDataItem8.addDataItemParam(dataItemParam0);
        }

        listDataItem8.init(this);
        this.registerListDataItem(listDataItem8);
    }

}