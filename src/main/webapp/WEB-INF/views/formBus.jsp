<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/include.jsp" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@ include file="/WEB-INF/views/libraries.jsp" %>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Unidades</title>
	</head>
	<body>
	
		<%@ include file="/WEB-INF/views/indexpanel.jsp" %>
		
		<div id="page-wrapper" class="">
			<div class="row">
				<div class="col-xs-12">
					<div class="panel panel-default">
						<div class="panel-heading wt-panel-heading">
							Registrar Unidad
						</div>
						<div class="panel-body">
							
							<form:form action="registrarBus" method="post" commandName="busForm">
								<table>
									<tr>
										<td>Número de Placa:</td>
										<td>
											<form:input path="placa"/>
										</td>
									</tr>
									<tr>
										<td>Número Interno:</td>
										<td>
											<form:input path="numero"/>
										</td>
									</tr>
									<tr>
										<td>Fecha de Ingreso:</td>
										<td>
											<form:input path="fechaIngreso"/>
										</td>
									</tr>
									<tr>
										<td>Capacidad Total:</td>
										<td>
											<form:input path="capacidadTotal"/>
										</td>
									</tr>
									<tr>
										<td>Modelo</td>
										<td></td>
									</tr>
									<tr>
										<td>Características:</td>
										<td>
											<form:textarea path="caracteristicas"/>
										</td>
									</tr>
									
									<tr>
										<td colspan="2">
											<input type="submit" value="Registrar" />
										</td>
									</tr>
									
								
								</table>
							
							
							</form:form>
							
						</div>
					</div>
					Unidades
				</div>
			</div>
		</div>
		
	</body>
</html>