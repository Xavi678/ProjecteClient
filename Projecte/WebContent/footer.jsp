<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>

<p class="text-center ">
<%
      GregorianCalendar cal = new GregorianCalendar();
      out.print(cal.get(Calendar.YEAR));
    %>  <a href="https://github.com/Xavi678" target="blank_"> © Xavi Serentill</a></p>
    <hr>
