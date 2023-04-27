package week1.day2;
import java.util.Arrays;
public class SecSmallNum {
	public static void main(String[] args) {
	int num[]={23,45,67,32,89,22 };
	int length=num.length;
	Arrays.sort(num);
	
	for (int i = 0; i <length; i++) {	
		
		System.out.println(num[i]);	
	}
		 //System.out.println("second largest num :  "+num[length-2]);
		
	System.out.println("Second Smallest Number :  "+num[length-5]);
	
}
}