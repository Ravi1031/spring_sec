package org.rvsec.sec02.security;

import lombok.RequiredArgsConstructor;
import org.rvsec.sec02.entity.Authorities;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class GrantedAuthrorityWrapper implements GrantedAuthority {

    private final Authorities authorities;

    @Override
    public String getAuthority() {
        return authorities.getName();
    }
}
