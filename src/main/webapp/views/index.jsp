<%@ page language="java"
         contentType="text/html; ISO-8859-1"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    Welcome to Spring Boot MVC Application !!

    <form action="addEmployee">
        Enter the id Number: <input type="text" name="eid"><br>
        Enter the FirstName: <input type="text" name="firstname"><br>
        Enter the LastName: <input type="text" name="lastname"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getEmployeeById">
        Enter the id Number: <input type="text" name="eid"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getEmployeeByFirstName">
        Enter the First Name: <input type="text" name="firstName"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getEmployeeByLastName">
        Enter the Last Name: <input type="text" name="lastName"><br>
        <input type="submit">
    </form>
    <hr>
</body>
</html>