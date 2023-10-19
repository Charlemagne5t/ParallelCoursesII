import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minNumberOfSemestersTest1() {
        int n = 4;
        int[][] relations = {
                {2, 1},
                {3, 1},
                {1, 4}
        };
        int k = 2;
        int expected = 3;
        int actual = new Solution().minNumberOfSemesters(n, relations, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minNumberOfSemestersTest2() {
        int n = 5;
        int[][] relations = {
                {2, 1},
                {3, 1},
                {4, 1},
                {1, 5}
        };
        int k = 2;
        int expected = 4;
        int actual = new Solution().minNumberOfSemesters(n, relations, k);

        Assert.assertEquals(expected, actual);
    }
}
