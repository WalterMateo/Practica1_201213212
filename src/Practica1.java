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
		float numero10=0;
		float numero11=0;
		char letra;
		double numerox;
		char letra2;
		int numero12=0;
		int numero13=0;
		int numero14=0;
		int numeroaleatorio=1;
		int numero15=0;
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
		System.out.print("Ingrese en mayuscula; C para determinar el area,perimetro y radio de un circulo\n                      U para determinar el area y perimetro de un cuadrado\n                      T para determinar el area, perimetro y altura de un triangulo equilatero\n");
		letra = s.next().charAt(0);
		
		if(letra=='C'){
			System.out.println("Ingrese el diametro del circulo");
			numerox= s.nextDouble();
			System.out.print("El area del circulo es: "+(3.1415926535)*(numerox/2)*(numerox/2)+"\nEl perimetro del circulo es: "+(3.1415926535)*(numerox)+"\nEl Radio del circulo es: "+(numerox/2));
		}
		else if(letra=='U'){
			System.out.println("Ingrese un lado del cuadrado");
			numerox=s.nextDouble();
			System.out.print("El area del cuadrado es: "+(numerox*numerox)+"\nEl perimetro del cuaadrado es: "+(numerox*4));
		}
		else if(letra=='T'){
			System.out.println("Ingrese la base del triangulo Equilatero");
			numerox=s.nextDouble();
			System.out.print("El area del triangulo es: "+((Math.sqrt(3))/4)*((numerox*2)*(numerox*2))+"\nEl perimetro del triangulo es: "+(3*(numerox*2))+"\nLa altura del triangulo es: "+(Math.sqrt(((2*numerox)*(2*numerox))-(numerox*numerox))));
		}
		else
			System.out.println("Las letras no coinciden con ninguna de las descritas");
	}
	else if(numero2==5){
		
	}
}
else if(numero1==2){
System.out.println("Escoja un numero del 6 al 15 ");
	numero9= s.nextInt();
if(numero9==6){
	System.out.println("Ingrese dos numeros y uno de estos caracteres\ns para sumar los dos numeros\nr para la resta entre los dos numeros\nm para multiplicar los dos numeros\nd para dividir los dos numeros\n");
	numero10=s.nextInt();
	numero11=s.nextInt();
	letra2=s.next().charAt(0);
	if(letra2=='s'){
		System.out.println("La suma de los dos es; "+(numero10+numero11));
	}
	else if(letra2=='r'){
		System.out.println("La resta de los dos numeros es; "+(numero10-numero11));
	}
	else if(letra2=='m'){
		System.out.println("La multiplicacion de los dos numeros es; "+(numero10*numero11));
	}
	else if(letra2=='d'){
		float res=(numero10/numero11);
		System.out.println("El cociente de los dos es "+res);
	}
	else
		System.out.println("Las letras no son las indicadas");
}
else if(numero9==7){
	System.out.println("Ingrese un numero entre 0 a 10");
	numero12= s.nextInt();
	if(numero12>=0 && numero12<=10){
	for(int a=10; a>0;a--){
		System.out.print(numero12+"*"+a+"="+ numero12*a+"\n");
	}	
	}
	else
		System.out.println("El numero no esta entre 0 y 10");

}
else if(numero9==8){
	System.out.println("ingrese el rango menor entre 0 y 100");
	numero13= s.nextInt();
	System.out.println("ingrese el rango mayor entre 0 y 100");
	numero14= s.nextInt();
	if (numero13>=0 && numero13<=100 && numero14>=0 && numero14<=100){
	numeroaleatorio= (int)(Math.random()*(numero14)+(numero13));
	switch(numeroaleatorio){
	case 1: System.out.println("El numero al azar es: Uno");
	break;
	case 2: System.out.println("El numero al azar es: Dos");
	break;
	case 3: System.out.println("El numero al azar es: Tres");
	break;
	case 4: System.out.println("El numero al azar es: Cuatro");
	break;
	case 5: System.out.println("El numero al azar es: Cinco");
	break;
	case 6: System.out.println("El numero al azar es: Seis");
	break;
	case 7: System.out.println("El numero al azar es: Siete");
	break;
	case 8: System.out.println("El numero al azar es: Ocho");
	break;
	case 9: System.out.println("El numero al azar es: Nueve");
	break;
	case 10: System.out.println("El numero al azar es: Diez");
	break;
	case 11: System.out.println("El numero al azar es: Once");
	break;
	case 12: System.out.println("El numero al azar es: Doce");
	break;
	case 13: System.out.println("El numero al azar es: Trece");
	break;
	case 14: System.out.println("El numero al azar es: Catorce");
	break;
	case 15: System.out.println("El numero al azar es: Quince");
	break;
	case 16: System.out.println("El numero al azar es: Dieciseis");
	break;
	case 17: System.out.println("El numero al azar es: Diecisiete");
	break;
	case 18: System.out.println("El numero al azar es: Dieciocho");
	break;
	case 19: System.out.println("El numero al azar es: Diecinueve");
	break;
	case 20: System.out.println("El numero al azar es: Veinte");
	break;
	case 21: System.out.println("El numero al azar es: Veintiuno");
	break;
	case 22: System.out.println("El numero al azar es: Veintidos");
	break;
	case 23: System.out.println("El numero al azar es: Veintitres");
	break;
	case 24: System.out.println("El numero al azar es: Veinticuatro");
	break;
	case 25: System.out.println("El numero al azar es: Veinticinco");
	break;
	case 26: System.out.println("El numero al azar es: Veintiseis");
	break;
	case 27: System.out.println("El numero al azar es: Veintisiete");
	break;
	case 28: System.out.println("El numero al azar es: Veintiocho");
	break;
	case 29: System.out.println("El numero al azar es: Veintinueve");
	break;
	case 30: System.out.println("El numero al azar es: Treinta");
	break;
	case 31: System.out.println("El numero al azar es: Treinta y uno");
	break;
	case 32: System.out.println("El numero al azar es: Treinta y Dos");
	break;
	case 33: System.out.println("El numero al azar es: Treinta y Tres");
	break;
	case 34: System.out.println("El numero al azar es: Treinta y cuatro");
	break;
	case 35: System.out.println("El numero al azar es: Treinta y cinco");
	break;
	case 36: System.out.println("El numero al azar es: Treinta y seis");
	break;
	case 37: System.out.println("El numero al azar es: Treinta y siete");
	break;
	case 38: System.out.println("El numero al azar es: Treinta y ocho");
	break;
	case 39: System.out.println("El numero al azar es: Treinta y nueve");
	break;
	case 40: System.out.println("El numero al azar es: Cuarenta");
	break;
	case 41: System.out.println("El numero al azar es: Cuarenta y uno");
	break;
	case 42: System.out.println("El numero al azar es: Cuarenta y dos");
	break;
	case 43: System.out.println("El numero al azar es: Cuarenta y tres");
	break;
	case 44: System.out.println("El numero al azar es: Cuarenta y cuatro");
	break;
	case 45: System.out.println("El numero al azar es: Cuarenta y cinco");
	break;
	case 46: System.out.println("El numero al azar es: Cuarenta y seis");
	break;
	case 47: System.out.println("El numero al azar es: Cuarenta y siete");
	break;
	case 48: System.out.println("El numero al azar es: Cuarenta y ocho");
	break;
	case 49: System.out.println("El numero al azar es: Cuarenta y nueve");
	break;
	case 50: System.out.println("El numero al azar es: Cincuenta");
	break;
	case 51: System.out.println("El numero al azar es: Cincuenta y uno");
	break;
	case 52: System.out.println("El numero al azar es: Cincuenta y dos");
	break;
	case 53: System.out.println("El numero al azar es: Cincuenta y tres");
	break;
	case 54: System.out.println("El numero al azar es: Cincuenta y cuatro");
	break;
	case 55: System.out.println("El numero al azar es: Cincuenta y cinco");
	break;
	case 56: System.out.println("El numero al azar es: Cincuenta y seis");
	break;
	case 57: System.out.println("El numero al azar es: Cincuenta y siete");
	break;
	case 58: System.out.println("El numero al azar es: Cincuenta y ocho");
	break;
	case 59: System.out.println("El numero al azar es: Cincuenta y nueve");
	break;
	case 60: System.out.println("El numero al azar es: Sesenta");
	break;
	case 61: System.out.println("El numero al azar es: Sesenta y uno");
	break;
	case 62: System.out.println("El numero al azar es: Sesenta y dos");
	break;
	case 63: System.out.println("El numero al azar es: Sesenta y tres");
	break;
	case 64: System.out.println("El numero al azar es: Sesenta y cuatro");
	break;
	case 65: System.out.println("El numero al azar es: Sesenta y cinco");
	break;
	case 66: System.out.println("El numero al azar es: Sesenta y seis");
	break;
	case 67: System.out.println("El numero al azar es: Sesenta y siete");
	break;
	case 68: System.out.println("El numero al azar es: Sesenta y ocho");
	break;
	case 69: System.out.println("El numero al azar es: Sesenta y nueve");
	break;
	case 70: System.out.println("El numero al azar es: Setenta");
	break;
	case 71: System.out.println("El numero al azar es: Setenta y uno");
	break;
	case 72: System.out.println("El numero al azar es: Setenta y dos");
	break;
	case 73: System.out.println("El numero al azar es: Setenta y tres");
	break;
	case 74: System.out.println("El numero al azar es: Setenta y cuatro");
	break;
	case 75: System.out.println("El numero al azar es: Setenta y cinco");
	break;
	case 76: System.out.println("El numero al azar es: Setenta y seis");
	break;
	case 77: System.out.println("El numero al azar es: Setenta y siete");
	break;
	case 78: System.out.println("El numero al azar es: Setenta y ocho");
	break;
	case 79: System.out.println("El numero al azar es: Setenta y nueve");
	break;
	case 80: System.out.println("El numero al azar es: Ochenta");
	break;
	case 81: System.out.println("El numero al azar es: Ochenta y uno");
	break;
	case 82: System.out.println("El numero al azar es: Ochenta y dos");
	break;
	case 83: System.out.println("El numero al azar es: Ochenta y tres");
	break;
	case 84: System.out.println("El numero al azar es: Ochenta y cuatro");
	break;
	case 85: System.out.println("El numero al azar es: Ochenta y cinco");
	break;
	case 86: System.out.println("El numero al azar es: Ochenta y seis");
	break;
	case 87: System.out.println("El numero al azar es: Ochenta y siete");
	break;
	case 88: System.out.println("El numero al azar es: Ochenta y ocho");
	break;
	case 89: System.out.println("El numero al azar es: Ochenta y nueve");
	break;
	case 90: System.out.println("El numero al azar es: Noventa");
	break;
	case 91: System.out.println("El numero al azar es: Noventa y uno");
	break;
	case 92: System.out.println("El numero al azar es: Noventa y dos");
	break;
	case 93: System.out.println("El numero al azar es: Noventa y tres");
	break;
	case 94: System.out.println("El numero al azar es: Noventa y cuatro");
	break;
	case 95: System.out.println("El numero al azar es: Noventa y cinco");
	break;
	case 96: System.out.println("El numero al azar es: Noventa y seis");
	break;
	case 97: System.out.println("El numero al azar es: Noventa y siete");
	break;
	case 98: System.out.println("El numero al azar es: Noventa y ocho");
	break;
	case 99: System.out.println("El numero al azar es: Noventa y nueve");
	break;
	case 100: System.out.println("El numero al azar es: Cien");
	break;
	
	
	
	}
	}
	else
	System.out.println("Los rangos no estan entre 0 y 100");

	
}
else if(numero9==9){
	System.out.println("Ingrese un numero de 0 hasta 1000 en aràbigo para ver el mismo numero en romano");
	numero15=s.nextInt();
	switch(numero15){
	case 1: System.out.println("El numero es: "+numero15+" el numero en romano es; I");
	break;
	case 2: System.out.println("El numero es: "+numero15+" el numero en romano es; II");
	break;
	case 3: System.out.println("El numero es: "+numero15+" el numero en romano es; III");
	break;
	case 4: System.out.println("El numero es: "+numero15+" el numero en romano es; IV");
	break;
	case 5: System.out.println("El numero es: "+numero15+" el numero en romano es; V");
	break;
	case 6: System.out.println("El numero es: "+numero15+" el numero en romano es; VI");
	break;
	case 7: System.out.println("El numero es: "+numero15+" el numero en romano es; VII");
	break;
	case 8: System.out.println("El numero es: "+numero15+" el numero en romano es; VIII");
	break;
	case 9: System.out.println("El numero es: "+numero15+" el numero en romano es; IX");
	break;
	case 10: System.out.println("El numero es: "+numero15+" el numero en romano es; X");
	break;


	}
	
}
else if(numero9==10){
	
}
else if(numero9==11){
	
}
else if(numero9==12){
	
}
else if(numero9==13){
	
}
else if(numero9==14){
	
	
}
else if(numero9==15){
	
}
}

else
	System.out.println("El numero no es 1 o 2");
	}
	}


