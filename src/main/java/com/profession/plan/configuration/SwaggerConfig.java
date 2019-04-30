/**
 * @Title: SwaggerConfig.java
 * @Package com.profession.plan.configuration
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年4月27日
 * @version V1.0
 */
package com.profession.plan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @ClassName: SwaggerConfig
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年4月27日
 *
 */
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.profession.plan.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("职业规划app端调用")
				.description("职业规划app端调用")
				.termsOfServiceUrl(null)
				.version("1.0")
				.build();
	}
}
