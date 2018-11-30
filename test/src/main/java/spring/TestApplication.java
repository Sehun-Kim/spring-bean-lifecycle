package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring-Boot 실행 시 진입 클래스
@SpringBootApplication
public class TestApplication {
    public static void main(String arg[]){
        SpringApplication.run(TestApplication.class, arg);
    }
}
