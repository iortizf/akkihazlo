package mx.com.akkihazlo.account.registry.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("mx.com.akkihazlo.account.registry.client")
public class AccountRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountRegistryServiceApplication.class, args);
	}
}
