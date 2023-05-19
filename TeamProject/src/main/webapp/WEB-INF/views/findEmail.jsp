<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>이메일 찾기</title>
</head>
<body>
    <div class="form-label-group">
			<input class="btn btn-lg btn-secondary btn-block text-uppercase"
				type="submit" value="찾기">
		</div>

		<!-- 닉네임이 일치하지 않을 때-->
		<c:if test="${check == 1}">
			<p>닉네임이 없거나 일치하지 않습니다.</p>
			<span><a href="/withdang">메인화면으로 돌아가기</a></span>
			<span><a href="/withdang/find">다시 찾기</a></span>
		</c:if>

		<!-- 이름과 비밀번호가 일치 -->
		<c:if test="${check == 0 }">
		<p>찾으시는 이메일은' ${email}' 입니다.</p>
		<span><a href="/withdang">메인화면으로 돌아가기</a></span>
		<span><a href="/withdang/find">다시 찾기</a></span>
		</c:if>
</body>
</html>