package mx.com.akkihazlo.user.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.akkihazlo.user.admin.dto.User;
import mx.com.akkihazlo.user.admin.service.UserAdminService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user/admin")
public class UserAdminCtrl {
	
	@Autowired
	private UserAdminService userAdminServ;
	
	@PostMapping("/add")
	public Mono<ResponseEntity<Void>> add(@RequestBody User user) {
		System.out.println("Adding user.. " + user.getUserName());
		
		userAdminServ.addUser(user);		
				
		return Mono.just(new ResponseEntity<Void>(HttpStatus.OK));
	}
}
