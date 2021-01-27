package org.aghiprac.banqP.role;

import org.aghiprac.banqP.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<AppRole, Long> {
	public AppRole findByName(String name);
}
