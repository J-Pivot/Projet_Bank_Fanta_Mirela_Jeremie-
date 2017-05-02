<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Suppression des clients </h1>
<form method="POST" action="SupprClient">
	
		<div>
			<label for="External_ID"> External ID </label>
			<input type="text" id="External_ID" name="External_ID" value="" size="30" maxlength="30" ></input>

			<input type="submit" value="Supprimer le compte" ></input>

		</div>
</body>
</html>