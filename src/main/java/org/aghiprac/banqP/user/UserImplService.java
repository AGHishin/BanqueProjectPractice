package org.aghiprac.banqP.user;

import java.util.List;

import org.aghiprac.banqP.entities.AppRole;
import org.aghiprac.banqP.entities.AppUser;
import org.aghiprac.banqP.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserImplService implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	
	@Override
	public List<AppUser> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public AppUser getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public AppUser saveUser(AppUser user) {
		// TODO Auto-generated method stub
		AppUser userVerification=userRepository.findByLogin(user.getLogin());
		if(userVerification!=null) throw new RuntimeException("already exists");
		AppUser userSave=new AppUser();
		userSave.setName(user.getName());
		userSave.setLogin(user.getLogin());
		userSave.setPwd(passwordEncoder().encode(user.getPwd()));
		userSave.setListRoles(addRoleToUser(userSave.getLogin(), "USER"));
		userRepository.save(userSave);
		
		return userSave;
	}

	@Override
	public AppUser findByUserName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}

	@Override
	public AppUser findByUserLogin(String login) {
		// TODO Auto-generated method stub
		return userRepository.findByLogin(login);
	}

	@Override
	public List<AppRole> addRoleToUser(String userLogin, String roleName) {
		AppRole appRole= roleRepository.findByName(roleName);
		AppUser appUser=userRepository.findByLogin(userLogin);
		if (appUser==null) {
			appUser=new AppUser();
		}
		appUser.getListRoles().add(appRole);
		
		
		return appUser.getListRoles();
	}
	
	@Override
	public AppUser upAddRoleToUsers(String userLogin, String roleName) {
		AppRole appRole= roleRepository.findByName(roleName);
		AppUser appUser=userRepository.findByLogin(userLogin);
		if (appUser==null) {
			appUser=new AppUser();
		}
		appUser.getListRoles().add(appRole);
		appUser.setListRoles(appUser.getListRoles());
		
		return userRepository.save(appUser);
	}

	@Bean
	private BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	

}
