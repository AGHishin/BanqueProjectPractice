package org.aghiprac.banqP.role;

import java.util.List;

import org.aghiprac.banqP.entities.AppRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleImplService implements RoleService{

	
	@Autowired
	private RoleRepository roleRepository;
	@Override
	public List<AppRole> getAllRole() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public AppRole getRoleById(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

	@Override
	public AppRole findByRoleName(String name) {
		// TODO Auto-generated method stub
		return roleRepository.findByName(name);
	}

	@Override
	public AppRole saveAppRole(AppRole appRole) {
		// TODO Auto-generated method stub
		AppRole role=roleRepository.findByName(appRole.getName());
		if(role!=null) throw new RuntimeException ("alredy exists");
		AppRole saveRole=new AppRole();
		saveRole.setName(appRole.getName());
		
		return roleRepository.save(saveRole);
	}

}
