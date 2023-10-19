package org.cloudvandana.program2;

//public class ConvertRomanNumToInteger {
//	
//	
//
//}
import java.util.*;

public class ConvertRomanNumToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        scanner.close();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);//CAPS i
        romanMap.put('V', 5);//CAPS v
        romanMap.put('X', 10);//CAPS x like  that to set  values
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }

        return result;
    }
}