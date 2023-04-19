package com.zyq.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

//http://localhost:7722/doc.html
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                // 是否启用Swagger
                .enable(true)
                //分组名称
                .groupName("儿子琦琦")
                // 用来创建该API的基本信息，展示在文档的页面中（自定义展示的信息）
                .apiInfo(apiInfo())
                // 设置哪些接口暴露给Swagger展示
                .select()
                // 扫描所有有注解的api，用这种方式更灵活
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.zyq.controller"))
                // 扫描所有
                .apis(RequestHandlerSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo apiInfo() {

        String name = "WangDZz";
        String url = "";
        String email = "";

        Contact contact = new Contact(name, url, email);

        return new ApiInfoBuilder()
                .title("给猪看的接口说明")
                .description("部分接口说明")
                .termsOfServiceUrl("")
                .contact(contact)
                .version("v1.0")
                .build();
    }
}

