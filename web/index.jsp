<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 5/21/2020
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="mys" uri="/WEB-INF/meysamTag.tld" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <mys:meisam></mys:meisam>
      <br>

      <form action="pageTwo.jsp">
        <input type="text" name="name">
        <input type="text" name="family">
        <input type="submit">

      </form>

  </body>
</html>
