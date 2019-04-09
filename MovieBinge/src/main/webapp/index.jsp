<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="UTF-8">
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.js" />"></script>
</head>
<body>
<div class="bg-grad">
<header>
	<nav>
		<a href="#"><span class="logo">movieBinge</span></a>
		<a href="#">Now Playing</a>
		<a href="#">Upcoming</a>
		<a href="#">Theaters</a>
		<span>
		<input type="search" >
		</span>	
		<a href="#" class="cred">Login</a>
		<a href="#" class="cred">Register</a>
	</nav>
</header>
<div class="container">
	<div class="movie-box">
		<short-lines class="shine"></short-lines>
		
		<title-lines class="shine"></title-lines>
		<title-lines class="shine"></title-lines>
		
		<desc-lines class="shine"></desc-lines>
		<desc-lines class="shine"></desc-lines>
		<desc-lines class="shine"></desc-lines>
		<desc-lines class="shine"></desc-lines>
		<desc-lines class="shine"></desc-lines>
		<desc-lines class="shine"></desc-lines>
		
		<span>
			<btn class="shine"></btn>
			<detail-lines class="shine"></detail-lines>
		</span>
		
	</div>
	<div class="posters">
		<div class="poster-1 shine">
		
		</div>
		<div class="poster-2 shine">
			<div class="play-btn">

			</div>
		</div>
	</div>
</div>

</div>

</body>
</html>