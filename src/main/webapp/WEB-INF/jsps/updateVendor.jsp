<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Vendor</title>
</head>
<body>
<form action="saveVendor" method="post">
<pre>
Id: <input type="text" name="id" value="${vendor.id}" readonly/>
Code: <input type="text" name="code" value="${vendor.code}"/>
Name: <input type="text" name="name" value="${vendor.name}"/>
<%-- Type: Urban <input type="radio" name="type" value="URBAN" ${vendor.type=='URBAN'?'checked':''}/>
      Rural <input type="radio" name="type" value="RURAL"${vendor.type=='URBAN'?'checked':''}/> --%>
Type: <select name="type" >
          <option ${vendor.type=='Regular'?'selected':''}>Regular</option>
          <option ${vendor.type=='Contract'?'selected':''}>Contract</option>
      </select>          

Email: <input type="text" name="email" value="${vendor.email}"/>
Phone: <input type="text" name="phone" value="${vendor.phone}"/>
<%-- Address: <input type="text" name="address" value="${vendor.address}"/> --%>
Address: <textarea rows="4" cols="50" name="address">${vendor.address}</textarea> 		 
      
		 <input type="submit" value="save"/>
</pre>
</form>

</body>
</html>