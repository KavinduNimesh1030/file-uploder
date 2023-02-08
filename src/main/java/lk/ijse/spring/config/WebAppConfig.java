package lk.ijse.spring.config;

import lk.ijse.spring.controller.FileUploadController;
import lk.ijse.spring.controller.FileUploaderController;
import lk.ijse.spring.service.StorageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.annotation.MultipartConfig;

@Configuration
@ComponentScan(basePackageClasses = {FileUploadController.class})
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig");
    }


}
