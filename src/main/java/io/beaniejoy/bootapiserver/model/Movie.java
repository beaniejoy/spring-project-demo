package io.beaniejoy.bootapiserver.model;

public class Movie {

    private Long id;
    private String movieName;
    private String result;

    public Movie() {
    }

    public Movie(Long id, String movieName, String result) {
        this.id = id;
        this.movieName = movieName;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getResult() {
        return result;
    }
}
