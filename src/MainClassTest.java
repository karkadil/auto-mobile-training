import org.junit.Assert;
import org.junit.Test;

public class MainClassTest{

    @Test
    public void testGetLocalNumber(){
        MainClass cls = new MainClass();
        int retVal = cls.getLocalNumber();
        Assert.assertEquals("Incorrect return value for getLocalNumber method", 14, retVal);
    }

    @Test
    public void testGetClassNumber(){
        MainClass cls = new MainClass();
        int retVal = cls.getClassNumber();
        Assert.assertTrue("Number returned from getClassNumber should be more than 45\nActual value: " + retVal, retVal > 45);
    }

    @Test
    public void testGetClassString(){
        MainClass cls = new MainClass();
        String retVal = cls.getClassString();
        Assert.assertTrue("getClassString return value must contain either 'hello' or 'Hello'\nActual value: " + retVal, retVal.matches(".*[Hh]ello.*"));
    }
}
