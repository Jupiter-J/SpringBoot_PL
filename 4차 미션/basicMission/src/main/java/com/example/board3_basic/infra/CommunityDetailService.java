package com.example.board3_basic.infra;

import com.example.board3_basic.community.entity.UserEntity;
import com.example.board3_basic.community.reposiotry.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommunityDetailService implements UserDetailsService {
    //userDetailServicce의 구현체

    private static final Logger logger = LoggerFactory.getLogger(CommunityDetailService.class);
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public CommunityDetailService(
            @Autowired UserRepository userRepository,
            @Autowired PasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        final UserEntity testUserEntity = new UserEntity();

        testUserEntity.setUsername("entity_user");
        testUserEntity.setPassword(passwordEncoder.encode("test1pass"));
        this.userRepository.save(testUserEntity);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final UserEntity userEntity = userRepository.findByUsername(username);

        return new User(username, userEntity.getPassword(), new ArrayList<>());
    }
}
