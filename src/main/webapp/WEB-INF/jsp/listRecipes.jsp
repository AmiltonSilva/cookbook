<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<<<<<<< HEAD
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

			<title>Recipe List</title>
	</head>
		<body>
			<c:forEach var="recipe" items='${recipes}'>
				<p style="text-align: center;"> <a href="/recipes/${recipe.externalId}">${recipe.titulo}</a><br/>
				
				</c:forEach>
		</body>
=======
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Recipe List</title>
</head>
<body>
<c:forEach var="recipe" items='${recipes}'>
	<a href="/recipes/${recipe.id}">${recipe.titulo}</a><br/>
</c:forEach>
</body>
>>>>>>> ee6ad70d95722bd75588b9ee9701fd2517b6c41a
</html>