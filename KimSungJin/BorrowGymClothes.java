import java.util.ArrayList;
import java.util.Arrays;

public class BorrowGymClothes {
    public static void main(String[] args) {
        int[] lost = { 2, 3, 4 };
        int[] reserve = { 3, 4, 5 };
        // int[] lost = { 3 };
        // int[] reserve = { 1 };
        solution(5, lost, reserve);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> alreadyBorrow = new ArrayList<>();

        for (int j = 0; j < lost.length; j++) {
            for (int i = 0; i < reserve.length; i++) {
                System.out.println("reserve ??: " + reserve[i]);
                if (lost[j] == reserve[i]) {
                    alreadyBorrow.add(lost[j]);
                    lost[j] = -1;
                    reserve[i] = -1;
                    System.out.println("reserve !??: " + reserve[i]);
                }
                System.out.println("reserve !!!: " + reserve[i]);
            }
        }

        for (int ask : lost) {
            for (int i = 0; i < reserve.length; i++) {
                int have = reserve[i];
                System.out.println("have : " + have);
                if ((ask + 1) == have || (ask - 1) == have) {
                    alreadyBorrow.add(ask);
                    reserve[i] = -1;
                    break;
                }
            }
        }
        answer = n - lost.length + alreadyBorrow.size();

        System.out.println("alreadyBorrow : " + alreadyBorrow.toString());
        for (int re : reserve) {
            System.out.println("reserve : " + re);
        }
        System.out.println("answer => " + answer);

        return answer;
    }
}
