<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'add.jsp' starting page</title>
  </head>
  
  <body>
   			<form action="insert" method="post">
   					<table>
   							<tr>
   								<td>添加空气质量信息</td>
   							</tr>
   							<tr>
   								
   								<td>监测区域:</td>
   								<td>
   									<select name="district_id">
   									<c:forEach var="d" items="${Dlist}">
   									<option value="${d.id}">${d.name}</option>
   									</c:forEach>
   								</select>
   								</td>
   							</tr>
   							<tr>
   								<td>监测日期:</td>
   								<td><input type="text" name="monitor_time" ></td>
   							</tr>
   							<tr>
   								<td>PM10值:</td>
   								<td><input type="text" name="pm10" ></td>
   							</tr>
   							<tr>
   								<td>pm25值:</td>
   								<td><input type="text" name="pm25" ></td>
   							</tr>
   							<tr>
   								<td>检测站:</td>
   								<td><input type="text" name="monitoring_station" ></td>
   							</tr>
   							<tr>
   								<td colspan="3"  style="text-align: right;"><input type="submit" value="保存" ><input type="reset" value="重置" ></td>
   							</tr>
   					</table>
   			</form>
  </body>
</html>
