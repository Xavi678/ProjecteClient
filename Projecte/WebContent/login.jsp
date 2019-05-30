<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><s:text name="global.titol"></s:text></title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/header.css" rel="stylesheet" media="screen">
<link href="css/estils.css" rel="stylesheet" media="screen">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<div class="container">
<h1 class="page-header">Login</h1>

 
<s:form action="login.action" theme="simple">

<div class="form-group">
     <s:label key="register.email"></s:label>
   <!--   <input type="email" class="form-control" id="ejemplo_password_1" name="client.email"
           placeholder="E-mail...">-->
           <s:textfield cssClass="form-control" name="correu" placeholder="%{getText('placeholder.email')}" type="email" required="required" ></s:textfield>
  </div>




 
  <div class="form-group">
    <s:label key="register.password"></s:label>
   <!--  <input type="password" class="form-control" id="password" name="client.password"
           placeholder="Contrasenya">
           --> 
           <s:textfield cssClass="form-control" name="password" placeholder="%{getText('placeholder.password')}" type="password" required="required" ></s:textfield>
  </div>
  
  <s:submit name="submit" key="global.submit" align="center" cssClass="btn btn-default" />

</s:form>
<br>

<div  class="alert alert-danger  alert-dismissible">
 
<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  <strong><s:actionerror id="alert" theme="simple" cssClass="text-danger"/></strong>
</div>  
 





<jsp:include page="footer.jsp"></jsp:include>

</div>








<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

    <script src="js/bootstrap.min.js"></script>
    <script src="js/login.js"></script>
    
</body>
</html>