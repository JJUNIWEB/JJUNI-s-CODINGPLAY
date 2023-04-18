<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="loginout" value="${member==null ? 'Login' : 'Logout' }" />
<c:set var="loginoutlink" value="${member==null ? '/login' : '/logout' }" />
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/mypage.css">
    <script src="https://kit.fontawesome.com/kit_code.js" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/cac1ec65f4.js" crossorigin="anonymous"></script>
    <script src="resources/js/main.js" defer></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

    <title>마이페이지</title>
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
    
    <section class="mypage">
        <div class="mypage__left">
            <div class="mypage__profile">
                <div>
                    <img src="resources/image/profile.png" alt="프로필사진">
                </div>
                <br>
                <span>${member.user_nickname }님 안녕하세요</span>
                <span><a class="money" href="money.html">댕근 머니 : 50,000</a></span>
                <br>
                <hr class="profile-line">
            </div>
            <div class="mypage__list">
                <ul>
                    <!-- <li><a href="">내 정보</a></li> -->
                    <li><a href="">강아지 정보</a></li>
                    <li><a href="mypage_chat.html">채팅</a></li>
                    <li><a href="">판매 목록</a></li>
                    <li><a href="">찜 목록</a></li>
                </ul>
            </div>
        </div>
        <div class="mypage__right">
            <div class="mypage__select">
                <span>내 정보</span>
            </div>
            <div class="mypage__detail">
                <span>이름 ${member.user_name }</span>
                <span>이메일 ${member.user_email }</span>
                <span>닉네임 ${member.user_nickname }</span>
                <!-- <span>연락처 010-3333-3333</span>
                <span>생일 1999-09-19</span>
                <span>성별 여</span>
                <span>주소 서울시 용산구 ㅇㅇ동</span> -->
            </div>
            <div class="mypage__update">
                <a href="/withdang/editinfo">수정하기</a>
            </div>
        </div>
    </section>
    </body>
</html>
