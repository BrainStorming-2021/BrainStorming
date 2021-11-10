import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoonNo2884_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        // 10:10 -> 9:25
        minute -= 45;

        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }

        if (hour < 0) {
            hour += 24;
        }

        System.out.println(hour + " " + minute);
    }
}
