import java.util.Scanner;

public class BaekJoonNo2161_submit { // -> Main 으로 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] throwNum = new int[num]; // 버린 숫자들
        int[] remainNum = new int[num]; // 남은 숫자들
        int[] temp = new int[num]; // 남은 숫자들 임의 담기 위한 임시 배열
        int idxThrowNum = 0; // 버린 숫자들 배열의 index
        int turn = num; // 반복 횟수

        for (int i = 0; i < num; i++) {
            remainNum[i] = i + 1;
        }

        while (true) {
            int idxRemainNum = 0;

            for (int i = 0; i < turn; i++) {
                if ((i + 1) % 2 != 0) { // -> 홀수 일때
                    throwNum[idxThrowNum] = remainNum[i];
                    System.out.print(remainNum[i] + " ");
                    idxThrowNum++;
                } else if ((i + 1) % 2 == 0) { // -> 짝수 일때
                    temp[idxRemainNum] = remainNum[i];
                    idxRemainNum++;
                }
            }

            turn = turn / 2;

            remainNum = new int[turn];
            for (int i = 0; i < turn; i++) {
                remainNum[i] = temp[i];
            }
            if (turn <= 0)
                break;
        }
        sc.close();
    }
}