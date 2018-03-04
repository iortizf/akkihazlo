package mx.com.akkihazlo.account.registry.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import mx.com.akkihazlo.account.registry.dto.User;

@FeignClient(name="user-admin-service")
public interface UserAdminServiceClient {
	
	@PostMapping("/user/admin/add")
	public void addUser(@RequestBody User user);
	
}
