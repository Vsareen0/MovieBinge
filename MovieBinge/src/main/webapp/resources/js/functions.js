/**
 * 
 */

/* Functions to get trailers based on id */
function playTrailer(id){
	var obj = [];
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {
        	 obj = JSON.parse(this.responseText);
        	 window.location.assign('http://www.youtube.com/watch?v='+obj.results[0].key);
         }
    }
	var url = "https://api.themoviedb.org/3/movie/"+id+"/videos?api_key=e73130e52d6a080b1c0dd07fdaffb1bf&language=en-US";
	xhttp.open("GET",url,true);
    xhttp.send();
}

