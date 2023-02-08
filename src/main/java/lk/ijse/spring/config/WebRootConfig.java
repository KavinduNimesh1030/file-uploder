package lk.ijse.spring.config;

import lk.ijse.spring.service.StorageService;
import lk.ijse.spring.service.impl.StorageServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = {StorageService.class})
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


}
