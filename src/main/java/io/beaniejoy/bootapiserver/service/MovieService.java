package io.beaniejoy.bootapiserver.service;

import io.beaniejoy.bootapiserver.model.Movie;
import io.beaniejoy.bootapiserver.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public void setMovie(String id, String movie) {
        movieRepository.setMovie(id, movie);
    }

    public String getMovie(String id) {
        return movieRepository.getMovie(id);
    }
}
