package com.comaniacs;

import java.util.ArrayList;
import java.util.List;
import org.springframework.lang.NonNull;
import model.Movie;
import model.MovieResult;
import model.Trailer;
import model.TrailerResult;
import networking.ApiClient;
import networking.WebService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DemoController {
	
	public void init() {
		String apiKey = "e73130e52d6a080b1c0dd07fdaffb1bf";
		ApiClient.getInstance().create(WebService.class)
		.getTrailers(287947, apiKey)
		.enqueue(new Callback<TrailerResult>() {
            @Override
            public void onResponse(@NonNull Call<TrailerResult> call, @NonNull Response<TrailerResult> response) {
//            	System.out.print(response.body().getTrailers());
            	List<Trailer> trailers = new ArrayList<>();
//            	test.addAll(response.body().getTrailers());
//        		test.forEach(value -> System.out.print(value));	
                trailers.addAll(response.body().getTrailers());
                System.out.println("Not Yet");
                trailers.forEach(value -> System.out.print("Values : "+value.getVideoKey()));
            }
      
            @Override
            public void onFailure(@NonNull Call<TrailerResult> call, @NonNull Throwable t) {
                call.cancel();
            }
        });
		
		 ApiClient.getInstance().create(WebService.class)
         .getMoviesByPreference("popular", apiKey)
         .enqueue(new Callback<MovieResult>() {
             @Override
             public void onResponse(@NonNull Call<MovieResult> call, @NonNull Response<MovieResult> response) {
            	 List<Movie> movies = new ArrayList<>();
            	 movies.addAll(response.body().getMovies());
            	 movies.forEach(value -> System.out.println(value.getOriginalTitle()));	
             }

             @Override
             public void onFailure(@NonNull Call<MovieResult> call, @NonNull Throwable t) {
                 call.cancel();
             }
         });
	}

	public List<Movie> nowPlaying() throws Exception {
		List<Movie> result= new ArrayList<>();
		String apiKey = "e73130e52d6a080b1c0dd07fdaffb1bf";
		ApiClient.getInstance().create(WebService.class)
        .getMoviesByPreference("popular", apiKey)
        .enqueue(new Callback<MovieResult>() {
            @Override
            public void onResponse(@NonNull Call<MovieResult> call, @NonNull Response<MovieResult> response) {
           	 result.addAll(response.body().getMovies());	
            }

            @Override
            public void onFailure(@NonNull Call<MovieResult> call, @NonNull Throwable t) {
                call.cancel();
            }
        });
		result.forEach(value -> System.out.println(value.getOriginalTitle()));
		return result;
	}
	
	public List<Trailer> addTrailers(int movieId) throws Exception {
		List<Trailer> result= new ArrayList<>();
		String apiKey = "e73130e52d6a080b1c0dd07fdaffb1bf";
		System.out.println(movieId);
		ApiClient.getInstance().create(WebService.class)
        .getTrailers(movieId, apiKey)
        .enqueue(new Callback<TrailerResult>() {
            @Override
            public void onResponse(@NonNull Call<TrailerResult> call, @NonNull Response<TrailerResult> response) {
           	 result.addAll(response.body().getTrailers());	
             }

            @Override
            public void onFailure(@NonNull Call<TrailerResult> call, @NonNull Throwable t) {
                call.cancel();
            }
        });
		
		return result;
	}
	
	
}
