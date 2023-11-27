import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "три", "четыре", "четыре", "пять"));
        odd(nums);
        System.out.println(" ");
        even(nums);
        uniqueWords(strings);
        repeat(strings);
    }

    private static void odd(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
    }

    private static void even(List<Integer> nums) {
        List<Integer> even = new ArrayList<>(List.of());
        for (Integer num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        System.out.println("even = " + even);
    }

    private static void uniqueWords(List<String> strings) {
        Set<String> stringSet = new HashSet<>(List.of());
        stringSet.addAll(strings);
        System.out.println("stringSet = " + stringSet);
    }

    private static void repeat(List<String> strings) {
        Map<String, Integer> repeatMap = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            if (repeatMap.containsKey(strings.get(i))) {
                repeatMap.put(strings.get(i), repeatMap.get(strings.get(i)) + 1);
            } else {
                repeatMap.put(strings.get(i), 1);
            }
        }
        System.out.println("repeatMap= " + repeatMap);
    }

}