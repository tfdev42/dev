package HelloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		// 2 variablen INT, >> add >> print
		int value1 = 1; // initialisierung ... int value1; >> Deklaration
		int value2 = 5;
		int sum = value1 + value2;
		System.out.println("1. zahl: " + value1 + " + 2. Zahl: " + value2 + " ist: " + sum);
		//System.out.printf("1.Zahl: %d + 2.Zahl: %d = %d", value1, value2, sum);
		
		// SUM x=17 / max 37
		int Sum = 0;
		int start = 17;
		int anzahl = 20;
		int max = anzahl + start; // extra variable deklarieren um laufzeit niedrig zu halten
		
		for (int i = start; i <= max; i++) {
			
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			Sum += i;
		}
		System.out.println();
		System.out.println("Summe: " + Sum);
		
		
		//Passwort max. 3x falsch eingeben
		int AnzFalsch = 0;
		boolean OK = false;
		String Passwort;
		Scanner Eingabe = new Scanner(System.in);
		
		
		do {
			//Eingabe
			System.out.print("Bitte dein passwort: ");
			Passwort = Eingabe.next();//"hallo";
//			Class<?> objClass = Passwort.getClass();
//			System.out.println("Type of obj: " + objClass.getName());
			
			if (Passwort.equals("geheim")) {
				OK = true;
			}
			else {
				AnzFalsch++;
				System.out.println(AnzFalsch + ". Mal falsch eingegeben.");
			}
		}
		while (OK == false && AnzFalsch < 3);
		Eingabe.close();
		
		
		
	}

}
