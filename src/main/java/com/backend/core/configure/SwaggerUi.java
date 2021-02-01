package com.backend.core.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Sok Lina
 * Date     : 2/1/2021, 4:51 PM
 * Email    : lina.sok@prasac.com.kh
 */
@Configuration
@EnableSwagger2
public class SwaggerUi {
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Api Documentation Prasac BE")
                .description("Prasac API reference for developers")
                .termsOfServiceUrl("http://prasac.com.kh")
                .contact("HakSokhang.com.kh").license("test License")
                .licenseUrl("prasac.com.kh").version("1.0").build();
    }
}
