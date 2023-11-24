package top.naccl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate相关的Bean配置
 *
 * @author: Naccl
 * @date: 2022-01-22
 */
@Configuration
public class RestTemplateConfig {

	/**
	 * 默认的RestTemplate
	 *
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


}