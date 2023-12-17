package sky.core.org.app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        onlyOddNumbersPrint(nums);
        evenNumbersWithoutRepetitionsPrint(nums);
        uniqueWordsListPrint(strings);
        uniqueWordsCountListPrint(strings);
    }

    private static void uniqueWordsCountListPrint(List<String> strings) {
        Set<String> numSet = new HashSet();
        int count;
        for (String s : strings) {
            numSet.add(s);
        }
        for (String s : numSet) {
            count = 0;
            for (String string : strings) {
                Boolean isEquals = s.equals(string);
                if (isEquals) {
                    count++;
                }
            }
            System.out.println(s + " встречается " + count);
        }
    }

    private static void uniqueWordsListPrint(List<String> strings) {
        Set<String> numSet = new HashSet();
        int count;
        for (String s : strings) {
            numSet.add(s);
        }
        System.out.println(numSet);
    }


    private static void evenNumbersWithoutRepetitionsPrint(List<Integer> nums) {
        Set<Integer> numSet = new HashSet();
        for (Integer n : nums) {
            if (n % 2 == 0) {
                numSet.add(n);
            }
        }
        System.out.print(numSet);
    }

    private static void onlyOddNumbersPrint(List<Integer> nums) {
        for (Integer n : nums) {
            if (n % 2 != 0) {
                System.out.print(n + ", ");
            }
        }
    }
}
