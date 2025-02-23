package project.test.intw;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println(a.isAnagram("aacc", "ccac"));
	}

	public boolean isAnagram(String s, String t) {
		boolean flag =false;
		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (s.length() == t.length()) {
			for (int i = 0; i < s.length(); i++) {
				if(ch1[i]==ch2[i]) {
					flag = true;
				} else {
					return false;
				}
			}
		}

		return flag;

	}

}
