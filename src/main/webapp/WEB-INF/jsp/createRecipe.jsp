<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<body>
	<h3>Criar Nova Receita</h3>

	<form method="POST" action="/recipes">
		<table>
			<tr>
				<td align="right">Titulo:</td>
				<td><input type="text" name="titulo" /></td>
			</tr>
			<tr>
				<td align="right">Problema:</td>
				<td><input type="text" name="problema" /></td>
			</tr>
			<tr>
				<td align="right">Solucao:</td>
				<td><input type="text" name="solucao" /></td>
			</tr>
			<tr>
				<td align="right">Autor:</td>
				<td><input type="text" name="autor" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Criar Nova Receita" /></td>
			</tr>
		</table>
	</form>
</body>
=======
<form method="POST" action="/recipes">
Titulo: <input type="text" name="titulo"/><br/>
Problema: <input type="text" name="problema"><br/>
Solucao: <input type="text"/ name="solucao"><br/>
<input type="submit" value="Criar Nova Receita"/>
</form>
>>>>>>> ee6ad70d95722bd75588b9ee9701fd2517b6c41a
