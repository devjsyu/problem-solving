package baekjoon;

import java.util.Scanner;

public class Problem1978_practice {
    public static void main(String[] args) {
        // 합성수의 주요 성질 : 합성수는 1과 자기 자신을 제외한 약수를 최소 2개 갖으며, 그 중 하나는 항상 제곱근보다 작거나 같다.
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        int count  = 0;

        // 각 수마다 소수 판별 메서드 적용하기
        for (int i = 0; i < total; i++) {
            if (isPrime(Integer.parseInt(s[i]))) {
                count++;
            }
        }

        // 출력 하기
        System.out.println(count);
    }
    public static boolean isPrime(int num) {
        // 1은 소수가 아니다
        if (num == 1) {
            return false;
        }

        // 제곱근
        double sqrt = Math.sqrt(num);

        // 제곱근보다 작거나 같은 숫자까지 대상 한정
        // 나눌 수 있는 경우 루프로 확인하기
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        // 상기 필터링이 통과했다면 소수
        return true;
    }
}
