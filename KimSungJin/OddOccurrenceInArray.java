import java.util.ArrayList;

public class OddOccurrenceInArray {

    public static void main(String[] args) {

        int[] A = { 9, 3, 9, 3, 9, 7, 9 };
        solution(A);
    }

    public static int solution(int[] A) {

        int solo = 0;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int search : A) {
            System.out.println("Search : " + search);
            System.out.println("temp.contains(search) : " + temp.contains(search));

            if (temp.contains(search) == false) {
                solo = search;
            }
            temp.add(search);
        }
        System.out.println("solo : " + solo);
        return solo;
    }
}