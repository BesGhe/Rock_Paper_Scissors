package ghebrat.besrat.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private Player playa;


    @BeforeEach
    public void setUp(){
        playa = new Player("Bes", "You thought wrong!");
    }

    @Test
    @DisplayName("Taunt test")
    public void tauntTest(){
        String expected = "You thought wrong!";
        String actual = playa.taunt();

        Assertions.assertEquals(expected, actual);


    }



}
