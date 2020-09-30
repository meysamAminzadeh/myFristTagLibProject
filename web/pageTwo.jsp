<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 5/21/2020
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ taglib prefix="wel" uri="/WEB-INF/meysamTag.tld" %>
<%--<%@ taglib prefix="td" uri="/WEB-INF/meysamTag.tld" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <%
           out.print(request.getParameter("name"));
           out.print(" ********************** ");
           out.print(request.getParameter("family"));
       %>
<br>
    <wel:welcome></wel:welcome>
<br>


    <%--<td:date></td:date>--%>
    <wel:date></wel:date>

       <br>

       <br>

       <wel:sum num1="20" num2="30">
            this is a tag lib with two parameters
        </wel:sum>

       <br>

      <%--<wel:sum num1="20">--%>

       <%--</wel:sum>--%>


</body>
</html>
