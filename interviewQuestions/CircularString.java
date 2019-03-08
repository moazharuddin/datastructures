package sample;

public class CircularString {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		
		String s1s1 = s1+s1;
		String s2 = "wat";
		
		System.out.println(s1s1.substring(s2.length(),s1.length())+s2);

	}

	private static String getFormatted(char[] name, int n) {
		StringBuilder build = new StringBuilder();
		int spaceCount = 0;
		for(int i=0;i<n;i++) {
			if(name[i] == ' ') {
				build.append("%20");
			}else {
				build.append(name[i]);
			}
		}
		
		return build.toString();
	}

}
