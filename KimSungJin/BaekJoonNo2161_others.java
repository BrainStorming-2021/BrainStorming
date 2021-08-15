import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoonNo2161_others {

    public static void main(String[] args) {

    }

    public static void useDeque() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }
        while (!dq.isEmpty()) {
            bw.write(dq.pollFirst() + " ");
            if (dq.isEmpty())
                break;
            dq.addLast(dq.pollFirst());
        }
        bw.flush();
        bw.close();
    }

    public static void useQueue() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++)
            q.offer(i);

        while (!q.isEmpty()) { // 큐가 비어있을 때 까지
            int num1 = q.poll(); // 젤 위에 있는 카드 빼내고 저장
            System.out.print(num1 + " "); // 젤 위에 카드 출력
            if (q.isEmpty()) // 큐가 비어있으면 => 중단
                break;

            int num2 = q.poll(); // 두 번째로 위에 있는 카드 빼내고 저장
            q.offer(num2); // 빼낸 카드 다시 큐에 넣기
        }

        scan.close();
    }
}