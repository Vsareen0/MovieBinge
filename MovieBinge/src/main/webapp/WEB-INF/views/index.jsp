<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="UTF-8">
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.js" />"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
</head>
<body>

<!-- First Division - [ Header, Current Movies ] -->
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

<!-- Shimmer Effect - [ Movie Description ] -->
<div class="container" id="container">
	 <!-- <div class="movie-box">
		<short-lines class="shine"></short-lines>
		<br/>
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
		
	</div> -->
	
	<c:forEach items="${movies}" var="movie" begin="0" end="0">
	    	<div class="movie-box-2" id="movie-box-2">
				<h2>${movie.originalTitle}</h2>
				<br>
				<p>${movie.overview}</p>
				 <br>
				 <span>
				 <button class="btn-grad">Book Now</button>
				 <a href="#">See Details</a>
				 </span>
			</div>
			<div class="posters-2" id="posters-2">
				<img src="http://image.tmdb.org/t/p/w500${movie.backdropPath}" class="poster-1">
				<img src="http://image.tmdb.org/t/p/w500${movie.posterUrl}" class="poster-2" width="350">
				<div class="play-btn-1" onclick="playTrailer(${movie.movieId})">
						<center><span>&#x1f3ac;</span></center>
				</div>
			</div>
	</c:forEach>
	
	<!-- Shimmer Effect - [ Movie Posters ] -->
	<!--  <div class="posters" id="posters">
		<div class="poster-1 shine">
		
		</div>
		<div class="poster-2 shine">
			<div class="play-btn">

			</div>
		</div>
				
	</div>
	-->
</div>

<div id="nav-container" class="nav-container"> 
	<div id="btns-mn">
		<center>
			<button class="btn" id="btn-left"><span>&#10092;</span></button>
			<button class="btn" id="btn-right"><span>&#10093;</span></button>
		</center>
	</div>
	</div>
	<div id="movies-navigator" class="movies-navigator"> 
        	<c:forEach items="${movies}" var="movie" begin="0" end="3" varStatus="i">
        		<div class="navs">
					<span class="nav-pseudo">${i.index+1}</span>
					<p class="nav-titles">${movie.originalTitle}</p>
				</div>
        	</c:forEach>
		</div>
</div>

</div>

<!-- Second Division - [ Now Playing ]--> 
<div id="now-playing">
	<h3 id="now-Playing-Title"><span>Now Playing</span></h3>
	<div class="movies-container" id="movies-container">
		
	</div>
</div>
</body>
<script src="<c:url value="/resources/js/functions.js" />"></script> 
</html>