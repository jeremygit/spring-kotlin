package com.example.Spring4

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

// ?
// inline fun
// reified
// @Bean
// @Autowired - specifically tell Spring to wire a class instance

class ServletInitializer : SpringBootServletInitializer() {

	override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		return application.sources(Spring4Application::class.java)
	}

}
