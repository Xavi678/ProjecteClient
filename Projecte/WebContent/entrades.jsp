<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><s:text name="global.titol"></s:text></title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/entrada.css" rel="stylesheet" media="screen">
<link href="css/header.css" rel="stylesheet" media="screen">
<link href="css/estils.css" rel="stylesheet" media="screen">
</head>
<body>
<s:include value="header.jsp"></s:include>

<div class="container ">
<h1 class="page-header">Butaques</h1>
<label>Butaca Ocupada</label> <button class="btn btn-danger btn-circle btn-lg" disabled="disabled"></button>  <label>Butaca Lliure</label> <button class="btn btn-primary btn-circle btn-lg" ></button>   <label>Butaca Seleccionada</label> <button class="btn btn-default btn-circle btn-lg" ></button> <br> 

<br>

<div id="escenari" class="text-center"><h3>Escenari</h3></div>
<br>
<table align="center" >
<s:set var="count" value="1"/>
<s:iterator value="butaques" var="butaca" status="rowstatus">
<tr>
<s:set var="column" value="1"/>
<s:iterator value="butaca" var="item" status="row">
<s:if test="%{#item==0}">
<td class="td"> <button id="<s:property value='#count' /><s:property value='#column' />" type="button" class="btn btn-danger btn-circle btn-lg" disabled="disabled"  data-toggle="tooltip" title='Fila: <s:property value="#count" /> Columna: <s:property value="#column" />'></button>  </td> 
</s:if>
<s:else>
<td class="td"> <button id="<s:property value='#count' /><s:property value='#column' />" type="button" class="btn btn-primary btn-circle btn-lg" data-toggle="tooltip" title='Fila: <s:property value="#count" /> Butaca: <s:property value="#column" />'></button>  </td> 
</s:else>


<s:set var="counter1" value="%{#column+1}"/>
<s:set var="column" value="%{#counter1}"/>

</s:iterator>
<s:set var="counter" value="%{#count+1}"/>
<s:set var="count" value="%{#counter}"/>
</tr>
</s:iterator>
<!--<s:iterator value="butaques" var="butaca">
<tr>
<s:iterator value="butaca">
<td>hola</td>
</s:iterator>
</tr>
</s:iterator>-->




</table>


<br>
<br>

<table id="table" class="table">
<thead>
<tr>

<th>Fila</th>
<th>Butaca</th>
<th>Preu</th>

</tr>
</thead>
<tbody id="tbody">

</tbody>

</table>

<s:form action="afegirButaques" theme="simple" >
<s:hidden name="FuncioID" value="%{Func.ID}"></s:hidden>

<s:submit id="comprar" theme="simple" cssClass="btn btn-primary  pull-right" value="Comprar" ></s:submit>

<!-- <button id="boto" class="btn btn-primary ">Comprar</button> -->
</s:form>
 <button onclick="window.history.back();" class="btn btn-default  "><span class="glyphicon glyphicon-arrow-left"></span> Tornar</button>
<s:include value="footer.jsp"></s:include>
</div>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

    <script src="js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="js/entrada.js"></script>

</body>
</html>