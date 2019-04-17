/**
 * 
 */
var hello = function(){
	console.log("Work Done !");
	var message = "Hello World";
}


function addTrailer(id){
	var obj = [];
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {
        	 obj = JSON.parse(this.responseText);
        	 var res = [];
        	 for(var i=0;i<obj.results.length;i++){
        		 res.push(`<a href="http://www.youtube.com/watch?v=`+obj.results[i].key+`"><img src=http://img.youtube.com/vi/`+obj.results[i].key+`></a><br>`);
        	 }
        	 document.getElementById("trailers").innerHTML = res.join("");
         }
    }
	var url = "https://api.themoviedb.org/3/movie/"+id+"/videos?api_key=e73130e52d6a080b1c0dd07fdaffb1bf&language=en-US";
	xhttp.open("GET",url,true);
    xhttp.send();
}
    
/* Function to get movies currently playing in theaters */
function nowPlaying(){
	var test = "";
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {
             test = this.responseText;

             var obj = JSON.parse(test);
             
             var movies = [];
             for(var i=0;i<4;i++){
            	 movies[i] = obj.results[i];
             }
             
             var navigation=[];
             for(var i=0;i<4;i++){
            	 navigation.push(`<div class="navs">
            	 					<span class="nav-pseudo">`+(i+1)+`</span>
            	 					<span class="nav-titles">`+movies[i].title+`</span>
            	 				  </div>`);
             }
             
             var nav = `<div id="movies-navigator" class="movies-navigator"> 
            	 			`+navigation.join("")+`
						</div>`;
      
		    document.getElementById("nav-container").innerHTML = nav;
		  	addTrailer(movies[0].id);
		  	
             var mainMovies = [];
             for(var i=0;i<8;i++){
            	 mainMovies[i] = obj.results[i];
             }
             
             var movieBox = `<div class="movie-box-2" id="movie-box-2">
								<h2>`+movies[0].title+`</h2>
								<br>
								<p>`+movies[0].overview+`</p>
								 <br>
								 <span>
								 <button class="btn-grad">Book Tickets</button>
								 <a href="#">See Details</a>
								 </span>
							</div>
							<div class="posters-2" id="posters-2">
								<img src="http://image.tmdb.org/t/p/w500`+movies[0].backdrop_path+`" class="poster-1">
								<img src="http://image.tmdb.org/t/p/w500`+movies[0].poster_path+`" class="poster-2" width="350">
								<div class="play-btn-1" onclick="alert(playTrailer(`+movies[0].id+`))">
										<center><span>&#x1f3ac;</span></center>
								</div>
								<div id="trailers">
									
								</div> 
							</div>`;
             
         	var res = [];
             for(var i=0;i<8;i++){
            	 res.push(`<div id='movie-box' style="background: url('http://image.tmdb.org/t/p/w500`+mainMovies[i].poster_path+`');background-size: cover;">
							</div>`);
             }
             
             document.getElementById("container").innerHTML = movieBox;
             document.getElementById("posters-2").style.display="inline-block";
             document.getElementById("movie-box-2").style.display="inline-block";
             document.getElementById("movies-container").innerHTML = res.join("");
         }
    };
	var url = "https://api.themoviedb.org/3/movie/now_playing?api_key=e73130e52d6a080b1c0dd07fdaffb1bf&language=en-US&page=1";
    xhttp.open("GET",url,true);
    xhttp.send();
}



/* Function to get popular movies */
function popular(){
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {
             console.log(this.responseText);
         }
    };
	var url = "https://api.themoviedb.org/3/movie/popular?api_key=e73130e52d6a080b1c0dd07fdaffb1bf&language=en-US&page=1";
	xhttp.open("GET",url,true);
    xhttp.send();
}



/* Function to get upcoming movies */
function upcoming(){
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {
             console.log(this.responseText);
         }
    };
	var url = "https://api.themoviedb.org/3/movie/upcoming?api_key=e73130e52d6a080b1c0dd07fdaffb1bf&language=en-US&page=1";
	xhttp.open("GET",url,true);
    xhttp.send();
}



$(function(){
	nowPlaying();
});