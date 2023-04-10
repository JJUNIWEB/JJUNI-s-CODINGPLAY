<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/login1.css" />
    <script src="login.js"></script>
    <title>Login</title>
    <script
		  src="https://code.jquery.com/jquery-3.4.1.js"
		  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
		  crossorigin="anonymous">
	</script>  

</head>

<body>
    <div class="container">
        <div class="orangeBg">
            <div class="box signin">
                <h2>이미 계정이 있습니다.</h2>
                <button class="signinbtn">로그인</button>
            </div>
            <div class="box signup">
                <h2>Create An Account</h2>
                <button class="signupbtn">회원가입</button>
            </div>
        </div>
        <div class="form-box">
            <div class="form signinform">
                <form>
                    <h3>로그인</h3>
                    <input type="text" placeholder="Email">
                    <input type="password" placeholder="Password">
                    <input type="submit" value="Login">
                    <a href="#">forget password?</a>
                </form>
            </div>
            <div class="form signupform">
                <form id="join_form" method="post">
                    <h3>회원가입</h3>
                    <input type="text" name="user_name" placeholder="이름">
                    <input type="email" name="user_email" placeholder="Email">
                    <input type="password" id="pwd" name="user_pw" placeholder="Password">
                    <input type="password" id="pwd2" placeholder="Confirm Password">
                    <input type="button" class="btn" onclick="test()" value="가입하기">
                </form>
            </div>
        </div>
    </div>
    <div class="return-main"><a href="main.html">메인화면으로 돌아가기</a></div>
    <script>
        const signin = document.querySelector(".signinbtn");
        const signup = document.querySelector(".signupbtn");
        const formbox = document.querySelector(".form-box");
        const body = document.querySelector("body");
        signup.onclick = function(){
            formbox.classList.add("active")
            body.classList.add("active")
        }
        signin.onclick = function(){
            formbox.classList.remove("active")
            body.classList.remove("active")
        }
        
        $(document).ready(function(){
        	function test() {
    	      	var p1 = document.getElementById('pwd').value;
    	      	var p2 = document.getElementById('pwd2').value;
    	      	
    	      	if(p1.length < 6) {
    	              alert('입력한 글자가 6글자 이상이어야 합니다.');
    	              return "/login";
    	          }
    	      	
    	      	
    	      	if( p1 != p2 ) {
    	        alert("비밀번호가 일치 하지 않습니다");
    	        return false;
    	      } 
    	      	else{
    	        alert("비밀번호가 일치합니다");
    	        return true;
    	      }

        }
        	
        	//회원가입 버튼(회원가입 기능 작동)
        	$(".btn").click(function(){
        		$("#join_form").attr("action", "/withdang/main1");
        		$("#join_form").submit();
        	});
        });
        </script>
        
        <!-- <script type="text/javascript">
	    	
  		</script> -->
        
        <!-- <script type="text/javascript">
        /* 자바 스크립트 함수 선언(비밀번호 확인) */
		
    	function passConfirm() {
    	/* 비밀번호, 비밀번호 확인 입력창에 입력된 값을 비교해서 같다면 비밀번호 일치, 그렇지 않으면 불일치 라는 텍스트 출력.*/
    	/* document : 현재 문서를 의미함. 작성되고 있는 문서를 뜻함. */
    	/* getElementByID('아이디') : 아이디에 적힌 값을 가진 id의 value를 get을 해서 password 변수 넣기 */
    		var password = document.getElementById('user_pw');					//비밀번호 
    		var passwordConfirm = document.getElementById('passwordConfirm');	//비밀번호 확인 값
    		var confrimMsg = document.getElementById('confirmMsg');				//확인 메세지
    		var correctColor = "#00ff00";	//맞았을 때 출력되는 색깔.
    		var wrongColor ="#ff0000";	//틀렸을 때 출력되는 색깔
    		
    		if(user_pw.value == passwordConfirm.value){//password 변수의 값과 passwordConfirm 변수의 값과 동일하다.
    			confirmMsg.style.color = correctColor;/* span 태그의 ID(confirmMsg) 사용  */
    			confirmMsg.innerHTML ="비밀번호 일치";/* innerHTML : HTML 내부에 추가적인 내용을 넣을 때 사용하는 것. */
    		}else{
    			confirmMsg.style.color = wrongColor;
    			confirmMsg.innerHTML ="비밀번호 불일치";
    		}
    	}
        
        
    </script> -->
    
    
</body>

</html>