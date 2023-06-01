//package com.FeatureFlip.Togglz.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//import java.net.URI;
//
//@Configuration
//public class WebConfig {
//
//    @Bean
//    public RouterFunction<ServerResponse> togglzConsoleRouter() {
//        return RouterFunctions.route()
//                .path("/togglz-console", builder -> builder
//                        .GET("", request -> ServerResponse.temporaryRedirect(URI.create("/togglz-console/index")).build())
//                        .resources("/**", new ClassPathResource("META-INF/resources/webjars/togglz-console/4.0.1/")))
//                .build();
//    }
//}
