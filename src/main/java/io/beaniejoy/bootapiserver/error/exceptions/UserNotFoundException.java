package io.beaniejoy.bootapiserver.error.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String content) {
        super(content);
    }
}
