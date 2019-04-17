package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "movies")
public class Movie implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
    private int rowId;
    @SerializedName("id")
    @Column(name = "movie_id")
    private int movieId;
    @SerializedName("original_title")
    @Column(name = "original_title")
    private String originalTitle;
    @SerializedName("release_date")
    @Column(name = "release_date")
    private Date releaseDate;
    @SerializedName("poster_path")
    @Column(name = "poster_path")
    private String posterUrl;
    @SerializedName("vote_average")
    @Column(name = "vote_average")
    private float voteAverage;
    @SerializedName("overview")
    private String overview;
    @SerializedName("backdrop_path")
    @Column(name = "backdrop_path")
    private String backdropPath;
    @Column(name = "criteria")
    private String criteria;

    public Movie(int movieId, String originalTitle, Date releaseDate, String posterUrl, float voteAverage,
                 String overview, String backdropPath, String criteria) {
        this.movieId = movieId;
        this.originalTitle = originalTitle;
        this.releaseDate = releaseDate;
        this.posterUrl = posterUrl;
        this.voteAverage = voteAverage;
        this.overview = overview;
        this.backdropPath = backdropPath;
        this.criteria = criteria;
    }

    public Movie(int rowId, int movieId, String originalTitle, Date releaseDate, String posterUrl, float voteAverage,
                 String overview, String backdropPath, String criteria) {
        this.rowId = rowId;
        this.movieId = movieId;
        this.originalTitle = originalTitle;
        this.releaseDate = releaseDate;
        this.posterUrl = posterUrl;
        this.voteAverage = voteAverage;
        this.overview = overview;
        this.backdropPath = backdropPath;
        this.criteria = criteria;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }
}
