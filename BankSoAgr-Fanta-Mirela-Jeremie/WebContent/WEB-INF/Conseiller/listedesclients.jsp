<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>liste des clients</title>
</head>
<body>
<h1> liste des clients </h1>

<form method="POST" action="MesClients">
	
		<div>
			<label for="Advisor_ID"> External ID </label>
			<input type="text" id="Advisor_ID" name="Advisor_ID" value="" size="30" maxlength="30" ></input>

			<input type="submit" value="Valider" />
			
		</div>
</form>


</body>
</html>