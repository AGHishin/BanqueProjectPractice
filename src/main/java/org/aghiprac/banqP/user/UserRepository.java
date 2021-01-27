package org.aghiprac.banqP.user;

import org.aghiprac.banqP.entities.AppUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long>{
	public AppUser findByName(String name);
	public AppUser findByLogin(String login);
}
