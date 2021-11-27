import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoonNo8958_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNo = Integer.parseInt(br.readLine());
        String[] testArr = new String[testNo];
        int count = 0;
        int totalScore = 0;

        for (int i = 0; i < testNo; i++) {
            testArr[i] = br.readLine();
        }

        for (int i = 0; i < testNo; i++) {
            String[] test = testArr[i].split("");
            for (int j = 0; j < test.length; j++) {
                if (test[j].equals("O")) {
                    count++;
                } else {
                    count = 0;
                }
                totalScore += count;
                System.out.println("totalScore : " + totalScore);
            }
            bw.write(totalScore + "\n");
            totalScore = 0;
            count = 0;
            System.out.println("----------------");
        }

        bw.flush();
        bw.close();

    }
}
