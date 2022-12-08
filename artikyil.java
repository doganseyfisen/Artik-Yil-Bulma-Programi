import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Girdiğiniz yılın artık yıl olup olmadığını öğrenin.\nYıl girin: ");
		year = input.nextInt();
		
		if(year%4==0 && year%400==0) {
			System.out.println(year + " yılı bir artık yıldır.");
		} else {
			System.out.println(year + " yılı bir artık yıl değildir.");
		}
		
	}
}
