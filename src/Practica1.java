import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero1=0;
		int numero2=0;
		
System.out.println("Elija el Nivel de los problemas que desea ver 1 o 2");
numero1 = s.nextInt();
if(numero1 == 1){
	System.out.println("Escoja el problema que desee del 1 al 5 ");
	numero2=s.nextInt();
	if(numero2==1){
		System.out.print("    *\n   ***\n  *****\n *******\n*********\n *******\n  *****\n   ***\n    *");	
	}
	else if(numero2==2){
		
	}
}

else if(numero1==2){
System.out.println("Escoja un numero del 6 al 15 ");



}
else{
	System.out.println("El numero no es 1 o 2");
}		
	}

}

