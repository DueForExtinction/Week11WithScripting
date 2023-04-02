/**
 * 
 */
package week11.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import week11.bean.Player;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Apr 2, 2023
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Player player() {
		Player bean = new Player() ;
		return bean;
	}
}
