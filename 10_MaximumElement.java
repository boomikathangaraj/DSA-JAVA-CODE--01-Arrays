// Maximum Element
class MaximumElement {
    public static void main(String[] args) {
        int[] a = {8, 1, 4, 3};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
}
