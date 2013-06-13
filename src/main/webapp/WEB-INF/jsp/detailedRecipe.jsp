<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
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