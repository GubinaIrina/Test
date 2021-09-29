import org.testng.Assert;
import org.testng.annotations.Test;

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
}