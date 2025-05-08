package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem30802_answer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        int n = Integer.parseInt(br.readLine()); // 참가자 수

        String[] sizeStr = br.readLine().split(" ");
        int[] shirtSizes = new int[6];
        for (int i = 0; i < 6; i++) {
            shirtSizes[i] = Integer.parseInt(sizeStr[i]);
        }

        String[] tp = br.readLine().split(" ");
        int T = Integer.parseInt(tp[0]); // 티셔츠 묶음 단위
        int P = Integer.parseInt(tp[1]); // 펜 묶음 단위

        // 티셔츠 묶음 계산
        int shirtBundles = 0;
        for (int size : shirtSizes) {
            shirtBundles += (size + T - 1) / T; // 올림 계산
        }

        // 펜 계산
        int penBundles = n / P;
        int penSingles = n % P;

        // 출력 (StringBuilder 사용)
        StringBuilder sb = new StringBuilder();
        sb.append(shirtBundles).append('\n');
        sb.append(penBundles).append(' ').append(penSingles);

        System.out.println(sb);
    }
}
