import java.util.*;

public class XxOoRr {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            long bin[] = new long[33];
            for (int i = 0; i < n; i++) {
                long x = a[i];
                int j = 32;
                while (x > 0) {
                    bin[j] = bin[j] + x % 2;
                    j--;
                    x = x / 2;
                }
            }
            long c = 0;
            for (int i = 0; i < 33; i++) {
                if (bin[i] % k == 0) {
                    c = c + bin[i] / k;
                } else {
                    c = c + bin[i] / k + 1;
                }
            }
            System.out.println(c);
            t--;
        }
    }
}