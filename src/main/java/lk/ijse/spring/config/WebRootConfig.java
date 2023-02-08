package lk.ijse.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
/*@ComponentScan(basePackageClasses = {CustomerServiceImpl.class})*/
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
