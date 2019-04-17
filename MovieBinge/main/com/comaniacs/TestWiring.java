package com.comaniacs;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Movie;
import model.Trailer;

@Controller
public class TestWiring 
{
	
	@RequestMapping(value="/movies",method=RequestMethod.GET)
	public String movies(Model model) throws Exception{
		DemoController dc = new DemoController();
		List<Movie> movies = dc.nowPlaying();
		model.addAttribute("movies",movies);
		model.addAttribute("msg","Vinamra");
		return "movies";
	}
	
	@RequestMapping("*")
	public String index(Model model) throws Exception {
		DemoController dc = new DemoController();
		List<Movie> movies = dc.nowPlaying();
		//int movieId = movies.get(0).getMovieId();
		//List<Trailer> trailers = dc.addTrailers(movieId);
		Thread.sleep(3000);
		model.addAttribute("movies",movies);
		//model.addAttribute("trailers", trailers);
		return "index";
		
	}
}
