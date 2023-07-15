package com.rhyno.club.config;

import static springfox.documentation.builders.PathSelectors.regex;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Contain configurations details of swagger
 *
 * @author Ravikiran Govindareddy
 */

@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Rhyno Bike Community").apiInfo(apiInfo()).select()
				.paths(regex("/club/.*")).build().directModelSubstitute(XMLGregorianCalendar.class, MixIn.class);
	}

	public static interface MixIn {
		@JsonIgnore
		public void setYear(int year);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Rhyno REST APIs").description("Rhyno REST APIs")
				.termsOfServiceUrl("http://....").license("Rhyno Licensed").licenseUrl("")
				.version("1.0").build();
	}
}
