package project.test.intw;

import java.util.Arrays;

public class ReaptedSubstring {

	public static void main(String[] args) {
		ReaptedSubstring rs = new ReaptedSubstring();
		// rs.repeatedSubstringPattern("aba");
		System.out.println(rs.repeatedSubstringPattern("ababba"));

	}

	public boolean repeatedSubstringPattern(String s) {
		boolean flag = false;
		String my="";
		char[] ch = new char[s.length()];
		if (s.length() <= 1) {
			return false;
		} else if(s.length()==2) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==s.charAt(i+1)) {
					return true;
				}
			}
		}
		if (s.length() >= 4) {
			for (int i = 1; i < s.length(); i++) {
				ch[0] = s.charAt(0);
				if (s.charAt(0) == s.charAt(i)) {
					 my = s.substring(i);
					System.out.println(my);
					if (s.contains(my)) {
						for (int j = 0; j<i; j++) {
							if (ch[j] == my.charAt(j)) {
								flag = true;
							} else {
								return false;
							}
						}

						return true;
					}
					break;
				} else {
					ch[i] = s.charAt(i);
				}
			}
		}
		return flag;

	}

}
