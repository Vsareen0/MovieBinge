<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Demo</h2>
	<p>${msg}</p>
	<div class="container" id="container">
	 <c:forEach items="${movies}" var="movie" begin="0" end="0">
	    ${movie.originalTitle}<br>
			<div class="movie-box-2" id="movie-box-2">
				<h2>${movie.originalTitle}</h2>
				<br>
				<p>${movie.overview}</p>
				 <br>
				 <span>
				 <button class="btn-grad">Book Tickets</button>
				 <a href="#">See Details</a>
				 </span>
			</div>
			<div class="posters-2" id="posters-2">
				<img src="http://image.tmdb.org/t/p/w500${movie.backdropPath}" class="poster-1">
				<img src="http://image.tmdb.org/t/p/w500${movie.posterUrl}" class="poster-2" width="350">
				<div class="play-btn-1" onclick="alert(playTrailer(${movie.movieId}))">
						<center><span>&#x1f3ac;</span></center>
				</div>
				<div id="trailers">
					
				</div> 
			</div>
	</c:forEach>
	</div>
</body>
</html>