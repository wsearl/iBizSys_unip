<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-12-25 21:26:01
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
<%@include file="oa_ybhysqybhysq_wfexpview_userpart.jsp"%>
<% if(strCtrlId.compareTo("exptab")==0){ %>
<ul class="nav nav-tabs" id="<%=strCId%>exptab" style="display:none;">
	<li><a href="#<%=strCId%>exptab_YBHYSQ_W" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_W_10" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_W_20" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_W_30" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_W_40" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_W_50" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_10" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_20" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_20_10" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_20_20" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_20_30" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_20_40" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_20_50" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_30" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_40" data-toggle="tab"></a></li>
	<li><a href="#<%=strCId%>exptab_YBHYSQ_D_50" data-toggle="tab"></a></li>
</ul>
<div class="tab-content" style="margin:10px">
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_W"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_W_10"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_W_20"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_W_30"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_W_40"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_W_50"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_10"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_20"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_20_10"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_20_20"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_20_30"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_20_40"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_20_50"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_30"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_40"></div>
	<div class="tab-pane " id="<%=strCId%>exptab_YBHYSQ_D_50"></div>
</div>
<% return;} %>