//package spring.springbeanscope;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class WebConfigTwo {
//    @Bean(name = "singleBean")
//    public SingleBean singleBean() {
//        SingleBean singleBean = new SingleBean();
//        singleBean.setName("SingleBean");
//        return singleBean;
//    }
//
//    @Bean(name = "protoBean")
//    @Scope("prototype")
//    public ProtoBean protoBean() {
//        ProtoBean protoBean = new ProtoBean();
//        protoBean.setName("ProtoType");
//        return protoBean;
//    }
//}
