<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Recipe List</title>
	</head>
		<body bgcolor = "orange"><font color="black"></font>
			
			<c:forEach var="recipe" items='${recipes}'>
			
				<p style="text-align: center"> 
				
				<a href="/recipes/${recipe.externalId}"> 
				
				<input type="button" value="${recipe.titulo}"> </a> 
				<input type="button" value="Opcao:"> <td>
				
				<input type="button" onclick="location.href='/recipes/edit/${recipe.externalId}'" value="Editar Receita"> 
				
				<input type="button" onclick="location.href='/recipes/deleteRecipe/${recipe.externalId}'" value="Apagar Receita"> 
				</td> <br/>
				
			</c:forEach>
			
			<td>
				<input type="button" onclick="location.href='/'" value="Voltar Menu">
			</td>

		</body>
</html>



