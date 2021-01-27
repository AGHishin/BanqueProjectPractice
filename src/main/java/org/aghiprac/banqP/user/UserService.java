package org.aghiprac.banqP.user;

import java.util.List;

import org.aghiprac.banqP.entities.AppRole;
import org.aghiprac.banqP.entities.AppUser;


public interface UserService {
	public List<AppUser> getAllUsers();
	public AppUser getUserById(Long id);
	public AppUser saveUser(AppUser user);
	public AppUser findByUserName(String name);
	public AppUser findByUserLogin(String login);
	public List<AppRole> addRoleToUser(String userLogin,String roleName);
	public AppUser upAddRoleToUsers(String userLogin, String roleName);

}
