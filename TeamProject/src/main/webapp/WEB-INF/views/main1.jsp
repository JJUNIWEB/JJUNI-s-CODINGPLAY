<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="https://kit.fontawesome.com/kit_code.js" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/cac1ec65f4.js" crossorigin="anonymous"></script>
    <!-- <script src="main.js" defer></script> -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

    <title>MAIN</title>
</head>

<body>
    <header>
        <nav class="navbar">

            <div class="navbar__logo">
                <a href="">with DANG</a>
            </div>

            <ul class="navbar__menu">
                <li><a href="main1.jsp">댕댕여지도</a></li>
                <li><a href="dangguen.jsp">댕근마켓</a></li>
                <li><a href="dangcare.jsp">댕댕케어</a></li>
                <li><a href="dangcomu.jsp">댕댕커뮤</a></li>
                <li><a href="dangoffice.jsp">댕사무소</a></li>
                <li><button class="btnLogin"><a href="login">login</a></button></li>

            </ul>
            <a href="#" class="navbar__toggleBtn">
                <i class="fas fa-bars" aria-hidden="true"></i>
            </a>
        </nav>
    </header>
    <section id="main">
        
        <div class="main-map">
            <p class="main-title"> 댕댕여지도</p>
            <a href="https://map.kakao.com/?urlX=505425&urlY=1111835&urlLevel=3&map_type=TYPE_MAP&map_hybrid=false" class="map" target="_blank"><img width="504" height="310" src="https://map2.daum.net/map/mapservice?FORMAT=PNG&SCALE=2.5&MX=505425&MY=1111835&S=0&IW=504&IH=310&LANG=0&COORDSTM=WCONGNAMUL&logo=kakao_logo" style="border:1px solid #ccc"></a>
        <p></p>
        </div>


    </section>




</body>

</html>