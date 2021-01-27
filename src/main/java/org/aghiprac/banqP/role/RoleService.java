package org.aghiprac.banqP.role;

import java.util.List;

import org.aghiprac.banqP.entities.AppRole;





public interface RoleService {
	
	public List<AppRole> getAllRole();
	public AppRole getRoleById(Long id);
	public AppRole findByRoleName(String name);
	public AppRole saveAppRole(AppRole appRole);
	
	
}
