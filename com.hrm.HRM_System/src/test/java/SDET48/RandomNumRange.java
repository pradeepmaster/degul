package SDET48;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumRange {

	
	public static void main(String[] args) {
		Random r=new Random();
		int num = r.nextInt(100,1000);
		System.out.println(num);
	}
}
