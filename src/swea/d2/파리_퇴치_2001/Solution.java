package swea.d2.파리_퇴치_2001;

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
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
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for (int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt(); // 2이상 10,000,000 이하
            int d2 = 0;
            int d3 = 0;
            int d5 = 0;
            int d7 = 0;
            int d11 = 0;

            while ((num % 2) == 0) {
                num = num / 2;
                d2++;
            }
            while ((num % 3) == 0) {
                num = num / 3;
                d3++;
            }
            while ((num % 5) == 0) {
                num = num / 5;
                d5++;
            }
            while ((num % 7) == 0) {
                num = num / 7;
                d7++;
            }
            while ((num % 11) == 0) {
                num = num / 11;
                d11++;
            }
            System.out.println("#" + test_case + " " + d2 + " " + d3  + " " + d5 + " " + d7 + " " + d11);
        }
    }
}
