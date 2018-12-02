package spring.springbeanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import spring.springbeanlifecycle.bean.BeanA;
import spring.springbeanlifecycle.bean.BeanB;

@Configuration // web.xml과 같은 역할
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean(name = "beanA", initMethod = "init", destroyMethod = "destroy")
    public BeanA getBeanA() {
        return new BeanA();
    }

    @Bean(name = "beanB", initMethod = "init", destroyMethod = "destroy")
    public BeanB getBeanB() {
        return new BeanB();
    }
}
