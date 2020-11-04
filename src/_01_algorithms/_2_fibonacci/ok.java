package _01_algorithms._2_fibonacci;

public class ok {
public static void main(String[] args) {
	int num1 = 0;
	int num2 = 1;
	int sum = 0;
	System.out.println(num1);
	System.out.println(num2);
	for (int tempt = 0; tempt < 100; tempt++) {
sum =num1+num2;
System.out.println(sum);
num1 = num2;
num2 = sum;
	}
}
}
