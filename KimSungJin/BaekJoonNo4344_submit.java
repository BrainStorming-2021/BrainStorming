import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoonNo4344_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseNum = Integer.parseInt(br.readLine());
        String[] testCaseArr = new String[testCaseNum];

        for (int i = 0; i < testCaseNum; i++) {
            String testCase = br.readLine();
            testCaseArr[i] = testCase;
        }

        double averScore = 0;
        double count = 0; // -> 평균 이상인 학생 수
        for (String testCase : testCaseArr) {
            /* 점수 배열 */
            String[] scoreArr = testCase.split(" "); // -> 점수 배열
            double students = Double.parseDouble(scoreArr[0]); // -> testcase 학생 수
            for (int i = 1; i < scoreArr.length; i++) {
                double score = Double.parseDouble(scoreArr[i]);
                averScore += score; // -> 점수 합계
            }
            averScore = averScore / students; // -> 평균 점수

            /* 평균 이상 학생 비율 */
            for (int i = 1; i < scoreArr.length; i++) {
                double score = Double.parseDouble(scoreArr[i]);
                if (score > averScore) {
                    count++;
                }
            }
            double per = (count / students) * 100.0; // -> 평균 이상 학생 비율
            // DecimalFormat form = new DecimalFormat("#.000");
            // bw.write(form.format(per) + "%\n");
            bw.write(String.format("%.3f", per) + "%\n");
            count = 0;
            averScore = 0;
        }

        bw.flush();
        bw.close();

    }
}