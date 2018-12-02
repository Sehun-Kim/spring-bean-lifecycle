package spring.ioc.dip;

public class SoccerPlayer {
    private SoccerBall ball;

    public void setSoccerBall(SoccerBall ball) {
        this.ball = ball;
    }

    public void playSoccer() {
        System.out.println("축구선수가 공을 찼다!");
        this.ball.touchBall();
    }
}