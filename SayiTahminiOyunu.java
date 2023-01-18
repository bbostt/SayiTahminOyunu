import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminiOyunu {

	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 100); // 0 ile 100 aras� double say� �retir. double de�eri int e �evirdik.
		
		Scanner input = new Scanner(System.in);
		
		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		System.out.println(number);
		
		while(right < 5) {
			System.out.print("L�tfen tahmininizi giriniz : ");
			selected = input.nextInt();
			
			if(selected < 0 || selected > 99) {
				System.out.println("L�tfen 0 - 100 aras� say� giriniz.");
				continue;
			}
			
			if(selected == number) {
				System.out.println("Tebikler, do�ru tahmin ! Tahmin edilen sayi : " +number);
				isWin = true;
				break; // break sayesinde d�ng�den ��kar.
				
			}else {
				
				System.out.println("Hatal� say� girdiniz");
				if(selected > number) {
					System.out.println(selected + " say�s�, �retilen say�dan b�y�kt�r");
				}else {
					System.out.println(selected + " say�s�, �retilen say�dan k�c�kt�r");
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
