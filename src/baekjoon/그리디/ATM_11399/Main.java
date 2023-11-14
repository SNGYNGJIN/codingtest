package baekjoon.그리디.ATM_11399;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int man = Integer.parseInt(br.readLine());
        int[] arr = new int[man];
        String[] time = br.readLine().split(" ");

        for (int i = 0; i < man; i++) {
            arr[i] = Integer.parseInt(time[i]);
        }

        Arrays.sort(arr);

        int result = 0;
        int temp = 0;
        for (int i = 0; i < man; i++) {
            if (i == 0) {
                result += arr[i];
                temp += arr[i];
            } else {
                result += temp + arr[i];
                temp += arr[i];
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}