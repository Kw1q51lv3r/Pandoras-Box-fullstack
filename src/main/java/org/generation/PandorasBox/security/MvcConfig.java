package org.generation.PandorasBox.security;

//This Class will implement the WebMvcConfigurer interface provided by Spring Boot
// Framework
//https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/config/annotation/WebMvcConfigurer.html

//This Class is to perform action on URL Routing and mapping when a HTTP request comes in
//E.g. if user key in localhost:8080 in the browser, browser will send a HTTP GET
// request to the server (back-end). The back-end will need to handle which HTML to
// response back to the browser (client) - index.html


import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.file.*;

@Configuration
public class MvcConfig  implements WebMvcConfigurer {

    @Value("${image.folder}")
    private String imageFolder; //now imageFolder variable the value = productimages


    public void addViewControllers(ViewControllerRegistry registry) {
        //Map the browser's URL to a specific View (HTML) inside resources/templates directory
        registry.addViewController("/").setViewName("homepage");
        registry.addViewController("/homepage").setViewName("homepage");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/product").setViewName("product");
        registry.addViewController("/formpage").setViewName("formpage");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static")
                .addResourceLocations("classpath:/static/")
                .setCachePeriod(0);


        Path uploadDir = Paths.get(imageFolder);
        String uploadPath = uploadDir.toFile().getAbsolutePath();

        registry.addResourceHandler("/" + imageFolder + "/**")
            .addResourceLocations("file:" + uploadPath + "/")
            .setCachePeriod(0);

    }
}
