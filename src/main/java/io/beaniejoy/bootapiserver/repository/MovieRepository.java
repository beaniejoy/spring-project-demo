package io.beaniejoy.bootapiserver.repository;

public interface MovieRepository {

    void setMovie(String id, String movie);

    String getMovie(String id);
}
