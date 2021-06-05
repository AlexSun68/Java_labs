import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
		double x, a, b, c;
		System.out.print("Введите число для x: ");
		Scanner vvod = new Scanner(System.in);
		x = vvod.nextDouble();
		a = Math.log(Math.abs(Math.pow(7,x)-Math.pow(Math.abs(x-3),7)))/Math.log(7);
		b = Math.log(Math.pow(x,8)/(1+Math.pow(x,2)));
		c = Math.asin(x/(1+Math.pow(x,2)));

        if (x<=1) {
            System.out.println("y="+a);
            }
        else if (x>1 && x<3) {
            System.out.println("y="+b);
            }
        else {
            System.out.println("y="+c);
            }
    }
}