import org.junit.Assert;
import org.junit.Test;
import sun.security.x509.OtherName;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSum(){
        //given
        Dice dice = new Dice(2);
        //when
        int actual = dice.tossAndSum();
        //then

        Assert.assertTrue(actual < 12 && actual >2);
    }

//    public void tossAndSumSeed(){
//        //given
//        Dice dice = new Dice(2, 5);
//
//        //then
//        int actual = dice.tossAndSumSeed();
//        //then
//        Assert.assertTrue(actual);
//    }


}