package week10;

public class Task2 {
  
  public static void Bubble(double[] mang) {
		int n = mang.length;
		int i, j;
		double temp;
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-1-i;j++) {
				if(mang[j] > mang[j+1]) {
					temp = mang[j];
					mang[j] = mang [j+1];
					mang[j+1] = temp;
				}
			}
		}
	}

	public static boolean Test(double[] mang) {
		int n = mang.length;
		for(int i=1;i<n;i++) {
			if(mang[i] < mang[i-1]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] mang = new double[1000];
		
		for(int i=0;i<1000;i++) {
			mang[i] = Math.random();
		}
		
		Bubble(mang);
		System.out.println(Test(mang)); 
	}
}
