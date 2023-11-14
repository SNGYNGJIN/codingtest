package baekjoon.그리디.설탕_배달_2839;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());

        Stack stack = new Stack(input);

        for (int i = 0; i < input; i++) {
            String[] inputTokens = br.readLine().split(" ");
            switch (inputTokens[0]) {
                case "push":
                    int a = Integer.parseInt(inputTokens[1]);
                    stack.push(a);
                    break;
                case "pop":
                    stack.pop(bw);
                    break;
                case "size":
                    stack.size(bw);
                    break;
                case "empty":
                    stack.empty(bw);
                    break;
                case "top":
                    stack.top(bw);
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }

    public static class Stack {
        private int top;
        private int size;
        private int[] stack;

        public Stack(int input) {
            this.size = 0;
            stack = new int[input];
            top = -1;
        }

        private void push(int x) {
            top++;
            stack[top] = x;
            size++;
        }

        private void pop(BufferedWriter bw) throws IOException {
            if (top < 0) {
                bw.write("-1\n");
            } else {
                bw.write(stack[top] + "\n");
                stack[top] = 0;
                size--;
                top--;
            }
        }

        private void size(BufferedWriter bw) throws IOException {
            bw.write(size + "\n");
        }

        private void empty(BufferedWriter bw) throws IOException {
            if (top < 0) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        private void top(BufferedWriter bw) throws IOException {
            if (top == -1) {
                bw.write("-1\n");
            } else {
                bw.write(stack[top] + "\n");
            }
        }
    }
}
