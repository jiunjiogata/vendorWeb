<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Vendors</h2>
    <table>
	    <tr>
	        <th>id</th>
	        <th>code</th>
	        <th>name</th>
	        <th>type</th>
	        <th>address</th>
	        <th>email</th>
	        <th>phone</th>
	    </tr>
	    <c:forEach items="${vendors}" var="vendor">
			<tr>
		        <td>${vendor.id}</td>
		        <td>${vendor.code}</td>
		        <td>${vendor.name}</td>
		        <td>${vendor.type}</td>
				<td>${vendor.address}</td>
		        <td>${vendor.email}</td>
		        <td>${vendor.phone}</td>        
				<td><a href="deleteVendor?id=${vendor.id}">delete</a></td>
			    <td><a href="showUpdateVendor?id=${vendor.id}">edit</a></td>
			</tr>
    	</c:forEach>
    </table>
    <a href="showCreateVendor">Add Vendor</a>
</body>
</html>