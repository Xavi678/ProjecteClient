<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><s:text name="global.titol"></s:text></title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
     <link href="css/estils.css" rel="stylesheet" media="screen">
     <link href="css/header.css" rel="stylesheet" media="screen">
     <link href="css/estils.css" rel="stylesheet" media="screen">
     
</head>
<body>

<s:include value="header.jsp"></s:include>
<div class="container">
<h1 class="text-center page-header"><s:text name="global.titol"></s:text> </h1>


<!--<s:form action="searchby" theme="simple">
<div id="grup" class="input-group">

            
     
            
            <input id="search" type="text" name="search" class="form-control" placeholder="Buscar un teatre o un espectacle...">
      
          
            
        
   

      <span class="input-group-btn">
        <button id="afegir" type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
      </span>
  
    </div>
      </s:form>-->
    



<div id="carousel-id" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
    <s:iterator value="teatres"  status="rowstatus" >
    <s:if test="#rowstatus.index==teatres.size()-1">
    <li data-target="#carousel-id" data-slide-to='<s:property value="%{#rowstatus.index}"/>' class="active"></li>
    </s:if>
    <s:else>
    <li data-target="#carousel-id" data-slide-to='<s:property value="%{#rowstatus.index}"/>' class=""></li>
    </s:else>
      
        
        
        </s:iterator>
    </ol>
    <div class="carousel-inner">
    <s:iterator value="teatres" var="teatre"  status="rowstatus"  >
    <s:if test="#rowstatus.index==teatres.size()-1">
           <div class="item active">
            <img class="img-responsive center-block"  src="imatges/car1.jpg">
            <div class="container">
                <div class="carousel-caption">
                    <h1 class="titol"><s:property value="nom"/> </h1>
                    <p><strong><s:property value="nom"/></strong> és troba situat a <s:property value="adreca.Localitat"/> (<s:property value="adreca.Comarca"/>,<s:property value="adreca.Codipostal"/>) <br> Té capacitat per a <s:property value="files"/> files i <s:property value="columnes"/> columnes </p>
                    <p><a class="btn btn-lg btn-primary" href="/XaviTeatres/obtenirfuncions.action?id=<s:property value="ID"/>" role="button">Més informació </a></p>
                </div>
            </div>
        </div>
</s:if>
<s:else>
    <div class="item" >
            <img class="img-responsive center-block"   src="imatges/car1.jpg">
            <div class="container">
                <div class="carousel-caption">
                    <h1 class="titol"><s:property value="nom"/>   </h1>
                     <p><strong><s:property value="nom"/></strong> és troba situat a <s:property value="adreca.Localitat"/> (<s:property value="adreca.Comarca"/>, <s:property value="adreca.Codipostal"/>) <br> Té capacitat per a <s:property value="files"/> files i <s:property value="columnes"/> columnes </p>
                    <p><a class="btn btn-lg btn-primary" href="/XaviTeatres/obtenirfuncions.action?id=<s:property value="ID"/>" role="button">Més infromació</a></p>
                </div>
            </div>
        </div>
        <!--  <div class="item">
            <img data-src="holder.js/900x500/auto/#777:#7a7a7a/text:First slide" alt="First slide" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI5MDAiIGhlaWdodD0iNTAwIj48cmVjdCB3aWR0aD0iOTAwIiBoZWlnaHQ9IjUwMCIgZmlsbD0iIzc3NyI+PC9yZWN0Pjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjQ1MCIgeT0iMjUwIiBzdHlsZT0iZmlsbDojN2E3YTdhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjU2cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+Rmlyc3Qgc2xpZGU8L3RleHQ+PC9zdmc+">
            <div class="container">
                <div class="carousel-caption">
                    <h1><s:property value="nom"/> </h1>
                    <p></p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img data-src="holder.js/900x500/auto/#666:#6a6a6a/text:Second slide" alt="Second slide" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI5MDAiIGhlaWdodD0iNTAwIj48cmVjdCB3aWR0aD0iOTAwIiBoZWlnaHQ9IjUwMCIgZmlsbD0iIzY2NiI+PC9yZWN0Pjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjQ1MCIgeT0iMjUwIiBzdHlsZT0iZmlsbDojNmE2YTZhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjU2cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+U2Vjb25kIHNsaWRlPC90ZXh0Pjwvc3ZnPg==">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Another example headline.</h1>
                    <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
                </div>
            </div>
        </div>
        <div class="item active">
            <img data-src="holder.js/900x500/auto/#555:#5a5a5a/text:Third slide" alt="Third slide" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI5MDAiIGhlaWdodD0iNTAwIj48cmVjdCB3aWR0aD0iOTAwIiBoZWlnaHQ9IjUwMCIgZmlsbD0iIzU1NSI+PC9yZWN0Pjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjQ1MCIgeT0iMjUwIiBzdHlsZT0iZmlsbDojNWE1YTVhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjU2cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+VGhpcmQgc2xpZGU8L3RleHQ+PC9zdmc+">
            <div class="container">
                <div class="carousel-caption">
                    <h1>One more for good measure.</h1>
                    <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
                </div>
            </div>
        </div>-->
        </s:else>
        </s:iterator>
    </div>
    <a class="left carousel-control" href="#carousel-id" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
    <a class="right carousel-control" href="#carousel-id" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
</div>

<br>
<h3 class="page-header"><s:text name="main.h3"></s:text> </h3>

<div class="row">


<s:iterator value="espectacles" var="espectacle" status="rowstatus" step="-1" begin="%{espectacles.size()-1}" end="%{espectacles.size()-3}">


	<s:url action="funcio.action" var="urlTag" >
    <s:param name="id"><s:property value="EspectacleID"/></s:param>
     <s:param name="cartell"><s:property value="cartell"/></s:param>
      <s:param name="titol"><s:property value="titol"/></s:param>
</s:url>

	
	<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
	
                        <div class="thumbnail ">
                            <img src="<s:property value='cartell'/>" class="imatge" alt="">
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
<s:actionmessage/>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

    <script src="js/bootstrap.min.js"></script>
    
    <script src="js/main.js"></script>
    
</body>
</html>