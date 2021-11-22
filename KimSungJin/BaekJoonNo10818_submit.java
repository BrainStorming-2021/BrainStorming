import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoonNo10818_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] inputs = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        /* 숫자 배열 생성 */
        for (int i = 0; i < size; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        int max = inputs[0];
        int min = inputs[0];
        /* max, min 값 찾기 */
        for (int i = 0; i < size; i++) {
            if (min > inputs[i]) {
                min = inputs[i];
            }
            if (max < inputs[i]) {
                max = inputs[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
