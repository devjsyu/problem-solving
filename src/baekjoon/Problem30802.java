package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem30802 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String next = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(next);

        int shirts = scanner.nextInt();
        int pens = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < 6; i++) {
            count += (Integer.parseInt(stringTokenizer.nextToken()) - 1 + shirts) / shirts;
        }

        System.out.println(count);
        System.out.println(num / pens + " " + num % pens);
    }
}
