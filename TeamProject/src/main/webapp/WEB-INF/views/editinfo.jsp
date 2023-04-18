<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 정보 수정</title>
</head>
<body>
	<form method="post" action="UpdateServlet" name="frm">
		<table align="center" width="600">
			<tr>
				<td colspan="2">My Page</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${member.user_name }"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value="${member.user_email }" readonly="readonly"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw" value="${member.user_pw }"></td>
			</tr>
			<tr>
				<td>닉네임</td>
				<td><input type="text" name="nickname" value="${member.user_nickname }"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><select name="gender">
						<c:choose>
							<c:when test="${loginUser.gender == 1}">
								<option value="1" selected="selected">Male</option>
								<option value="2">Female</option>
							</c:when>
							<c:otherwise>
								<option value="1">Male</option>
								<option value="2" selected="selected">Female</option>
							</c:otherwise>
						</c:choose>
				</select></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="text" name="phone" value="${loginUser.phone }"></td>
			</tr>
			<tr align="center">
			<td colspan="2"><input type="submit" value="modify"> &nbsp; <input type="reset" value="cancle"></td></tr>
		</table>
	</form>
</body>
</html>