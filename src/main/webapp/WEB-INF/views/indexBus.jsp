<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/include.jsp" %>
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
							Unidades
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-xs-12 wt-button-bar">
									<a class="btn btn-info" href="Unidades/Registrar">Nuevo</a>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<table class="table table-bordered table-responsive">
										<tr>
											<th>Placa</th>
											<th>Número</th>
											<th>Marca</th>
										</tr>
										<!-- Colocar aquí la data -->
									</table>
								</div>
							</div>
							
						</div>
					</div>
					Unidades
				</div>
			</div>
		</div>
		
	</body>
</html>