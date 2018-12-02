package spring.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerPlayer {
    @Autowired
    @Qualifier("nikeBall")
    private SoccerBall ball;

    public String playSoccer() {
        return "축구선수가 공을 찼다! \n" + this.ball.touchBall();
    }
}