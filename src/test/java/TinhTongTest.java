import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TongTest {
    @Test
    void TestTong_CaseBT() {
        int arr[] = {1, 2, 3, 4, 5};
        int result = Arrays.stream(arr).sum();
        int ex = 15;
        assertEquals(ex,result);
    }
    @Test
    void TestTong_CaseNull()
    {
        int arr[] = {};
        int result = Arrays.stream(arr).sum();
        int ex = 0;
        assertEquals(ex, result);
    }
    @Test
    void TestTong_1PT()
    {
        int arr[] = {7};
        int result = Arrays.stream(arr).sum();
        int ex = 7;
        assertEquals(result,ex);
    }
    @Test
    void TestTong_Am()
    {
        int arr[] = {-1,-2,-3,-4,-5};
        int result = Arrays.stream(arr).sum();
        int ex = -15;
        assertEquals(ex,result);
    }
    @Test
    void TestTong_AD()
    {
        int arr[] = {10,-1,-2,-3,-4,-5};
        int result = Arrays.stream(arr).sum();
        int ex = -5;
        assertEquals(ex, result);
    }
    @Test
    void TestTong_MangLon()
    {
        int arr[] = new int[1000000];
        Arrays.fill(arr,1);
        int result = Arrays.stream(arr).sum();
        int ex = 1000000;
        assertEquals(ex, result);
    }
}