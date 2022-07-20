<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create |Items </title>
</head>
<body>
<form action="saveItem" method="post">
<pre>
Order Id <input type="text" name="orderId"/>
Item Name <input type="text" name="itemName"/>
Item Unit Price<input type="text" name="itemUnitPrice"/>
Item Quantity <input type="text" name="itemQuantity"/>
                   <input type="submit" value="save"/>

</pre>
</form>

<br>
${savemsg1}
</body>
</html>