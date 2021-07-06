package io.beaniejoy.bootapiserver.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.beaniejoy.bootapiserver.model.Movie;
import io.beaniejoy.bootapiserver.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping("/movie")
    public void setMovie(@RequestBody Movie movie) throws JsonProcessingException {
        final ObjectMapper objectMapper = new ObjectMapper();
        movieService.setMovie(String.valueOf(movie.getId()), objectMapper.writeValueAsString(movie));
    }

    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable("id") String id) {
        return movieService.getMovie(id);
    }
}
