package mx.com.akkihazlo.notification.service;

import org.springframework.stereotype.Service;

import mx.com.akkihazlo.notification.enums.ConfirmationType;
import mx.com.akkihazlo.notification.service.imp.NotificationService;

@Service("notificationServ")
public class NotificationServiceImp implements NotificationService {

	@Override
	public void sendConfirmation(ConfirmationType confirmType, String destination) {
		if(confirmType.equals(ConfirmationType.EMAIL)) {
			System.out.println("Sending confirmation code by email");
			System.out.println("Code 58551" );
			NotificationByEmail notificationEmail = new NotificationByEmail();
			notificationEmail.sendEmailConfirmation(destination);
		}
	}

}
