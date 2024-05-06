<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% Map<String, String> map = (HashMap)session.getAttribute("map"); %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles/estilos.css">
<meta charset="UTF-8">
<title>Busqueda</title>
</head>
<body>
	<%if (map != null) {%>
		<h1>Tematica <%=map.toString()%></h1>
		<% for( Map.Entry<String, String> entry : map.entrySet() ){ %>  
  			<div>
  				<h4><%= entry.getKey()%></h4>		
				<a href="<%= entry.getValue()%>"><%= entry.getValue()%></a>
  			</div>
		<%}%>
	<%} else {%>
		<h1>No hay datos de la temática solicitada</h1>
		<%}%>
		<br><br>
		<button id="myButton">Volver</button>
		
</body>
<script type="text/javascript">
document.getElementById("myButton").onclick = function () {
    location.href = "../index.html";
};
</script>
</html>