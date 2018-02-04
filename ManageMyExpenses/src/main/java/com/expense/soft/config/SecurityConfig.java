package com.expense.soft.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/","home").permitAll()
                .antMatchers("/admin/**").access("hasRole('ADMIN')")
                .antMatchers("/dba/**").access("hasAnyRole('ADMIN','DBA')")
                .and().formLogin()
                .and().exceptionHandling().accessDeniedPage("/Access_Denied");
    }
    @Autowired
    public void confiureGlobalSecurity(AuthenticationManagerBuilder auth){
        try {
            auth.inMemoryAuthentication().withUser("raj").password("password01").roles("USER");
            auth.inMemoryAuthentication().withUser("admin").password("password01").roles("ADMIN");
            auth.inMemoryAuthentication().withUser("dba").password("password01").roles("ADMIN","DBA");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
