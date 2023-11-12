package baekjoon.구현.셀프_넘버_4673;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            boolean found = false;
            for (int n = 1; n < 10000; n++) {
                int sum = 0;
                int tmp = n;
                while (tmp > 0) {
                    sum += tmp % 10;
                    tmp /= 10;
                }
                if (i == n + sum) {
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println(i);
        }
    }
}
