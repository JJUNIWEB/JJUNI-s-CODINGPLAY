<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="loginout" value="${sessionScope.member==null ? 'Login' : 'Logout' }" />
<c:set var="loginoutlink" value="${sessionScope.member==null ? '/login' : '/logout' }" />

<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script src="https://kit.fontawesome.com/cac1ec65f4.js" crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/resources/script/toggle.js" defer></script>
    <script src="${pageContext.request.contextPath}/resources/script/html2canvas.js"></script>
    <script src="${pageContext.request.contextPath}/resources/script/dangoffice.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Gaegu&family=Nanum+Gothic:wght@400;700;800&display=swap" rel="stylesheet">
	<script
		  src="https://code.jquery.com/jquery-3.4.1.js"
		  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
		  crossorigin="anonymous">
	</script>  
    <title>비밀번호 찾기</title>
</head>

<body>
<header>
    <nav class="navbar">

        <div class="navbar__logo">
            <a href="${pageContext.request.contextPath}/main">with DANG</a>
        </div>

        <ul class="navbar__menu">
            <li><a href="${pageContext.request.contextPath}/main">댕댕여지도</a></li>
            <li><a href="${pageContext.request.contextPath}/dangguen">댕근마켓</a></li>
            <li><a href="${pageContext.request.contextPath}/dangcare">댕댕케어</a></li>
            <li><a href="${pageContext.request.contextPath}/dangcomu/list">댕댕커뮤</a></li>
            <li><a href="${pageContext.request.contextPath}/dangoffice">댕사무소</a></li>
            <c:if test="${ member != null }">
                <li><a href="${pageContext.request.contextPath}/mypage"><i class="fa fa-user-o" id="btnMypage" aria-hidden="true"></i></a></li>
            </c:if>
            <li><button class="btnLogin"><a href="<c:url value='${loginoutlink }' />">${loginout}</a></button></li>

        </ul>

        <a href="#" class="navbar__toggleBtn">
            <i class="fas fa-bars" aria-hidden="true"></i>
        </a>
    </nav>
</header>
		<!-- 입력한 정보가 일치하지 않을 때-->
		<c:if test="${check == 1}">
			<p>입력하신 정보가 없거나 일치하지 않습니다.</p>
			<span><a href="/withdang/login">로그인으로 돌아가기</a></span> |
			<span><a href="/withdang/pwdFind">다시 찾기</a></span>
		</c:if>
	<form id="pwChangeFrm" method="post">
		<!-- 입력한 정보 일치 -->
		<c:if test="${check == 0 }">
		<p>비밀번호 변경</p>
		<input type="hidden" name="user_email" value="${member.user_email }">
		<input type="hidden" name="user_name" value="${member.user_name }">
		<input type="hidden" name="user_nickname" value="${member.user_nickname }">
		<input type="password" class="input_pw" name="user_pw" placeholder="비밀번호를 입력해주세요">
		<input type="password" class="input_pwck" placeholder="비밀번호 확인을 입력해주세요">
		<span class="pwck_input_re_1">비밀번호가 일치합니다.</span>
        <span class="pwck_input_re_2">비밀번호가 일치하지 않습니다.</span>
		<span><a href="/withdang/login">로그인으로 돌아가기</a></span> |
		<span><a href="/withdang/pwdFind">다시 찾기</a></span>
		</c:if>
    </form>
    <button type="button" class="btn" value="">변경</button>
    
    <script type="text/javascript">
    	var pwckcorCheck = false;        // 비번 확인 일치 확인
    	
    	$(document).ready(function() {
			$(".btn").click(function() {
				
				if(pwckcorCheck) {
				
				$("#pwChangeFrm").attr("action", "/withdang/pwUpdate");
	      		$("#pwChangeFrm").submit();
	      		alert("비밀번호 변경이 완료되었습니다.")
				}
				
				return false;
				
			});
		});
    	
    	/* 비밀번호 확인 일치 유효성 검사 */
        
       	$('.input_pwck').on("propertychange change keyup paste input", function(){
       	        
       		var pw = $('.input_pw').val();
       	    var pwck = $('.input_pwck').val();
       	    $('.final_pwck_ck').css('display', 'none');
       	    
       	 	if(pw == pwck){
             	$('.pwck_input_re_1').css('display','block');
             	$('.pwck_input_re_2').css('display','none');
             	pwckcorCheck = true;
         	}else{
            	$('.pwck_input_re_1').css('display','none');
             	$('.pwck_input_re_2').css('display','block');
             	pwckcorCheck = false;
         }        
       	    
       	});
    </script>
</body>
</html>