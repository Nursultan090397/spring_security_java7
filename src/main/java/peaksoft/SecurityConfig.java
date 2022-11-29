/*
package peaksoft;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("osorov97@peaksoft.edu")
                        .password("nursultan")
                        .roles("Student")).


                withUser(userBuilder.username("esen@peaksoft.edu")
                        .password("esen")
                        .roles("Manager"))

                .withUser(userBuilder.username("ulan@peaksoft.edu")
                        .password("ulan")
                        .roles("Instructor, Manager"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").hasAnyRole("Student","Instructor","Manager")
                .antMatchers("/instructor-info").hasRole("Instructor")
                .antMatchers("/manager-info").hasRole("Manager")
                .and().formLogin().permitAll();

    }
}
*/

package peaksoft;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("Nursultan").password("1234").roles("Student"))
                .withUser(userBuilder.username("Batyrov").password("1234").roles("Manager"))
                .withUser(userBuilder.username("Esen").password("12345").roles("Instructor","Manager","Student"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").hasAnyRole("Student","Instructor","Manager")
                .antMatchers("/instructor-info").hasAnyRole("Instructor")
                .antMatchers("/manager-info").hasRole("Manager")
                .antMatchers("/student-info").hasRole("Student")
                .and().formLogin().permitAll();
    }
}
