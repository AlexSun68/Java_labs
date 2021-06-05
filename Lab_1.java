import java.util.Scanner;
import static java.lang.Math.*;

public class Lab_1 {
    public static void main(String[] args) {
		double y, x, a, b, c, d, e, f;
		System.out.print("Введите x: ");
		Scanner vvod = new Scanner(System.in);
		x = vvod.nextDouble();
		a = x*x/(x*x+1);
		b = Math.pow(Math.asin(a),7);
		c = Math.sqrt(2*(Math.abs(x+3)));
		d = Math.cbrt(c+4);
		e = Math.pow(3,1/Math.tan(x))+Math.pow(Math.abs(x),Math.cos(x));
		f = Math.log(e)/Math.log(7);
		y = b+d+f;
		
        if (x>=0 && x<=1 && y>=0 && y<=1) {
            System.out.printf("Точка (x="+x+"; y="+y+") принадлежит области: %s", "True");
            }
        else {
            System.out.printf("Точка (x="+x+"; y="+y+") принадлежит области: %s", "False");
            }
    }
}