import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoonNo1546_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        double[] scores = new double[num];
        double max = 0;
        double answer = 0;

        /* 점수 배열, 최고 점수 초기화 */
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        System.out.println("max : " + max);

        /* 점수 변경 */
        for (int i = 0; i < num; i++) {
            Double orignScore = scores[i];
            System.out.println("orignScore : " + orignScore);
            Double fakeScore = orignScore / max * 100;
            scores[i] = fakeScore;
            System.out.println("fakeScore : " + fakeScore);
            answer += fakeScore;
            System.out.println("answer : " + answer);
        }

        System.out.println("answer : " + (answer / num));
    }
}
