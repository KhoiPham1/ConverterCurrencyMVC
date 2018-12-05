<%--
  Created by IntelliJ IDEA.
  User: Quang
  Date: 12/5/2018
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Currency Converter</h1>
  <form action="converter" method="post">
    <p>USD: </p>
    <input type="text" name="usd" id="usd">
    <p>Rate: </p>
    <input type="text" name="rate" id="rate">

    <button type="submit">submit</button><br>
    <h1>VND: ${vnd}</h1>
  </form>

  </body>
</html>
