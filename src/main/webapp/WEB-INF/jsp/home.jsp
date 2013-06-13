<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Homepage</title>
	</head>
		<table width="1000" border="10">
			<body bgcolor = "grey"><font color=" black "></font>		
		
					<td colspan="5" style="background-color:#FFA500;">
						<center><h1>CookBooK Main Page</h1>
						
							
		
					<tr valign="middle">
						<td style="background-color:#FFD700;width:100px;">
							
							<input type="button" onclick="location.href='/recipes'" value="Listar Receitas">
					   	 	
					   	 	<input type="button" onclick="location.href='/recipes/create'" value="Criar Nova Receita">
 
					   	 </td>
					   	 	<td style="background-color:#EEEEEE;height:200px;width:400px;text-align:top;">	
						   	 	<img src='/static/cookbook.png'>
							</td> 			
					
						
						<td style="background-color:#FFCCFF;width:20%;text-align:top;">						
											   	 	
					   	 	<input type="button" onclick="location.href='/recipes/procurar'" value="Procurar Receita">					
					
					</tr>
						<td colspan="5" style="background-color:#FFA500;text-align:center;">
						<h1><marquee bgcolor ="green" <br> <button type="button"active="actived"> 
						<i> <font color="red">Copyright © Cookbook's </button> </font> 
						</td></tr><br/>
				       
				       </body>
				</table>
			</html>