package spring.springbeanlifecycle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.springbeanlifecycle.bean.BeanA;
import spring.springbeanlifecycle.bean.BeanB;
import spring.springbeanlifecycle.component.ComponentA;
import spring.springbeanlifecycle.component.ComponentB;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@RestController
public class DiController {

//    @Autowired
//    private BeanA beanA;
//
//    @Autowired
//    private BeanB beanB;
//
//    @Autowired
//    private ComponentA componentA;
//
//    @Autowired
//    private ComponentB componentB;

    public DiController() {
        System.out.println("DiController : 생성자");
    }

    @PostConstruct
    public void init() {
        System.out.println("DiController : init");
    }

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DiController : destroy");
    }
}
