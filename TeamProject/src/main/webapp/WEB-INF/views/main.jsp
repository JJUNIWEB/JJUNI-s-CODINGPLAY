<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>위드댕</title>
    <link rel="stylesheet" href="resources/css/login.css">
    <link href="https://fonts.googleapis.com/css?family=Poppins:wght@200,300,400,500,600,700,800,900&display=swap" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.min.js" integrity="sha384-heAjqF+bCxXpCWLa6Zhcp4fu20XoNIA98ecBC1YkdXhszjoejr5y9Q77hIrv8R9i" crossorigin="anonymous"></script>
	  <script
		  src="https://code.jquery.com/jquery-3.4.1.js"
		  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
		  crossorigin="anonymous">
	</script>  
</head>
<body>
    <header>
        <h2 class="logo">With DANG</h2>
        <div class="navigation">
            <a href="main.jsp">댕댕여지도</a>
            <a href="dangguen.jsp" class="danggeun">댕근마켓</a>
            <a href="care.jsp" class="care">댕댕케어</a>
            <a href="community.jsp" class="community">댕댕커뮤</a>
            <a href="dangoffice.jsp" class="dangoffice">댕사무소</a>
            <button class="btnLogin-popup">Login</button>
        </div>
       
    </header>
<!--메인페이지를 해보겠읍니다.-->

    <img src="resources/img/Main.png" class="img-map" alt="...">
    
<!--로그인 팝업-->
    <div class="wrapper">
        <span class="icon-close">
            <ion-icon name="close"></ion-icon>
        </span>
        <div class="form-box login">
            <h2>로그인</h2>
            <form action="#" method="post">
                <div class="input-box">
                    <span class="icon">
                        <ion-icon name="mail"></ion-icon>
                    </span>
                    <input type="email" required>
                    <label>Email</label>
                </div>
                <div class="input-box">
                    <span class="icon">
                        <ion-icon name="lock-closed"></ion-icon>
                    </span>
                    <input type="password" required>
                    <label>Password</label>
                </div>
                <div class="remember-forgot">
                    <label><input type="checkbox">아이디 기억하기</label>
                    <a href="#">비밀번호 찾기</a>
                </div>
                <button type="submit" class="btn"><a href="main.jsp">로그인</a></button>
                <div class="login-register">
                    <p>회원이 아니신가요?<a href="#" class="register-link"> 회원가입</a></p>
                </div>
            </form>
        </div>
        <div class="form-box register">
            <h2>회원가입</h2>
            <form id="join_form" method="post">
                <div class="input-box">
                    <span class="icon">
                        <ion-icon name="mail"></ion-icon>
                    </span>
                    <input type="email" class="email_input" name="user_email" required id = "user_email">
                    <label>Email</label>
               	</div>
                	<span class="email_input_re_1">사용 가능한 이메일입니다.</span>
					<span class="emial_input_re_2">이메일이 이미 존재합니다.</span>
                
                <div class="input-box">
                    <span class="icon">
                        <ion-icon name="lock-closed"></ion-icon>
                    </span>
                    <input type="password" name="user_pw" required id = "user_pw">
                    <label>Password</label>
                </div>

                <div class="input-box">
                    <span class="icon">
                        <ion-icon name="person"></ion-icon>
                    </span>
                    <input type="text" name="user_name" required id = "user_name">
                    <label>이름</label>
                </div>

                <div class="input-box">
                    <span class="icon">
                        <ion-icon name="phone"></ion-icon>
                    </span>
                    <input type="tel" name="user_pnum" required id = "user_pnum">
                    <label>연락처</label>
                </div>
                <div class="remember-forgot">
                    <label><input type="checkbox">회원가입 약관에 동의합니다.</label>
                </div>
                <!-- <button type="submit" class="btn">회원가입</button> -->
                <input type="button" class="btn" value="회원가입"/>
                <div class="login-register">
                    <p>이미 회원이신가요?<a href="#" class="login-link"> Login</a></p>
                </div>
            </form>
        </div>
    </div>

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    <script>
        const wrapper = document.querySelector(".wrapper");
        const loginLink = document.querySelector(".login-link");
        const registerLink = document.querySelector(".register-link");
        const btnPopup = document.querySelector(".btnLogin-popup");
        const iconClose = document.querySelector(".icon-close");
        registerLink.addEventListener("click", ()=> {
            wrapper.classList.add("active");
        });
        loginLink.addEventListener("click", ()=> {
            wrapper.classList.remove("active");
        });
        btnPopup.addEventListener("click", ()=> {
            wrapper.classList.add("active-popup");
        });
        iconClose.addEventListener("click", ()=> {
            wrapper.classList.remove("active-popup");
        });
        </script>
        
        <script>

        $(document).ready(function(){
        	//회원가입 버튼(회원가입 기능 작동)
        	$(".btn").click(function(){
        		$("#join_form").attr("action", "/main");
        		$("#join_form").submit();
        	});
        });
        
      //아이디 중복검사
        $('.email_input').on("propertychange change keyup paste input", function(){

        	console.log("keyup 테스트");	

        });// function 종료

        </script>
        
    
</body>
</html>