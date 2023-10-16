package Map;

import java.util.HashMap;

public class RomantoInteger {
    public static int romanToInteger(String roman) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentRoman = roman.charAt(i);
            int currentInteger = romanNumerals.get(currentRoman);

            if (currentInteger < prevValue) {
                result -= currentInteger;
            } else {
                result += currentInteger;
            }

            prevValue = currentInteger;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Example: Roman numeral "IX"
        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println("Integer equivalent: " + integerEquivalent);
    }
}
