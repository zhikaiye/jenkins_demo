import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {




    @Test
    public void case01(){
        System.out.println("aaa");
    }

    @Test
    public void case02(){
        Assert.assertEquals("a","a");
    }
}
