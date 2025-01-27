
	
	
public class Program1 {
	static void arRR(int[] x) {
		int len = x.length;// 5
		int arrLen = len - 1;//4
		int t = x[arrLen];
		// num[4] = num[3]
		// num[3] = num[2]
		// num[2] = num[1]
		// num[1] = num[0]
		for (int i = arrLen; i >=1; i--) {
			x[i] = x[i - 1];
		}
		x[0] = t;
		System.out.println("\n after 1 right Rotation \n");
		for (int i = 0;i <= arrLen; i++) {
			System.out.println(x[i] +" ");
		}
	}
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		System.out.println("Befor Right Rotation");
		for (int i = 0;i<num.length; i++) {
			System.out.println(num[i] + " ");
	}
	arRR(num);
	arRR(num);
	arRR(num);
}

}