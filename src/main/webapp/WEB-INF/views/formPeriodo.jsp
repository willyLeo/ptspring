<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/include.jsp" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@ include file="/WEB-INF/views/libraries.jsp" %>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Periodos</title>
	</head>
	<body>
	
		<%@ include file="/WEB-INF/views/indexpanel.jsp" %>
		
		<div id="page-wrapper" class="">
			<div class="row">
				<div class="col-xs-12">
					<div class="panel panel-default">
						<div class="panel-heading wt-panel-heading">
							Registrar Periodo
						</div>
						<div class="panel-body">
							
							<form:form action="registrarPeriodo" method="post" commandName="periodoForm">
								<table>
									<tr>
										<td>Periodo:</td>
										<td>
											<form:input path="periodo"/>
										</td>
									</tr>
									<tr>
										<td>Inicio:</td>
										<td>
											<form:input path="fechaInicio"/>
										</td>
									</tr>
									<tr>
										<td>Fin:</td>
										<td>
											<form:input path="fechaFin"/>
										</td>
									</tr>
									<tr>
										<td>Anotaciones:</td>
										<td>
											<form:textarea path="anotaciones"/>
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