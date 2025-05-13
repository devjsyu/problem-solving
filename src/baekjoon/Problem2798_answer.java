package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem2798_answer {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        // 브루트포스 탐색
        int answer = bruteforce(N, M, arr);

        // 출력 하기
        System.out.println(answer);
    }

    // 모든 경우의 수 3중 for-loop으로 탐색 (단, 도중 조건 미충족시 즉시 다음 loop로 진행)
    static int bruteforce(int N, int M, int[] arr) {
        int temp = 0;
        for (int i = 0; i < N - 2; i++) {
            if (arr[i] > M) continue;
            for (int j = i + 1; j < N - 1; j++) {
                if (arr[i] +arr[j] > M) continue;
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == M) return M;
                    else {
                        if (temp < sum && sum < M) {
                            temp = sum;
                        }
                    }
                }
            }
        }
        return temp;
    }
}
