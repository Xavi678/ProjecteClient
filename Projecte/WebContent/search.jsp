<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><s:text name="global.titol"></s:text> </title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/search.css" rel="stylesheet" media="screen">
<link href="css/header.css" rel="stylesheet" media="screen">
<link href="css/estils.css" rel="stylesheet" media="screen">
</head>
<body>
<s:include value="header.jsp"></s:include>

<div class="container">
<h2 class="page-header"><s:text name="search.teatre"></s:text> </h2>
<div class="row">
<s:iterator value="teatres" var="teatre">

<div id='<s:property value='ID' />' class="col-xs-12 col-md-6 borde">
<h3><s:property value="nom"/> </h3>

<div class="row">

<img src="imatges/teatre.jpg" class="col-xs-6 img-thumbnail"/>
<div class="col-xs-6">
<label> <s:text name="search.capacitat"></s:text> </label>
<ul>
<li> <s:text name="search.files"></s:text> <s:property value="files"/> </li>
<li><s:text name="search.butaques"></s:text> <s:property value="columnes"/> </li>
</ul>

<label><s:property value="adreca.Localitat"/></label> <br>
<label><s:property value="adreca.Comarca"/>,</label> <label> <s:property value="adreca.Codipostal"/></label> 

</div>


</div>



</div>


</s:iterator>
</div>

<h2 class="page-header">Espectacles</h2>

<div class="row">
<s:iterator value="espectacles" var="espectacle" status="rowstatus">

	
	<s:url action="funcio.action" var="urlTag" >
    <s:param name="id"><s:property value="EspectacleID"/></s:param>
     <s:param name="cartell"><s:property value="cartell"/></s:param>
      <s:param name="titol"><s:property value="titol"/></s:param>
</s:url>

	
	<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
	
                        <div class="thumbnail ">
                            <img src="<s:property value='cartell'/>" alt="">
                            <!--  <a href="#" class="afegir"><span class="glyphicon glyphicon-plus-sign"></span></a>-->
                            
                          <s:a href="%{urlTag}" cssClass="afegir"> <span class="glyphicon glyphicon-plus-sign"></span></s:a>
                          
                            <div class="caption">
                                <h4 class="text-info"><s:property value="titol"/></h4>
                                <p>
                                    <s:property value="sinopsi"/>
                                </p>
                                <p>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star-empty"></span>
                                    <span class="glyphicon glyphicon-star-empty"></span>
                                    <a href="#" class="pull-right">12 <s:text name="main.comentari"></s:text> </a>
                                 
                                </p>
                            </div>
                        </div>
                       
                    </div>

</s:iterator>

</div><br>
 <button onclick="window.history.back();" class="btn btn-default  "><span class="glyphicon glyphicon-arrow-left"></span> Tornar</button>

</div>

<s:include value="footer.jsp"></s:include>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

    <script src="js/bootstrap.min.js"></script>
    <script src="js/search.js"></script>
</body>
</html>