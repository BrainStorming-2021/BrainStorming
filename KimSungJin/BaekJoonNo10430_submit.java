import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoonNo10430_submit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append((a + b) % c + "\n");
        sb.append(((a % c) + (b % c)) % c + "\n");
        sb.append((a * b) % c + "\n");
        sb.append(((a % c) * (b % c)) % c);
        System.out.println(sb);
    }
}
