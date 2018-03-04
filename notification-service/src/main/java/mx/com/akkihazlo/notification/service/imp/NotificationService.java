package mx.com.akkihazlo.notification.service.imp;

import mx.com.akkihazlo.notification.enums.ConfirmationType;

public interface NotificationService {
	
	public void sendConfirmation(ConfirmationType confirmType, String detination);

}
