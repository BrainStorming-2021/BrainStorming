import java.util.ArrayList;

public class TruckOnTheBridge {
    public static void main(String[] args) {
        solution(2, 10, new int[] { 7, 4, 5, 6 });
        solution(100, 100, new int[] { 10 });
        solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 });
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        ArrayList<Integer> onTheBrige = new ArrayList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            for (int j = 0; j < bridge_length; j++) {
                if (onTheBrige.isEmpty()) {
                    onTheBrige.add(truck_weights[i]);
                    answer += 1;
                    break;
                } else {
                    int onTheBrigeWeight = 0;
                    for (int k = 0; k < onTheBrige.size(); k++) {
                        onTheBrigeWeight += onTheBrige.get(k);
                    }
                    if (onTheBrigeWeight + truck_weights[i] <= weight) {
                        onTheBrige.add(truck_weights[i]);
                        answer += 1;
                    } else {
                        answer += bridge_length;
                        onTheBrige.clear();
                    }
                }
            }
        }
        System.out.println("answer : " + answer);
        return answer;
    }
}