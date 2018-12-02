package spring.springbeanlifecycle.bean;

public class BeanB {
    public BeanB() {
        System.out.println("BeanB : 생성자");
    }

    public void init() {
        System.out.println("BeanB : init");
    }

    public void destroy() {
        System.out.println("BeanB : destroy");
    }
}
