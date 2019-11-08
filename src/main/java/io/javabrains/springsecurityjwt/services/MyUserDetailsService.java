package io.javabrains.springsecurityjwt.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		if(username.equals("admin"))
		{
			List<GrantedAuthority> grantedAuthorities = Arrays.asList(new SimpleGrantedAuthority("admin"), new SimpleGrantedAuthority("user"));
			return new User("admin","admin", grantedAuthorities);
		}
		List<GrantedAuthority> grantedAuthorities = Arrays.asList(new SimpleGrantedAuthority("user"));
		return new User("foo","foo", grantedAuthorities);
	}
}
