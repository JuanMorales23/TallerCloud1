package co.com.poli.tallercloud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"co.com.poli.tallercloud1.repository"})
public class TallerCloud1Application {

    public static void main(String[] args) {
        SpringApplication.run(TallerCloud1Application.class, args);
    }

}
