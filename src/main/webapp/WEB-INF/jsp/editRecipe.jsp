<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<body bgcolor = "red"><font color=" black "></font>
	<h3>Editar Receita</h3>

	<form method="POST" action="/recipes/editRecipe/${recipe.externalId}">
		<table>
			<tr>
				<td align="right">Titulo:</td>
				<td><input type="text" name="titulo" value="${recipe.titulo}" /></td>
			</tr>
			<tr>
				<td align="right">Problema:</td>
				<td><input type="text" name="problema" value="${recipe.problema}"/></td>
			</tr>
			<tr>
				<td align="right">Solucao:</td>
				<td><input type="text" name="solucao" value="${recipe.solucao}" /></td>
			</tr>
			<tr>
				<td align="right">Autor:</td>
				<td><input type="text" name="autor" value="${recipe.autor}" /></td>
			</tr>
			<tr>
				<td align="right">Etiqueta:</td>
				<td><input type="text" name="etiqueta" value="${recipe.etiqueta}" /></td>
			</tr>

			<tr>
				<td>
				<input type="submit" value="Guardar"></td>
				<td>		
				<input type="button" onclick="location.href='/recipes'"	value="Voltar Receitas"></td>
				<td>
				<input type="button" onclick="location.href='/'" value="Voltar Menu">
				</td>
			</tr>
		</table>
	</form>
</body>

		
	