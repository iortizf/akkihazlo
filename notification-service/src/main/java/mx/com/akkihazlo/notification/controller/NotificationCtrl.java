package mx.com.akkihazlo.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.akkihazlo.notification.enums.ConfirmationType;
import mx.com.akkihazlo.notification.service.NotificationServiceImp;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/notification")
public class NotificationCtrl {
	
	@Autowired
	private NotificationServiceImp notificationServ;
	
	@PostMapping("/send/email/{email}/confirmation")
	public Mono<ResponseEntity<Void>> sendEmailConfirmation(@PathVariable String email) {
		System.out.println("Sending email confirmation to " + email);
		notificationServ.sendConfirmation(ConfirmationType.EMAIL, email);
		System.out.println("Email sent successfully");				
		return Mono.just(new ResponseEntity<Void>(HttpStatus.OK));
	}

}
