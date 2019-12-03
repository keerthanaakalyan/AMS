<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.errors{
    color: red;
    font-weight:bold;
}
</style>
</head>
<body>

<form:form method="POST" modelAttribute="userInfo" action="register">
	User Id:
			<form:input path="userId" />
		User Name :<form:input path="userName" />
			Password :<form:password path="password" />
			<form:errors path="password" cssClass="errors"></form:errors>
		
	<%-- 	<tr>
			<td>Gender :</td>
			<td><form:radiobutton path="gender" value="M" label="M" /> <form:radiobutton
				path="gender" value="F" label="F" /></td>
		</tr>
		<tr>
			<td>Country :</td>
			<td><form:select path="country">
				<form:option value="0" label="Select" />
				<form:options items="${countryList}" itemValue="countryId" itemLabel="countryName" />
			</form:select></td>
		</tr>
		<tr>
			<td>About you :</td>
			<td><form:textarea path="aboutYou" /></td>
		</tr>
		 <tr>
        <td>Community :</td>
        <td><form:checkboxes path="communityList" items="${communityList}" itemValue="key" itemLabel="value" /></td>
    </tr>
		<tr>
			<td></td>
			<td><form:checkbox path="mailingList"
				label="Would you like to join our mailinglist?" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Register"></td>
		</tr>
	</table> --%>
	<input type="submit" value="Register">
</form:form>

</body>
</html>