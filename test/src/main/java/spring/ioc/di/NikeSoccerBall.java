package spring.ioc.di;

import org.springframework.stereotype.Component;

@Component("nikeBall")
public class NikeSoccerBall implements SoccerBall {
    public String touchBall() {
        return "나이키 축구공이 굴러간다!";
    }
}