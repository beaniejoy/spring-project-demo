package io.beaniejoy.bootapiserver.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
@RequiredArgsConstructor
public class MovieRepositoryImpl implements MovieRepository{

    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public void setMovie(String id, String movie) {
        redisTemplate.opsForValue().set(id, movie);
        redisTemplate.expire(id, 5, TimeUnit.SECONDS);
    }

    @Override
    public String getMovie(String id) {
        return (String) redisTemplate.opsForValue().get(id);
    }
}
