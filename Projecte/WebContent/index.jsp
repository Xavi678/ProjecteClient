<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title><s:text name="global.titol"></s:text></title>

</head>
<body>
<s:include value="llibreries.jsp"></s:include>
<s:if test="actionMessages!=null && actionMessages.size > 0">
    <script>
    var actionMessages;
    <s:iterator value="actionMessages" >
        // Iterate the messages, and build the JS String
        actionMessages += '-' + '<s:property />' + '\n';
    </s:iterator>  
   

        alertify.success(actionMessages.replace("undefined-",""));
    </script>
</s:if>
<s:action name="llistar"  executeResult="true" />

</body>

</html>