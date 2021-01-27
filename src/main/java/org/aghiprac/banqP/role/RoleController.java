package org.aghiprac.banqP.role;

import java.util.List;

import org.aghiprac.banqP.entities.AppRole;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	
	
	@RequestMapping
	public List<AppRole> getAllRole() {
		return roleService.getAllRole();
	}

	public AppRole getRoleById(Long id) {
		return roleService.getRoleById(id);
	}

	public AppRole findByRoleName(String name) {
		return roleService.findByRoleName(name);
	}
	
	
}
