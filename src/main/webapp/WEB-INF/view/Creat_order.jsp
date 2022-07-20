<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create |Order </title>
</head>
<body>
<form action="saveOrder" method="post">
<pre>
OrderDate<input type="date" name="orderDate"/>
OrderStatus<input type="text" name="OrderStatus"/>
Collection Of Items<input type="text" name="collectionOfItems"/>
                   <input type="submit" value="save"/>

</pre>
</form>

<br>
${savemsg}
</body>
</html>