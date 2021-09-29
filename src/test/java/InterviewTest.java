import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class InterviewTest {
    @DataProvider
    public Object[][] numBrieflyThree() {
        return new Object[][]{
                {new int[]{9, 3}, new int[]{0, 9, 3, 10, 5}},
                {new int[]{}, new int[]{}},
                {new int[]{}, new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}},
                {null, null}
        };
    }
    @Test(dataProvider = "numBrieflyThree")
    public void testNumBrieflyThree(int[] expected, int[] mass){
        Interview task = new Interview();
        int[] actual = task.numBrieflyThree(mass);
        System.out.println(Arrays.toString(actual));
        Assert.assertEquals(actual, expected);
    }

}