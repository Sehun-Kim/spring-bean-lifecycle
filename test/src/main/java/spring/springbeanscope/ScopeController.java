//package spring.springbeanscope;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/scopes")
//public class ScopeController {
//
//    @Autowired
//    SingleBean singleBean;
//
//    @Autowired
//    ProtoBean protoBean;
//
//    @RequestMapping("/single")
//    public String single() {
//        System.out.println("single => Singleton : " + singleBean.getName());
//        System.out.println("single => Prototype : " + protoBean.getName());
//        return "singleton";
//    }
//
//    @RequestMapping("/proto")
//    public String proto() {
//        System.out.println("proto => Singleton : " + singleBean.getName());
//        System.out.println("proto => Prototype : " + protoBean.getName());
//        return "prototype";
//    }
//
//}
