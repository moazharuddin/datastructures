package sample;

public class SpiralOutput {
	//Sample output;
	//A
	//B C
	//F E D
	//G H I J
	//O N M L K
	
	public static void main(String[] args) {
		char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
		
		int num = 0; int direction = 1;
		for (int i = 0; i < arr.length; i++) {
			if (direction % 2 == 0 || direction == 1) {
				for (int k = 0; k <= i; k++) {
					System.out.print(arr[num++] + " ");
				}
				direction++;
			} else {
				int temp = num + i;
				for (int k = temp; k >= num; k--) {
					System.out.print(arr[k] + " ");

				}
				num = temp + 1;
				direction++;
			}
			if (num > arr.length - 1)
				break;
			System.out.println();

		}
	}
}
