import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
		int i, j, a;
		System.out.print("Введите целое число i больше нуля: ");
		Scanner vvod1 = new Scanner(System.in);
		i = vvod1.nextInt();
		System.out.print("Введите целое число j больше нуля: ");
		Scanner vvod2 = new Scanner(System.in);
		j = vvod2.nextInt();
		if (i<j) {
		    a = i;
		} else {
		    a = j;
		}
		int [][] array = new int [i][j];
		
		for (int x = 0; x < i; x++) {
		    for (int y = 0; y < j; y++) {
		        array[x][y] = ((int)(Math.random() * 101) - 50);
		        System.out.print (array[x][y]+" ");
		    }
		    System.out.println();
		}
		System.out.println();
		int k1 = 0;
		int k2 = 0;
		for (int x = 0; x < i; x++) {
		    for (int y = 0; y < j; y++) {
		        if (array[x][y] < a) {
		            k1 = k1 + 1;
		            System.out.printf ("%d[%d][%d] ", array[x][y], x, y);
		            if ( Math.abs(x-y) % 5 == 0 ) {
		                k2 = k2 + 1;
		            }
		        }
		    }
		    System.out.println();
		}
		System.out.printf ("Количество элементов меньше заданного числа: %d", k1);
		System.out.println();
		System.out.printf ("Количество элементов кратных 5: %d", k2);
    }    
}