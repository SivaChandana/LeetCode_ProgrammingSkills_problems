package project.test.intw;

public class IndexOfFirstOcc {

	public static void main(String[] args) {
		IndexOfFirstOcc obj=new IndexOfFirstOcc();
		int i =obj.strStr("hello", "ll");
		System.out.println(i);
	}

	 public int strStr(String haystack, String needle) {
	        if (haystack.contains(needle)) {
	            return haystack.indexOf(needle);
	        } else {
	            return -1;
	        }
	    }

}
