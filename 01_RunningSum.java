// LeetCode 1480 - Running Sum of 1d Array
class RunningSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        for (int i = 1; i < a.length; i++) {
            a[i] = a[i] + a[i - 1];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
