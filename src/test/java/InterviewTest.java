import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InterviewTest {

    @DataProvider
    public Object[][] foobar() {
        return new Object[][]{
                {"foo", 3},
                {"bar", 5},
                {"foobar", 15},
                {"13", 13},
                {"0", 0},
                {"foo", -3},
                {"bar", -5},
                {"foobar", -15},
                {"2147483647", Integer.MAX_VALUE},
                {"-2147483648", Integer.MIN_VALUE}
        };
    }

    @Test(dataProvider = "foobar")
    public void testFoobar(String expected, int num) {
        Interview task = new Interview();
        String actual = task.foobar(num);
        Assert.assertEquals(actual, expected);
    }

}