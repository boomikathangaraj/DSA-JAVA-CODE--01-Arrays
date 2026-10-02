// Move Zeroes to End
class MoveZeroes {
    static int[] moveZeroes(int[] a) {
        int n = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[n] = a[i];
                n++;
            }
        }

        while (n < a.length) {
            a[n] = 0;
            n++;
        }

        return a;
    }
}
