package networking;

import model.CastResult;
import model.MovieResult;
import model.ReviewResult;
import model.TrailerResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WebService {

    @GET("movie/{filter}")
    Call<MovieResult> getMoviesByPreference(@Path("filter") String filter, @Query("api_key") String apiKey);

    @GET("movie/{movie_id}/reviews")
    Call<ReviewResult> getReviews(@Path("movie_id") int movieId, @Query("api_key") String apiKey);

    @GET("movie/{movie_id}/casts")
    Call<CastResult> getCasts(@Path("movie_id") int movieId, @Query("api_key") String apiKey);

    @GET("movie/{movie_id}/videos")
    Call<TrailerResult> getTrailers(@Path("movie_id") int movieId, @Query("api_key") String apiKey);
}