import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoonNo2562_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 9개 숫자 배열로 담기 */
        int[] inputArr = new int[9];

        for (int i = 0; i < 9; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        /* max 값 찾기 */
        int idx = 0;
        int max = inputArr[0];
        for (int i = 0; i < 9; i++) {
            if (max < inputArr[i]) {
                idx = i;
                max = inputArr[i];
            }
        }

        System.out.println(max + "\n" + (idx + 1));
    }
}
