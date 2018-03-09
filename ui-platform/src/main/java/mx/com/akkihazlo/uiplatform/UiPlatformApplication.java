package mx.com.akkihazlo.uiplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UiPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiPlatformApplication.class, args);
	}
}
