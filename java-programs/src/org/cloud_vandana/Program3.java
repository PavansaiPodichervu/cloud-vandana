package org.cloud_vandana;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sen = scanner.next();
		int[] arr = new int[26];
		if (sen.length() < 26) {
			System.out.println("it is not a pangram");
		} else {
			char ch[] = sen.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				int num = 'a';
				arr[ch[i] - num]++;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					System.out.println("it is not a pangram");
					break;
				}
			}
			System.out.println("it is  a pangram");
		}

	}
}
