<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<<<<<<< HEAD
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Recipe ${recipe.externalId}</title>
	</head>
		<body bgcolor = "black,red,yellow,black"><font color=" black "></font>
	
	    <b>Titulo:</b>
		<h1>${recipe.titulo}</h1>
		
		<b>Problema:</b>
		<p>${recipe.problema}</p>
		
		<b>Solucao:</b>
		<p>${recipe.solucao}</p>
		
		<b>Autor</b>
		<p>${recipe.autor}</p>
		
		<b>Etiqueta</b>
		<p>${recipe.etiqueta}</p>
		
		
		<p>Data de Criacao: ${recipe.creationTimestamp}</p></br>

				
					<input type="button" onclick="location.href='/recipes/deleteRecipe/${recipe.externalId}'" value="ApagarReceita">
				
					<input type="button" onclick="location.href='/recipes/edit/${recipe.externalId}'" value="Editar Receita"></td>
					
					<input type="button" onclick="location.href='/recipes'" value="Voltar Receitas">
				
				    <input type="button" onclick="location.href='/'" value="Voltar Menu">
	 		</body>
	 	</html>
=======
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< HEAD
<title>Recipe ${recipe.externalId}</title>
</head>
		<body>
				<h1>${recipe.titulo}</h1>
				<b>Problema:</b>
				<p>${recipe.problema}</p>
				<b>Solucao:</b>
				<p>${recipe.solucao}</p>
				<b>Autor:</b>
				<p>${recipe.autor}</p>
				<b>Data de Criacao:</b>
				<p>${recipe.creationTimestamp}</p>

	<table>
		<tr>
			<td><input type="button"
				onclick="location.href='/recipes/deleteRecipe/${recipe.externalId}'"
				value="ApagarReceita"></td>
		</tr>
	
	</table>
	 		<td><input type="button"
				onclick="location.href='/'"
				value="Voltar"></td>
		</body>
=======
<title>Recipe ${recipe.id}</title>
</head>
<body>
	<h1>${recipe.titulo}</h1>
	<b>Problema:</b>
	<p>${recipe.problema}</p>
	<b>Solucao:</b>
	<p>${recipe.solucao}</p>

</body>
>>>>>>> ee6ad70d95722bd75588b9ee9701fd2517b6c41a
</html>
>>>>>>> c933cefd3a1292870bfca0aa3e6186b9c19a27c0
