//package com.example.securitydemo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@EnableWebSecurity
//public class EmployeeSecurityConfig implements WebMvcConfigurer {
////
////    @Bean
////    public InMemoryUserDetailsManager userDetailsManager() {
////        UserDetails alex = User.builder().username("alex1").password("{noop}test123").roles("EMPLOYEE").build();
////        UserDetails manager = User.builder().username("manager1").password("{noop}test123").roles("MANAGER","EMPLOYEE").build();
////        UserDetails admin = User.builder().username("admin1").password("{noop}test123").roles("ADMIN","MANAGER","EMPLOYEE").build();
////
////        return new InMemoryUserDetailsManager(alex, manager, admin);
////    }
////
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http.authorizeHttpRequests(configurer ->
////                configurer
////                        .requestMatchers(HttpMethod.GET, "employees").hasRole("EMPLOYEE")
////                        .requestMatchers(HttpMethod.GET, "employees/**").hasRole("EMPLOYEE")
////                        .requestMatchers(HttpMethod.POST, "employees").hasRole("MANAGER")
////                        .requestMatchers(HttpMethod.DELETE, "employees/**").hasRole("ADMIN"));
////        http.httpBasic(Customizer.withDefaults());
////
////        http.csrf(AbstractHttpConfigurer::disable);
////
////        return http.build();
////    }
//
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http.authorizeHttpRequests(configurer ->
////                configurer
////                        .requestMatchers(HttpMethod.GET, "employees").hasRole("EMPLOYEE")
////                        .requestMatchers(HttpMethod.GET, "employees/**").hasRole("EMPLOYEE")
////                        .antMatchers(HttpMethod.POST, "/employees").hasRole("MANAGER") // Update the endpoint pattern and role
////                        .requestMatchers(HttpMethod.DELETE, "employees/**").hasRole("ADMIN"));
////        http.httpBasic(Customizer.withDefaults());
////
////        http.csrf(AbstractHttpConfigurer::disable);
////
////        return http.build();
////    }
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200")  // Replace with the origin of your Angular app
//                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Add the HTTP methods you require
//                .allowedHeaders("*")  // Add any specific headers you need to allow
//                .allowCredentials(true);  // Include this line if you need to support cookies or authentication headers
//    }
//}
