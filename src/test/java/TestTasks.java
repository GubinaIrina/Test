import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestTasks {

    @Test
    public void returnNum() {
        int[] nums = {0, 3, 5, 7, 13, 15, 20};
        System.out.println(new Tasks().returnNum(nums));
    }

    @Test
    public void returnLeapYear() {
        int yearStart = 2005;
        int yearEnd = 2030;
        new Tasks().returnLeapYear(yearStart, yearEnd);
    }

    @Test
    public void returnSortedArray() {
        Tasks tasks = new Tasks();
        int[] v = {0, 2, 2};
        int[] m = {1, 3};
        tasks.returnSortedArray(v, m);
    }

    @Test
    public void returnDuplicateNumbers() {
        Tasks tasks = new Tasks();
        int[] duplicate = {5, 10, 5, 3, 10, 10, 1};
        tasks.returnDuplicateNumbers(duplicate);
    }

    @Test
    public void toBinary() {
        System.out.println(new Tasks().toBinary(5));

    }

    @Test
    public void returnPositiveNum() {
        Tasks tasks = new Tasks();
        int[] arr = {-1, 2, 5, 10, -3, -11};
        tasks.returnPositiveNum(arr);
    }

    @Test
    public void testReturnSum() {
        Assert.assertEquals(new Tasks().returnSum(10, 0, 8), 164);
        Assert.assertEquals(new Tasks().returnSum(10, 10, 10), 200);
    }

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
    public void testNumBrieflyThree(int[] expected, int[] mass) {
        Tasks task = new Tasks();
        int[] actual = task.numBrieflyThree(mass);
        System.out.println(Arrays.toString(actual));
        Assert.assertEquals(actual, expected);
    }

}