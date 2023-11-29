package vn.edu.iuh.fit.www_lab_week_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan("vn.edu.iuh.fit.www_lab_week_5.backend.models")
public class WwwLabWeek5Application {

    public static void main(String[] args) {
        SpringApplication.run(WwwLabWeek5Application.class, args);
    }

}
