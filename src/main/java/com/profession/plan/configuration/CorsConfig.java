/**
 * @Title: CorsConfig.java
 * @Package com.profession.plan.configuration
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月15日
 * @version V1.0
 */
package com.profession.plan.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName: CorsConfig
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月15日
 *
 */
@Configuration  
public class CorsConfig extends WebMvcConfigurerAdapter {  
 
    @Override  
    public void addCorsMappings(CorsRegistry registry) {  
        registry.addMapping("/**")  
                .allowedOrigins("*")  
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT")  
                .maxAge(3600);  
    }  
 
}  
