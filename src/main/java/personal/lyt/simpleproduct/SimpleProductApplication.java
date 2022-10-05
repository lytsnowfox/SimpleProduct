package personal.lyt.simpleproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SimpleProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProductApplication.class, args);
    }

}
