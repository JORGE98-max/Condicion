import java.util.Scanner;

public class Condicion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
	  
		System.out.println("Ingrese su genero: ");
		String gen = scan.next();
		System.out.println("Bienvenido "+ gen);
		System.out.println("Ingrese su edad : ");
		int edad = scan.nextInt();
		
		if (edad >=6 && edad < 13) {
			
			System.out.println("Usted paga s/.10 ");
		}
			if(edad >= 12 && edad < 60) {
				
				System.out.println("Usted paga s/.20 ");
			}
			if( edad >=60) {
				
				System.out.println("Usted paga s/.15 ");
			}
			
	}
		
		
}


