




public class MissingMinNo {

	public static void main(String[] args) {
	
		long num = 10345679;//5 6 7--- 5
		int[] count = new int[10];
		int r;
		while(num !=0) {
			r = (int)(num % 10);
			num = num / 10;
			count[r]++;
		}
		// 5 --0
		// 6---0
		// 7---0
		int min = 2345;
		for(int i=0;i<=9;i++) {
			if(count[i]== 0) {// 5 6 7
				if(min > i) {// 5 > 7
					min = i;// 5
				}//if
			}//if
		}// for
		System.out.println(min);
		
		
		
		
	}

}