package io.beaniejoy.bootapiserver.service;

import io.beaniejoy.bootapiserver.error.exceptions.UserNotFoundException;
import io.beaniejoy.bootapiserver.mapper.UserRepository;
import io.beaniejoy.bootapiserver.model.RoleType;
import io.beaniejoy.bootapiserver.model.User;
import io.beaniejoy.bootapiserver.network.request.UserRegistrationRequestDto;
import io.beaniejoy.bootapiserver.network.response.UserResponseDto;
import io.beaniejoy.bootapiserver.security.JavaPasswordEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final JavaPasswordEncoder javaPasswordEncoder;

    public UserResponseDto singUp(UserRegistrationRequestDto resource) {

        // 이메일 검증
        if (userRepository.findByEmail(resource.getEmail()) != null) {
            throw new RuntimeException(resource.getUserName() + " 이미 존재하는 계정입니다.");
        }

        String salt = javaPasswordEncoder.generateSalt();
        String password = resource.getPassword();

        // 암호화된 password, salt, 기본 role -> User Entity insert
        User user = toUserEntity(
                resource,
                javaPasswordEncoder.encode(password, salt),
                RoleType.ROLE_USER,
                salt);

        userRepository.insert(user);

        return toUserResponse(user);
    }

    public UserResponseDto authenticate(String email, String password) {
        // email로 select
        User user = userRepository.findByEmail(email);

        if(user == null) {
            throw new UserNotFoundException("로그인 정보가 일치하지 않습니다.");
        }

        if (!javaPasswordEncoder.matches(password, user.getPassword(), user.getSalt())) {
            throw new UserNotFoundException("비밀번호가 일치하지 않습니다.");
        }

        return toUserResponse(user);
    }

    public List<UserResponseDto> findAll() {
        return null;
    }

    public UserResponseDto findById(Long id) {
        return null;
    }

    private User toUserEntity(UserRegistrationRequestDto resource,
                              String encodedPassword,
                              RoleType roleType,
                              String salt) {
        return new User(
                resource.getUserName(),
                resource.getEmail(),
                encodedPassword,
                resource.getAddress(),
                resource.getPhoneNumber(),
                resource.getSeller(),
                roleType,
                salt);
    }

    private UserResponseDto toUserResponse(User entity) {
        return new UserResponseDto(
                entity.getUserId(),
                entity.getUserName(),
                entity.getEmail(),
                entity.getAddress(),
                entity.getPhoneNumber(),
                entity.getSeller(),
                entity.getRoleType());
    }

}
