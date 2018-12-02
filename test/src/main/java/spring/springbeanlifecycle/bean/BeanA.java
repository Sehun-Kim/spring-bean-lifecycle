package spring.springbeanlifecycle.bean;

public class BeanA {
    public BeanA() {
        System.out.println("BeanA : 생성자");
    }

    public void init() {
        System.out.println("BeanA : init");
    }

    public void destroy() {
        System.out.println("BeanA : destroy");
    }
}
