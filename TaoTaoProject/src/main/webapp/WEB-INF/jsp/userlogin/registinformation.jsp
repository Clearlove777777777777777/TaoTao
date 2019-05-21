<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>用户注册</title>
	<jsp:include page="../commons/style.jsp"></jsp:include>
</head>
<body>
	<!-- 顶部导航 start -->
	<jsp:include page="../commons/dingbu.jsp"></jsp:include>
	<!-- 顶部导航 end -->
	
	<div style="clear:both;"></div>

	<!-- 页面头部 start -->
	<jsp:include page="../commons/head.jsp"></jsp:include>
	<!-- 页面头部 end -->
	
	<!-- 注册主体部分start -->
	<div class="login w990 bc mt10 regist">
		<div class="login_hd">
			<h2>用户注册</h2>
			<b></b>
		</div>
		<div class="login_bd">
			<div class="login_form fl">
				<form action="<%=request.getContextPath()%>/userlogin/doregistinformation" method="post">
					<ul>
						<%-- <li>
							<label for="">手机号：</label>
							<input type="text" class="txt" name="tel" />
							<p>18位数字手机号</p>
						</li>
						<li>
							<label for="">验证码：</label>
							<input type="text" class="txt" name="code" />
							<p>6位数字</p>
							<a href="<%=request.getContextPath()%>/userlogin/code">获取验证码</a>
						</li> --%>
						<li>
							${result }
						</li>
						<li>
							<label for="">tel：</label>
							<input type="text" class="txt" name="tel"/>
							<p>英文或者汉字</p>
						</li>
						<li>
							<label for="">昵称：</label>
							<input type="text" class="txt" name="name" />
							<p>英文或者汉字</p>
						</li>
						<li>
							<label for="">密码：</label>
							<input type="password" class="txt" name="password" />
							<p>6-20位字符，可使用字母、数字和符号的组合，不建议使用纯数字、纯字母、纯符号</p>
						</li>
						<li>
							<label for="">确认密码：</label>
							<input type="password" class="txt" name="confirmpassword" />
							<p> <span>请再次输入密码</p>
						</li>
						<!-- <li class="checkcode">
							<label for="">验证码：</label>
							<input type="text"  name="checkcode" />
							<img src="images/checkcode1.jpg" alt="" />
							<span>看不清？<a href="">换一张</a></span>
						</li> -->
						<li>
							<label for="">&nbsp;</label>
							<input type="checkbox" class="chb" checked="checked" /> 我已阅读并同意《用户注册协议》
						</li>
						<li>
							<label for="">&nbsp;</label>
							<input type="submit" value="" class="login_btn" />
						</li>
					</ul>
				</form>

				
			</div>
			
			<!-- <div class="mobile fl">
				<h3>手机快速注册</h3>			
				<p>中国大陆手机用户，编辑短信 “<strong>XX</strong>”发送到：</p>
				<p><strong>1069099988</strong></p>
			</div> -->

		</div>
	</div>
	<!-- 注册主体部分end -->

	<div style="clear:both;"></div>
	<!-- 底部版权 start -->
	<jsp:include page="../commons/footer.jsp"></jsp:include>
	<!-- 底部版权 end -->

</body>
</html>