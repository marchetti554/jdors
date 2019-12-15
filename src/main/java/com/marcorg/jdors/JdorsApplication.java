/*
* Created by Marco Marchetti
*
* Created:	$ 15/12/2019
* Updated:	$ 15/12/2019
*/
package com.marcorg.jdors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * Spring Boot application main class.
 *
 * @author Marco Marchetti
 */
@SpringBootApplication
@EnableRedisRepositories
@EnableConfigurationProperties
public class JdorsApplication {

	/**
	 * Spring Boot main method in charge
	 * of initialize the application.
	 *
	 * @param args the arguments array
	 */
	public static void main(String[] args) {
		SpringApplication.run(JdorsApplication.class, args);
	}
}
