package swea.d3.View_1206;

import java.io.*;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        //System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int building = Integer.parseInt(br.readLine());
            String[] heightInput = br.readLine().split(" ");
            int[] height = new int[building];
            for (int i = 0; i < heightInput.length; i++) {
                height[i] = Integer.parseInt(heightInput[i]);
            }

            int result = 0;

            for (int j = 2; j < height.length - 2; j++) {
                int leftMax = Math.max(height[j - 2], height[j - 1]);
                int rightMax = Math.max(height[j + 1], height[j + 2]);

                int currentBuildingHeight = height[j];

                if (currentBuildingHeight > leftMax && currentBuildingHeight > rightMax) {
                    int max = Math.max(leftMax, rightMax);
                    result += currentBuildingHeight - max;
                }
            }
            bw.write("#");
            bw.write(String.valueOf(test_case));
            bw.write(" ");
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}