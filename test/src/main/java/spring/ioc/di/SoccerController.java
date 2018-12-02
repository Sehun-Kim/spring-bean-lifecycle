package spring.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoccerController {
    @Autowired
    private SoccerPlayer soccerPlayer;

    @RequestMapping("/soccer")
    public String soccerDriver() {
        return soccerPlayer.playSoccer();
    }
}