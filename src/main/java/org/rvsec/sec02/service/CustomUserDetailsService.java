package org.rvsec.sec02.service;

import lombok.RequiredArgsConstructor;
import org.rvsec.sec02.entity.User;
import org.rvsec.sec02.repository.UserRepository;
import org.rvsec.sec02.security.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username)  {
        Optional<User> userName = userRepository.findByUserName(username);
       return userName.map(CustomUserDetails::new)
                .orElseThrow(()-> new UsernameNotFoundException("The user does not exist " + username));
    }
}
