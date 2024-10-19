package Weather.application.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionTest {

    @Test
    public void TestGettersandsetters(){
        Condition condition=new Condition("Sometext");

        Condition condition1=new Condition();

        condition1.setText("Malli some text");
        condition1.getText();
    }
}