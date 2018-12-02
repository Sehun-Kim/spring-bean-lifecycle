package spring.springbeanlifecycle.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ComponentB {
    public ComponentB() {
        System.out.println("ComponentB : 생성자");
    }

    @PostConstruct
    public void init() {
        System.out.println("ComponentB : init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ComponentB : destroy");
    }
}
