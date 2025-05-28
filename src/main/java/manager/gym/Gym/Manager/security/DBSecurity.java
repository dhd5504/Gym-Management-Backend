package manager.gym.Gym.Manager.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class DBSecurity   {
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return (web) -> web.ignoring().anyRequest();
    }
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.authorizeRequests((auth) -> auth.anyRequest().authenticated()).build();
//    }

}