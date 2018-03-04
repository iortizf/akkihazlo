package mx.com.akkihazlo.user.admin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="notification-service")
public interface NotificationServiceClient {
	
	@PostMapping("/notification/send/email/{email}/confirmation")
	public void sendEmailConfirmation(@PathVariable("email") String email);
	
}
