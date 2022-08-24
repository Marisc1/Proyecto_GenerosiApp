package com.GenerosiApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Autenticación del usuario
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("carlos")
                .password("{noop}123")
                .roles("ADMIN", "USER")
                .and()
                .withUser("allan")
                .password("{noop}456")
                .roles("ADMIN", "USER")
                .and()
                .withUser("mariana")
                .password("{noop}789")
                .roles("ADMIN", "USER")
                .and()
                .withUser("will")
                .password("{noop}321")
                .roles("USER");
    }

    // Autorización de los accesos
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/nuevo", "/guardar",
                        "/modificar/**", "/eliminar/**"
                //,
                //"/categoria/nuevo",       "/categoria/guardar",
                //"/categoria/modificar/**","/categoria/eliminar/**",
                //"/cliente/nuevo",         "/cliente/guardar",  
                //"/cliente/modificar/**",  "/cliente/eliminar/**",
                //"/usuario/listado",  
                //"/usuario/nuevo",         "/usuario/guardar",  
                //"/usuario/modificar/**",  "/usuario/eliminar/**"
                )
                .hasRole("ADMIN")
                //.antMatchers("/nuevo", "/guardar")
                //.hasAnyRole("USER")
                .antMatchers("/")
                .hasAnyRole("USER", "ADMIN")
                .and()
                .formLogin()
                .loginPage("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403");
    }

}
