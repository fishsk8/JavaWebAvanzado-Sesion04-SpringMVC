<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">

		<h2>GRUPO</h2>
		<form:form method="POST" action="codigo/crear"
			modelAttribute="codigo">
			<div class="form-group">
				<form:label path="codigo" class="col-sm-2 col-form-label" >codigo</form:label>
				<form:input path="codigo" />
			</div>
			<div class="form-group">
				<form:label path="nombre" class="col-sm-2 col-form-label">nombre</form:label>
				<form:input path="nombre" />
			</div>
			<div class="form-group">
				<form:label path="descripcion" class="col-sm-2 col-form-label">descripcion</form:label>
				<form:textarea path="descripcion" rows="5" cols="30" />
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>

		<!-- Content here -->
	</div>
</body>
</html>