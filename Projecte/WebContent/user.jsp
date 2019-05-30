<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><s:text name="global.titol"></s:text></title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href=" https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">
<link href="css/header.css" rel="stylesheet" media="screen">
<link href="css/estils.css" rel="stylesheet" media="screen">

</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<div class="container" >

<h2 class="page-header text-center"><s:text name="user.h2"></s:text> </h2>

<h4 class="page-header"><s:text name="user.h3"></s:text> </h4>
<s:form action="info.action" theme="simple">
  <div class="input-group">
   
  <!--   <input id="searchData" type="text" class="form-control" name="search" placeholder="Filtrar..."> -->
  <div class="input-group-addon" style="border-left: 0; border-right: 0;">Data</div>
     <s:textfield id="searchData" type="date" cssClass="form-control" name="search" placeholder="%{getText('user.filter')}" theme="simple"></s:textfield>
      <div class="input-group-addon" style="border-left: 0; border-right: 0;">Teatre</div>
       <s:textfield id="teatre" type="text" cssClass="form-control" name="teatre" placeholder="%{getText('user.filter')}" theme="simple"></s:textfield>
        <div class="input-group-addon" style="border-left: 0; border-right: 0;">Espectacle</div>
         <s:textfield id="espectacle" type="text" cssClass="form-control" name="espectacle" placeholder="%{getText('user.filter')}" theme="simple"></s:textfield>
    <span class="input-group-btn">
        <button id="afegir" type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
      </span>
  </div>
  </s:form>
<br>
<div class="table-responsive">
<table id="example" class="table table-striped table-bordered">
<thead>
<tr>
<th><s:text name="funcio.ID"></s:text> </th>
<th><s:text name="funcio.fila"></s:text> </th>
<th><s:text name="funcio.columna"></s:text> </th>
<th><s:text name="teatre.nom"></s:text> </th>
<th><s:text name="espectacle.titol"></s:text> </th>
<th><s:text name="funcio.data"></s:text> </th>
</tr>
</thead>
<tbody id="tcos" >
<s:iterator value="compres" var="compra">
<tr>
<td><s:property value="funcio.ID"/> </td>
<td><s:property  value="fila"/> </td>
<td><s:property  value="columna"/></td>
<td><s:property  value="funcio.teatre.nom"/></td>
<td><s:property  value="funcio.espectacle.titol"/></td>
<td ><s:property  value="funcio.data"/></td>

</tr>

</s:iterator>

</tbody>
</table>

</div>

<a id="desfer" class="btn btn-default"  role="button"><span class="glyphicon glyphicon-refresh"></span> </a>


<jsp:include page="footer.jsp"></jsp:include>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.js"> </script>
       

        <script src=" https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
        

    
    <script src="js/filtrar.js"></script>
    
   

</body>
</html>