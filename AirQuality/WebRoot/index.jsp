<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    			<table>
    						<tr  style="text-align: right;">
    							<td colspan="6"><a href="getDistrict">添加空气质量信息</a></td>
    						</tr>
    						<tr>
    								<td>序号</td>
    								<td>区域</td>
    								<td>监测时间</td>
    								<td>PM10数据</td>
    								<td>PM2.5数据</td>
    								<td>监测站</td>
    						</tr>
    							<c:forEach var="l" items="${list}">
    						<tr>
    							<td>${l.id}</td>
    							<td>${l.district.name }</td>
    							<td>${l.monitor_time}</td>
    							<td>${l.pm10}</td>
    							<td>${l.pm25}</td>
    							<td>${l.monitoring_station}</td>
    						</tr>
    					</c:forEach>
    			</table>
    		<a href="getAll?size=1">首页</a>|<a href="getAll?size=${size-1}">《上一页</a>|<a href="getAll?size=${size+1}">下一页》</a>|<a href="getAll?size=${pageNo}">尾页 </a>
    			第 ${size}/共${pageNo}页 (${count} 条)
  </body>
</html>
