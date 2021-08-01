import java.util.HashSet;

public class Phonkemon {

    public static void main(String[] args) {
        int[] nums1 = { 3, 1, 2, 3 };
        int[] nums2 = { 3, 3, 3, 2, 2, 4 };
        int[] nums3 = { 3, 3, 3, 2, 2, 2 };

        solution(nums1);
        solution(nums2);
        solution(nums3);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            System.out.println("Set ==> " + set.toString());
        }

        if (set.size() > (nums.length / 2)) {
            answer = nums.length / 2;
        } else {
            answer = set.size();
        }

        System.out.println("=====The End=====");

        return answer;
    }
}
