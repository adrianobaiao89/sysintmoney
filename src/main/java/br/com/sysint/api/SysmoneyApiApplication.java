package br.com.sysint.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.sysint.api.config.property.SysmoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(SysmoneyApiProperty.class)
public class SysmoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysmoneyApiApplication.class, args);
	}

}

