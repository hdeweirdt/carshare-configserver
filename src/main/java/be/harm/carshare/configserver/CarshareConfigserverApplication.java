package be.harm.carshare.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CarshareConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarshareConfigserverApplication.class, args);
    }

}
