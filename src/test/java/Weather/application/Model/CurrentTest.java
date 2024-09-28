package Weather.application.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static reactor.core.publisher.Mono.when;

public class CurrentTest {

    @Test
    public void GettersandSetters(){
        Condition condition=new Condition("sometext");
        Current current= new Current(10.22,1,condition,50,50,25.6,56.6,56.6);
        Current current1= new Current();

        current1.settempc(12.2);
        current1.setisday(1);
        current1.setCondition(condition);
        current1.setHumidity(50);
        current1.setCloud(50);
        current1.setheatindexc(50.23);
        current1.setdewpointc(52.36);
        current1.setGust_kph(563.3);


        current1.gettempc();
        current1.getisday();
        current1.getCondition();
        current1.getHumidity();
        current1.getCloud();
        current1.getheatindexc();
        current1.getdewpointc();
        current1.getGust_kph();
    }

}