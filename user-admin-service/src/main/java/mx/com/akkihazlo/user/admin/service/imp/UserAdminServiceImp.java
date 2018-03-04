package mx.com.akkihazlo.user.admin.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.akkihazlo.user.admin.client.NotificationServiceClient;
import mx.com.akkihazlo.user.admin.dto.User;
import mx.com.akkihazlo.user.admin.service.UserAdminService;

@Service("userAdminServ")
public class UserAdminServiceImp implements UserAdminService {
	
	@Autowired
	private NotificationServiceClient notificationServiceClient;

	@Override
	public void addUser(User user) {
		System.out.println("Adding user "+user.getUserName());
		notificationServiceClient.sendEmailConfirmation(user.getEmail());		
	}

}
