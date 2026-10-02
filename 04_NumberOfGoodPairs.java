// Number of Good Pairs
class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 3};
        int c = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c = c + 1;
                }
            }
        }

        System.out.println(c);
    }
}
