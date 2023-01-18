import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminiOyunu {

	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 100); // 0 ile 100 arasý double sayý üretir. double deðeri int e çevirdik.
		
		Scanner input = new Scanner(System.in);
		
		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		System.out.println(number);
		
		while(right < 5) {
			System.out.print("Lütfen tahmininizi giriniz : ");
			selected = input.nextInt();
			
			if(selected < 0 || selected > 99) {
				System.out.println("Lütfen 0 - 100 arasý sayý giriniz.");
				continue;
			}
			
			if(selected == number) {
				System.out.println("Tebikler, doðru tahmin ! Tahmin edilen sayi : " +number);
				isWin = true;
				break; // break sayesinde döngüden çýkar.
				
			}else {
				
				System.out.println("Hatalý sayý girdiniz");
				if(selected > number) {
					System.out.println(selected + " sayýsý, üretilen sayýdan büyüktür");
				}else {
					System.out.println(selected + " sayýsý, üretilen sayýdan kücüktür");
				}
				
				wrong[right] = selected;
				right++;
							
				System.out.println("Kalan hak : " + (5-right));				
			}
			
			
			
		}
		
		if(!isWin) {
			System.out.println("Kaybettiniz");			
		}
		
		System.out.println("Tahminleriniz : " +Arrays.toString(wrong));
		
		System.out.println(number);

	}

}
