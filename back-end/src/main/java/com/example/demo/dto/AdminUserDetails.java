package com.example.demo.dto;

import com.example.demo.mbg.TUsr;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class AdminUserDetails implements UserDetails {
    private TUsr tUsr;

    public AdminUserDetails(TUsr tUsr) {
        this.tUsr = tUsr;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
/*        return permissionList.stream()
                .filter(permission -> permission.getValue()!=null)
                .map(permission ->new SimpleGrantedAuthority(permission.getValue()))
                .collect(Collectors.toList());*/
        return null;
    }

    @Override
    public String getPassword() {
        return tUsr.getPassword();
    }

    @Override
    public String getUsername() {
        return tUsr.getUsrName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

