package mx.com.akkihazlo.account.registry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.akkihazlo.account.registry.dto.AccountRegistry;
import mx.com.akkihazlo.account.registry.service.AccountRegistryService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account/registry")
public class AccountRegistryCtrl {
	
	@Autowired
	private AccountRegistryService accountRegistry;
	
	@PostMapping("/add")
	public Mono<ResponseEntity<Void>> add(@RequestBody AccountRegistry accountReg) {
		System.out.println("Adding account.. ");
		System.out.println("Invoking notification service to confirm the email " + accountReg.getEmail());
		try {
			
		} catch (Exception e) {
			System.out.println("AccountRegistryCtrl.add()"+ e.getMessage());
		}
		accountRegistry.addAccount(accountReg);
		System.out.println("Account added succesfully!");
		return Mono.just(new ResponseEntity<Void>(HttpStatus.OK));
	}

}
