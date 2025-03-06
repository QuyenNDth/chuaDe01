public class TinhTong {
    public static int sumArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Mang khong duoc trong");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
