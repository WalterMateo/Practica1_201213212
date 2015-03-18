import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero1=0;
		int numero2=0;
		int numero3=0;
		int numero4=0;
		int numero5=0;
		int numero6=0;
		int numero7=0;
		int numero8=0;
		int hora=0;
		int minutos=0;
		int numero9=0;
		
		System.out.println("Elija el Nivel de los problemas que desea ver 1 o 2");
numero1 = s.nextInt();
if(numero1 == 1){
	System.out.println("Escoja el problema que desee del 1 al 5 ");
	numero2=s.nextInt();
	if(numero2==1){
		System.out.print("    *\n   ***\n  *****\n *******\n*********\n *******\n  *****\n   ***\n    *");	
	}
	else if(numero2==2){
		System.out.println("Ingrese las 6 notas del estudiante: ");
		numero3 = s.nextInt();
		numero4 = s.nextInt();
		numero5 = s.nextInt();
		numero6 = s.nextInt();
		numero7 = s.nextInt();
		numero8 = s.nextInt();
		if(numero3 <= 100 && numero4 <=100 && numero5 <=100 && numero6 <=100 && numero7 <=100 && numero8 <=100 && numero8 >=0 && numero7 >=0 && numero6 >=0 && numero5 >=0 && numero4 >=0 && numero3 >=0  ){
			int suma=(numero3 + numero4 + numero5+ numero6+ numero7 + numero8);
			int media=(suma/6);
			
			if(media>=90 && media<=100)
				System.out.println("Su nota es; " + media + " 90-100 A");
			
			else if(media>=80 && media<=89)
				System.out.println("Su nota es; " + media + " 80-89 B");
			
			else if(media>=70 && media<=79)
				System.out.println("Su nota es; " + media + " 70-79 C");
				
			else if(media>=60 && media<=69)
				System.out.println("Su nota es; " + media + " 60-69 D");
			
			else if(media>=0 && media<=59)
				System.out.println("Su nota es; " + media + " 0-59 F");
		
		}
		else
		System.out.println("los numeros no estan en el rango");
	
}
	else if(numero2==3){
	System.out.println("Ingrese la hora en notacion de 24 horas: ");
	hora = s.nextInt();
	System.out.println("Ingrese los minutos");
	minutos = s.nextInt();
	if(hora>=1 && hora<=12 && minutos<=60 && minutos>=0){
		switch(hora){
	case 01: System.out.println("01"+":"+minutos+" AM");
	break;
	case 02: System.out.println("02"+":"+minutos+" AM");
	break;
	case 03: System.out.println("03"+":"+minutos+" AM");
	break;
	case 04: System.out.println("04"+":"+minutos+" AM");
	break;
	case 05: System.out.println("05"+":"+minutos+" AM");
	break;
	case 06: System.out.println("06"+":"+minutos+" AM");
	break;
	case 07: System.out.println("07"+":"+minutos+" AM");
	break;
	case 8: System.out.println("08"+":"+minutos+" AM");
	break;
	case 9: System.out.println("09"+":"+minutos+" AM");
	break;
	case 10: System.out.println("10"+":"+minutos+" AM");
	break;
	case 11: System.out.println("11"+":"+minutos+" AM");
	break;
	case 12: System.out.println("12"+":"+minutos+" AM");
	break;
		}
	}
	else if(hora>12 && hora<=24 && minutos<=60 && minutos>=0){
		switch(hora){
		case 13: System.out.println("01"+":"+minutos+" PM");
		break;
		case 14: System.out.println("02"+":"+minutos+" PM");
		break;
		case 15: System.out.println("03"+":"+minutos+" PM");
		break;
		case 16: System.out.println("04"+":"+minutos+" PM");
		break;
		case 17: System.out.println("05"+":"+minutos+" PM");
		break;
		case 18: System.out.println("06"+":"+minutos+" PM");
		break;
		case 19: System.out.println("07"+":"+minutos+" PM");
		break;
		case 20: System.out.println("08"+":"+minutos+" PM");
		break;
		case 21: System.out.println("09"+":"+minutos+" PM");
		break;
		case 22: System.out.println("10"+":"+minutos+" PM");
		break;
		case 23: System.out.println("11"+":"+minutos+" PM");
		break;
		case 24: System.out.println("12"+":"+minutos+" PM");
		break;
		}
		
	}
	else
		System.out.println("Los numero ingresados son invalidos");
	
}
	else if(numero2==4){
		System.out.println("Ingrese C, U, T");
		String letra =s.nextLine(); 
		if(letra==c){
			
		}
		
	}
	}
else if(numero1==2)
System.out.println("Escoja un numero del 6 al 15 ");
	numero9= s.nextInt();
if(numero9==6){
	System.out.println("ingrese dos numeros y un caracter");
}
	

else
	System.out.println("El numero no es 1 o 2");
		
	}
}

