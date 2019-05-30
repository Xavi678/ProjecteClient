<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="s" uri="/struts-tags" %>
<!--  <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="icon" href="imatges/logo2.svg" type="image/svg" sizes="16x16">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
     <link href="css/header.css" rel="stylesheet" media="screen">
  
</head>
<body>
 <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">Teatres</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp">Inici</a></li>
      <s:if test="isUserLogged()">
		<li><a href="logout.action">Sortir <span class="glyphicon glyphicon-log-out"></span></a></li>
		<li><a href="info.action"> <s:property value="email" /> <span class="glyphicon glyphicon-user"></span> </a></li>
	</s:if>
      <s:else>
      <li><a href="login.jsp">Login <span class="glyphicon glyphicon-log-in"></span></a></li>
      <li><a href="signup.action">Sign up <span class="glyphicon glyphicon-circle-arrow-down"></span></a></li>
     </s:else>
    </ul>
  </div>
</nav>-->

 
 
 
 <nav class="navbar navbar-inverse " role="navigation">
   <!-- Brand and toggle get grouped for better mobile display -->
   <div class="navbar-header">
     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
       <span class="sr-only">Toggle navigation</span>
       <span class="icon-bar"></span>
       <span class="icon-bar"></span>
       <span class="icon-bar"></span>
     </button>
     <a id="brand" class="navbar-brand" href="index.jsp">  <img id="logo" src="imatges/logo2.svg"  /> </a>
   </div>
 
   <!-- Collect the nav links, forms, and other content for toggling -->
   <div class="collapse navbar-collapse navbar-ex1-collapse">
     <ul class="nav navbar-nav">
      <li ><a href="index.jsp"><s:text name="global.home"></s:text>  </a></li>
     </ul>
     <s:form id="form" class="navbar-form navbar-left" theme="simple" action="searchby" >
      <div class="form-group">
       <!--  <input id="search" type="text" class="form-control" placeholder="%{getText('header.busca')}" name="search"> -->
        <s:textfield id="search" type="text" cssClass="form-control" placeholder="%{getText('header.busca')}" name="search" pattern="^[a-zA-Z ]+$" title="Només pot contenir lletres i espais" theme="simple"></s:textfield>
       <span class="data"> <s:text name="header.data"></s:text> </span> <s:textfield id="data" type="date"  cssClass="form-control" placeholder="%{getText('header.buscadata')}" name="data" theme="simple"></s:textfield>
       <span class="data"> <s:text name="header.datafi"></s:text> </span> <s:textfield id="datafi" type="date"  cssClass="form-control" placeholder="%{getText('header.buscadata')}" name="dataFi" theme="simple"></s:textfield>
      </div>
      <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
    </s:form>
     <ul class="nav navbar-nav navbar-right">
      <s:if test="isUserLogged()">
		<li><a href="logout.action"><s:text name="header.logout"></s:text> <span class="glyphicon glyphicon-log-out"></span></a></li>
		<li><a href="info.action"> <s:property value="email" /> <span class="glyphicon glyphicon-user"></span> </a></li>
	</s:if>
      <s:else>
      <li><a href="login.jsp"><s:text name="header.login"></s:text> <span class="glyphicon glyphicon-log-in"></span></a></li>
      <li><a href="register.action"><s:text name="header.signup"></s:text> <span class="glyphicon glyphicon-circle-arrow-down"></span></a></li>
     </s:else>
       
     </ul>
   </div><!-- /.navbar-collapse -->
 </nav>
 
 
 


<!--<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">Teatres</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp"><s:text name="global.home"></s:text>  </a></li>
      
    </ul>
    <s:form id="form" class="navbar-form navbar-left" theme="simple" action="searchby" >
      <div class="form-group">
        <input id="search" type="text" class="form-control" placeholder="Buscar un teatre o un espectacle..." name="search">
      </div>
      <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
    </s:form>
     <ul class="nav navbar-nav navbar-right">
      <s:if test="isUserLogged()">
		<li><a href="logout.action">Sortir <span class="glyphicon glyphicon-log-out"></span></a></li>
		<li><a href="info.action"> <s:property value="email" /> <span class="glyphicon glyphicon-user"></span> </a></li>
	</s:if>
      <s:else>
      <li><a href="login.jsp">Login <span class="glyphicon glyphicon-log-in"></span></a></li>
      <li><a href="register.action">Sign up <span class="glyphicon glyphicon-circle-arrow-down"></span></a></li>
     </s:else>
    </ul>
  </div>
</nav>-->
<!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>





    
</body>
</html>-->