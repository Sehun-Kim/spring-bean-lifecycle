package spring.ioc.dip;

public class Driver {
    public static void main(String[] args) {
        SoccerPlayer sp = new SoccerPlayer();

        // NikeSoccerBall
        SoccerBall nikeBall = new NikeSoccerBall();
        sp.setSoccerBall(nikeBall);
        sp.playSoccer();

        // AdidasSoccerBall
        SoccerBall adidasBall = new AdidasSoccerBall();
        sp.setSoccerBall(adidasBall);
        sp.playSoccer();
    }
}
