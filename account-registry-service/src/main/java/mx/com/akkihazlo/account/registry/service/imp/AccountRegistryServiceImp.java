package mx.com.akkihazlo.account.registry.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.akkihazlo.account.registry.client.UserAdminServiceClient;
import mx.com.akkihazlo.account.registry.dto.AccountRegistry;
import mx.com.akkihazlo.account.registry.dto.User;
import mx.com.akkihazlo.account.registry.service.AccountRegistryService;

@Service("accountRegistry")
public class AccountRegistryServiceImp implements AccountRegistryService {
	
	@Autowired
	private UserAdminServiceClient userAdminClient;

	@Override
	public void addAccount(AccountRegistry accountReg) {
		System.out.println("Adding "+accountReg);
		User user = new User();
		user.setEmail(accountReg.getEmail());
		user.setPassword(accountReg.getPassword());
		user.setUserName(accountReg.getEmail());
		userAdminClient.addUser(user);
		System.out.println("Account added successfully");		
	}

}
