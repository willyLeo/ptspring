<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<%@ include file="/WEB-INF/views/libraries.jsp" %>
		<title>NUEVO CALIFORNIA S.A.</title>
	</head>
	<body id="body">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12 col-sm-3 col-lg-4"></div>
				<div class="col-xs-12 col-sm-6 col-lg-4">
					<div class="panel panel-default cus-login">
						<div class="panel-heading cus-panel-heading">
							<div class="row">
								<div class="col-xs-12">
									<img alt="" src="<c:url value="/resources/images/logo2.png"/>" class="img-responsive">
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									BIENVENIDO
								</div>
							</div>
						</div>
						
						<div class="panel-body">
							<form:form action="" method="" commandName="">
								<table>
									<tr>
										<td></td>
										<td>
											<form:input path="Username" cssClass="cus-input-login" id="Username" />
										</td>
									</tr>
									<tr>
										<td></td>
										<td>
											<form:password path="Password" cssClass="cus-input-login" id="Password" />
										</td>
									</tr>
									<tr>
										<td colspan="2">
											<form:button id="btnLogin" >
												Iniciar Sesión <i class="fas fa-sign-in-alt"></i>
											</form:button>
										</td>
									</tr>
								</table>
							</form:form>
							
							<!-- 
							<div class="row">
								<div class="col-xs-12">
									<input name="Username" id="Username" type="text" class="cus-input-login" placeholder="Ingrese su Usuario"/>
								</div>
							</div>
							
							<div class="row">
								<div class="col-xs-12">
									<input name="Password" id="Password" type="password" class="cus-input-login" placeholder="Ingrese su Contraseña"/>
								</div>
							</div>
							
							<div class="row">
								<div class="col-xs-12">
									<button name="btnLogin" id="btnLogin" class="cus-button-login">Iniciar Sesión <i class="fas fa-sign-in-alt"></i></button>
								</div>
							</div>
							 -->
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-3 col-lg-4"></div>
			</div>
		</div>
	</body>
</html>
