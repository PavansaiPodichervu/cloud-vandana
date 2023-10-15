package cloud_vandana;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String roman_num = scanner.next();
		Map<Character, Integer> roman_nums = new HashMap<Character, Integer>();
		roman_nums.put('I', 1);
		roman_nums.put('V', 5);
		roman_nums.put('X', 10);
		char ch[] = roman_num.toCharArray();
		int current = 0;
		int res = 0;
		int prev = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			current = roman_nums.get(ch[i]);
			if (current < prev) {
				res -= current;
			} else {
				res += current;
			}
			prev = current;
		}
		System.out.println(res);
	}
}
