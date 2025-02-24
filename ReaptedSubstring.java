package project.test.intw;

import java.util.Arrays;

public class ReaptedSubstring {

	public static void main(String[] args) {
		ReaptedSubstring rs = new ReaptedSubstring();
		// rs.repeatedSubstringPattern("aba");
		System.out.println(rs.repeatedSubstringPattern("abcabcabcabc"));

	}

	public boolean repeatedSubstringPattern(String s) {
		int len=s.length();
		System.out.println(len);
		for(int i=0;i<len/2;i++) {
			String str=s.substring(0,i+1);
			System.out.println(str);
			int repeat= len/str.length();
			StringBuilder sb=new StringBuilder();
			while(repeat>0) {
				sb.append(str);
				
				repeat--;
			}
			System.out.println(sb);
			if(sb.toString().equals(s)) {
				return true;
			}
		}
		return false;

	}

}
