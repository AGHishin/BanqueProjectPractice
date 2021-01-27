package org.aghiprac.banqP.user;

import java.util.ArrayList;
import java.util.Collection;

import org.aghiprac.banqP.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserService userService;
	@SuppressWarnings("unused")
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		AppUser user=userService.findByUserLogin(username);
		System.out.println(user.getLogin());
		if(user==null)throw new UsernameNotFoundException("invalid");
		Collection<GrantedAuthority> authorities=new ArrayList<>();
		user.getListRoles().forEach(r->{
			authorities.add(new SimpleGrantedAuthority(r.getName()));
		});
		return new User(user.getLogin(),user.getPwd(),authorities) ;
	}

}
