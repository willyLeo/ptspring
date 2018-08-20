<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/include.jsp" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@ include file="/WEB-INF/views/libraries.jsp" %>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Socios</title>
	</head>
	<body>
	
		<%@ include file="/WEB-INF/views/indexpanel.jsp" %>
		
		<div id="page-wrapper" class="">
			<div class="row">
				<div class="col-xs-12">
					<div class="panel panel-default">
						<div class="panel-heading wt-panel-heading">
							Registrar Socio
						</div>
						<div class="panel-body">
							
							<form:form action="registrarEmpleado" method="post" commandName="empleadoForm">
								<table>
									<tr>
										<td>Nombres:</td>
										<td>
											<form:input path="nombres"/>
										</td>
									</tr>
									<tr>
										<td>Apellido Paterno:</td>
										<td>
											<form:input path="apellidoPaterno"/>
										</td>
									</tr>
									<tr>
										<td>Apellido Materno:</td>
										<td>
											<form:input path="apellidoMaterno"/>
										</td>
									</tr>
									<tr>
										<td>DNI:</td>
										<td>
											<form:input path="dni"/>
										</td>
									</tr>
									<tr>
										<td>Razón Social:</td>
										<td>
											<form:input path="razonSocial"/>
										</td>
									</tr>
									
									
									<tr>
										<td>RUC:</td>
										<td>
											<form:input path="razonSocial"/>
										</td>
									</tr>
									<tr>
										<td>Teléfono:</td>
										<td>
											<form:input path="razonSocial"/>
										</td>
									</tr>
									<tr>
										<td>Dirección:</td>
										<td>
											<form:textarea path="direccion"/>
										</td>
									</tr>
									<tr>
										<td>Email:</td>
										<td>
											<form:input path="email"/>
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