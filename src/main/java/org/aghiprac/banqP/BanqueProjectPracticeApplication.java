package org.aghiprac.banqP;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BanqueProjectPracticeApplication {

//	@Autowired
//	BCryptPasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(BanqueProjectPracticeApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner start(UserService service,RoleService roleService) {
//		return args->{
//		roleService.saveAppRole(new AppRole(null,"TEST"));
//			roleService.saveAppRole(new AppRole(null,"USER"));
//			Stream.of("dev1","user1","testeur","admin").forEach(u->{
//				 
//				service.saveUser(new AppUser(u,u+"L",passwordEncoder.encode("1234")));
//			});
//			service.upAddRoleToUsers("testeurL", "TEST");
//		};
//	}


}
