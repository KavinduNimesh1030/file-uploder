package lk.ijse.spring.config;

import lk.ijse.spring.controller.FileUploaderController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.annotation.MultipartConfig;

@Configuration
@ComponentScan(basePackageClasses = {FileUploaderController.class})
@EnableWebMvc
@MultipartConfig
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig");
    }

}
