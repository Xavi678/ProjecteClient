<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><s:text name="global.titol"></s:text></title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/header.css" rel="stylesheet" media="screen">
<link href="css/estils.css" rel="stylesheet" media="screen">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<h1 class="page-header"><s:text name="funcions.titol"></s:text> </h1>
<h3><s:property value="titol"/> </h3>
<img src="<s:property value='cartell'/>"/>
<div class="table-responsive">
<table class="table table-hover" >
  <thead>
    <tr>
     <th scope="col"><s:text name="teatre.nom"></s:text> </th>
     <th scope="col"><s:text name="search.files"></s:text> </th>
     <th scope="col"><s:text name="search.butaques"></s:text> </th>
      <th scope="col"><s:text name="funcio.data"></s:text> </th>
      <th scope="col"><s:text name="hora.inici"></s:text> </th>
      <th scope="col"><s:text name="hora.fi"></s:text> </th>
    </tr>
  </thead>
	<tbody style="cursor: pointer;">
	<s:iterator value="funcions" var="funcio" status="rowstatus">
	<s:url action="elegirFuncio.action" var="urlTag" >
    <s:param name="id"><s:property value="ID"/></s:param>
     
</s:url>
	
	<tr id="<s:property value="ID"/>">
	
	<td><s:property value="teatre.nom"/></td>
	<td><s:property value="teatre.files"/></td>
	<td><s:property value="teatre.columnes"/></td>
	<td><s:property value="data"/></td>
	<td><s:property value="HoraInici"/></td>
	<td><s:property value="HoraFi"/></td>
	<!--  <td><s:a href="%{urlTag}"><span class="glyphicon glyphicon-triangle-right" style="font-size: 20px;"></span></s:a></td>-->
	</tr>
	
	</s:iterator>
	
	</tbody>
</table>
</div>
  <button onclick="window.history.back();" class="btn btn-default  "><span class="glyphicon glyphicon-arrow-left"></span> Tornar</button>
<jsp:include page="footer.jsp"></jsp:include>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

    <script src="js/bootstrap.min.js"></script>
    <script src="js/funcio.js" type="text/javascript"></script>
</body>
</html>