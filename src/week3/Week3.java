package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
	    if(m>n) return m;
	    else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
	    int n = array.length;
    	int min = array[0];
    	
        for(int i=1;i<n;i++){
        	if(min > array[i]) min = array[i];
        }
        
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
	    if(weight <= 0 || height <= 0) return null;
    	
    	double BMI;
    	BMI = weight/(height*height);
    	String ketqua = new String(); 
    	
    	if(BMI < 18.5) ketqua = "Thiếu cân";
    	else if(18.5 <= BMI && BMI < 23) ketqua = "Bình thường";
    	else if(23 <= BMI && BMI < 25) ketqua = "Thừa cân";
    	else ketqua = "Béo phì";

    		
    	System.out.println(ketqua);
    	
    	return ketqua;
    }
}
