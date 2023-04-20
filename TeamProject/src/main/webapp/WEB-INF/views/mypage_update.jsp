<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="loginout" value="${member==null ? 'Login' : 'Logout' }" />
<c:set var="loginoutlink" value="${member==null ? '/login' : '/logout' }" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/mypage.css">
    <script src="https://kit.fontawesome.com/cac1ec65f4.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
        integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"
        integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ"
        crossorigin="anonymous"></script>

    <title>마이페이지</title>
    <script
		  src="https://code.jquery.com/jquery-3.4.1.js"
		  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
		  crossorigin="anonymous">
	</script>  
    
</head>

<body>
    <header>
        <nav class="navbar">

            <div class="navbar__logo">
                <a href="/withdang">with DANG</a>
            </div>

            <ul class="navbar__menu">
                <li><a href="/withdang">댕댕여지도</a></li>
                <li><a href="/withdang/dangguen">댕근마켓</a></li>
                <li><a href="/withdang/dangcare">댕댕케어</a></li>
                <li><a href="/withdang/dangcomu">댕댕커뮤</a></li>
                <li><a href="/withdang/dangoffice">댕사무소</a></li>
                <c:if test="${ member != null }">
                	<li><a href="/withdang/mypage"><i class="fa fa-user-o" id="mypage" aria-hidden="true"></i></a></li>
                </c:if>
                <li><button class="btnLogin"><a href="<c:url value='${loginoutlink }' />">${loginout}</a></button></li>

            </ul>
            <a href="#" class="navbar__toggleBtn">
                <i class="fas fa-bars" aria-hidden="true"></i>
            </a>
        </nav>
    </header>
    <br>
    <section class="mypage">
        <div class="mypage__left">
            <div class="mypage__profile">
                <div>
                    <img src="resources/image/profile.png" alt="프로필사진">
                </div>
                <p>${member.user_nickname }님 안녕하세요</p>
                <a class="money" href="/withdang/money">댕근 머니 : 50,000</a>
                <br>
                <hr class="profile-line">
            </div>
            <div class="mypage__list">
                <ul>
                    <li><a href="/withdang/mypage">내 정보</a></li>
                    <li><a href="">강아지 정보</a></li>
                    <li><a href="/withdang/mypage_chat">채팅</a></li>
                    <li><a href="">판매 목록</a></li>
                    <li><a href="">찜 목록</a></li>
                </ul>
            </div>
        </div>
        
        <div class="mypage__mid">
        	<form id="update_form" method="post">
            <div class="mypage-user">
                <ul>
                    <p class="user-info"> 내 정보</p>
                    <div>이름 : <input name="user_name" value="${member.user_name }" readonly="readonly"></div>
                    <div>이메일 : <input name="user_email" value="${member.user_email }" readonly="readonly"></div>
                    <p>비밀번호 변경 : <input type="password" name="user_pw" value="${member.user_pw }"></p>
                    <p>비밀번호 확인 : <input type="password" name="user_pw2"></p>
                    <div><p>닉네임 : <input type="text" name="user_nickname" value="${member.user_nickname }"></p></div>
                    <div><p>연락처 : <input type="text" name="user_pnum" value="${member.user_pnum }"></p></div>
                    <div><p>생일 : <input type="date"></p></div>
                    <div><p>성별 : 여</p></div>
                    <div><p>주소 : <input></p></div>
                        
                </ul>
            </div>
        </div>
		</form>
		
        <div class="mypage__right">
        <form action="">
            <div class="mypage-dog">
                <ul>
                    <p class="dog-info">강아지 정보</p>
                    <p>이름 : <input></p>
                    <p>생일 : <input type="date"></p>
                    <p>성별 : <input type="radio">수컷<input type="radio">암컷</p>
                    <p>중성화 : <input type="radio">O<input type="radio">X</p>
                    <p>견종 : <input></p>
                    <p>동물등록번호 : <input> </p>
                    <p>주소 : <input></p>
                    <p>특징 : </p><textarea></textarea>
                    
                </ul>
            </div>
        </div>

        </div>
        </form>
    </section>
    <footer>
        <div class="mypage__update">
            <br>
            <input type="button" class="update_btn" value="수정하기">
        </div>
    </footer>
    <!-- <br><br><br><br> -->
    
    <script type="text/javascript">
    /* $(document).ready(function(){ */
    /* 회원 정보 수정 클릭 메서드 */
    $(".update_btn").click(function(){
    	
    	/* 로그인 메서드 서버 요청 */
        $("#update_form").attr("action", "/withdang/mypage_update");
        $("#update_form").submit(); 
        
    });
    </script>
</body>

</html>