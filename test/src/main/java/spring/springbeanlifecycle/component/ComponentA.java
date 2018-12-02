package spring.springbeanlifecycle.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ComponentA {
    public ComponentA() {
        System.out.println("ComponentA : 생성자");
    }

    @PostConstruct
    public void init() {
        System.out.println("ComponentA : init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ComponentA : destroy");
    }
}
