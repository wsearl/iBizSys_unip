<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-12-23 15:34:16
        String strPartUrl = request.getParameter("parturl");
  	String strController = request.getParameter("controller");
	String strCtrlId = request.getParameter("ctrlid");
	String strCId = request.getParameter("cid");
	String strEmbed = request.getParameter("embed");
	boolean bEmbedMode = (strEmbed.compareTo("true")==0);
	pageContext.setAttribute("cid",strCId);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ibiz5" uri="http://www.ibizsys.cn/tags"%>
<c:set var="ctx" value="${pageContext.request.contextPath}/app" />
<c:set var="ctx2" value="${pageContext.request.contextPath}/app" />
<%@include file="oa_gzrzeditview_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="<ibiz5:message code="TBB.TOOLTIP.*.SAVE" text="保存"></ibiz5:message>"  data-ibiz-tag="Save" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-save"></i>             <span ><ibiz5:message code="TBB.TEXT.*.SAVE" text="保存"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDNEW" text="保存并新建"></ibiz5:message>"  data-ibiz-tag="SaveAndNew" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandnew"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDNEW" text="保存并新建"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message>"  data-ibiz-tag="SaveAndExit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandclose"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.REMOVEANDCLOSE" text="删除并关闭"></ibiz5:message>"  data-ibiz-tag="RemoveAndExit" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-remove"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.REMOVEANDCLOSE" text="删除并关闭"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="提交"  data-ibiz-tag="SaveAndStart" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >                       <span >提交</span>  </button>  
<button title="当前流程步骤"  data-ibiz-tag="ViewWFStep" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-stepactor"></i>             <span ><ibiz5:message code="TBB.TEXT.*.VIEWWFSTEP" text="当前流程步骤"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.NEW" text="新建"></ibiz5:message>"  data-ibiz-tag="New" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-file-text-o"></i>             <span ><ibiz5:message code="TBB.TEXT.*.NEW" text="新建"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.COPY" text="拷贝"></ibiz5:message>"  data-ibiz-tag="Copy" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-copy"></i>             <span ><ibiz5:message code="TBB.TEXT.*.COPY" text="拷贝"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="第一个记录"  data-ibiz-tag="FirstRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-fast-backward"></i>               </button>  
<button title="上一个记录"  data-ibiz-tag="PrevRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-step-backward"></i>               </button>  
<button title="下一个记录"  data-ibiz-tag="NextRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-step-forward"></i>               </button>  
<button title="最后一个记录"  data-ibiz-tag="LastRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-fast-forward"></i>               </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.HELP" text="帮助"></ibiz5:message>"  data-ibiz-tag="Help" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-question"></i>             <span ><ibiz5:message code="TBB.TEXT.*.HELP" text="帮助"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M1e"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M1d"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M1c"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M1b"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M1a"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M19"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M18"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M17"><INPUT type="hidden" name="oa_gzrzid" id="<%=strCId%>M5"><INPUT type="hidden" name="orguserid" id="<%=strCId%>M6"><INPUT type="hidden" name="orgusername" id="<%=strCId%>M7">
<ul class="nav nav-tabs" id="<%=strCId%>form_tab">
   <li class="active"><a href="#<%=strCId%>form_formpage1_tab" data-toggle="tab">基本信息</a></li>
   <li class=""><a href="#<%=strCId%>form_formpage2_tab" data-toggle="tab">其它</a></li>
</ul>
<div class="tab-content ">
  <div class="tab-pane active row" id="<%=strCId%>form_formpage1_tab" ><div id="<%=strCId%>M4" name="group1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group1_text"  style="height:40px;" ><h5>工作日志基本信息</h5></div>
</div>
<div id="<%=strCId%>M4_gd" >
<div id='<%=strCId%>M8__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M8__lb' class="control-label" style="width:130px;"  >日志类型</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M8_c" style="" ><SELECT id="<%=strCId%>M8" name="rzlx" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
<div id='<%=strCId%>M9__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M9__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.JRGZCX" text="今日工作成效"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M9_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M9" name="jrgzcx"  type="text"  class="form-control" ></textarea>
<div class="input-group-btn ibiz-id-dropdown">
	<button type="button" class="btn default dropdown-toggle"
		data-toggle="dropdown">
		<i class="fa fa-angle-down"></i>
		</button>
	<ul class="ibiz-id-dropdownmenu dropdown-menu pull-right">
	</ul>
</div>
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Ma__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Ma__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.MRJH" text="明日计划"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Ma_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Ma" name="mrjh"  type="text"  class="form-control" ></textarea>
<div class="input-group-btn ibiz-id-dropdown">
	<button type="button" class="btn default dropdown-toggle"
		data-toggle="dropdown">
		<i class="fa fa-angle-down"></i>
		</button>
	<ul class="ibiz-id-dropdownmenu dropdown-menu pull-right">
	</ul>
</div>
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mb__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mb__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.XXT" text="需协调"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mb_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Mb" name="xxt"  type="text"  class="form-control" ></textarea>
<div class="input-group-btn ibiz-id-dropdown">
	<button type="button" class="btn default dropdown-toggle"
		data-toggle="dropdown">
		<i class="fa fa-angle-down"></i>
		</button>
	<ul class="ibiz-id-dropdownmenu dropdown-menu pull-right">
	</ul>
</div>
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mc__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mc__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CZWT" text="存在问题"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mc_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Mc" name="czwt"  type="text"  class="form-control" ></textarea>
<div class="input-group-btn ibiz-id-dropdown">
	<button type="button" class="btn default dropdown-toggle"
		data-toggle="dropdown">
		<i class="fa fa-angle-down"></i>
		</button>
	<ul class="ibiz-id-dropdownmenu dropdown-menu pull-right">
	</ul>
</div>
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Md__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Md__lb' class="control-label" style="width:130px;"  >审批人</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Md_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Md" name="spr"  type="text"  class="form-control" ></textarea>
<div class="input-group-btn ibiz-id-dropdown">
	<button type="button" class="btn default dropdown-toggle"
		data-toggle="dropdown">
		<i class="fa fa-angle-down"></i>
		</button>
	<ul class="ibiz-id-dropdownmenu dropdown-menu pull-right">
	</ul>
</div>
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Me__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Me__lb' class="control-label" style="width:130px;"  >抄送人</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Me_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>Me" name="csr" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>Mf__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mf__lb' class="control-label" style="width:130px;"  >备注</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mf_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Mf" name="bz"  type="text"  class="form-control" ></textarea>
<div class="input-group-btn ibiz-id-dropdown">
	<button type="button" class="btn default dropdown-toggle"
		data-toggle="dropdown">
		<i class="fa fa-angle-down"></i>
		</button>
	<ul class="ibiz-id-dropdownmenu dropdown-menu pull-right">
	</ul>
</div>
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M10__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M10__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.FJ" text="附件"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M10_c" style="" >
   <div name="fj" id="<%=strCId%>M10"   class="input-group ibiz-field-fileuploader">
		<div class="select2-container select2-container-multi form-control select2">
			<ul class="ibiz-fileupload-container select2-choices"></ul>
		</div>
		<div class="input-group-addon">
			<a class="ibiz-fileupload-upload btn btn-icon-only" onclick="return false;"  href="javascript:;">
				<i class="fa fa-upload"></i>
			</a>
		</div>
	</div>
</div>
	</div>
</div>
</div>
</fieldset>
</div>
</div>
  <div class="tab-pane  row" id="<%=strCId%>form_formpage2_tab" ><div id="<%=strCId%>M12" name="group2" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group2_text"  style="height:40px;" ><h5>操作信息</h5></div>
</div>
<div id="<%=strCId%>M12_gd" >
<div id='<%=strCId%>M13__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M13__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEMAN" text="建立人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M13_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createman" id="<%=strCId%>M13"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M14__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M14__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEDATE" text="建立时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M14_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createdate" id="<%=strCId%>M14"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M15__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M15__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEMAN" text="更新人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M15_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updateman" id="<%=strCId%>M15"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M16__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M16__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEDATE" text="更新时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M16_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updatedate" id="<%=strCId%>M16"  >
</div>
	</div>
</div>
</div>
</fieldset>
</div>
</div>
</div>
</div>
</div>
<% return;} %>
