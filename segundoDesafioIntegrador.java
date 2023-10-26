package segundoDesafioIntegrador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class segundoDesafioIntegrador {
	static int opcion, n1, n2, resultado;
	static char Respuesta;
	static boolean bandera = false;	
	
public static void IngDatos() {
	Scanner datos = new Scanner(System.in);
	try {
	System.out.println("\tSeleccionar una operacion\n");
	
	System.out.println("1.Suma");
	System.out.println("2.Resta");
	System.out.println("3.Division");
	System.out.println("4.Multiplicacion");
	
	System.out.println("\nOpcion seleccionada: ");
	opcion = datos.nextInt();
	
	if(opcion >= 5 || opcion <= 0) {
		throw new InputMismatchException();
	}
	}catch (InputMismatchException e) {
        System.out.println("Error: Debés ingresar un dato valido."); 
	}
}
public static void IngN1N2(){
	Scanner datos = new Scanner(System.in);
	System.out.println("Ingresar un numero: ");
	n1 = datos.nextInt();
	System.out.println("Ingresar otro numero: ");
	n2 = datos.nextInt();
}
public static void suma() {
	try {
	Scanner datos = new Scanner(System.in);
	IngN1N2();
	resultado = n1 + n2;
		
	System.out.println("El resultado de la operacion es: "+ resultado);
	}catch (InputMismatchException e) {
        System.out.println("Error: Debés ingresar un dato valido."); 
	}
}
public static void resta(){
	try {
	Scanner datos = new Scanner(System.in);
	IngN1N2();
	resultado = n1 - n2;
		
	System.out.println("El resultado de la operacion es: "+ resultado);
	}catch (InputMismatchException e) {
        System.out.println("Error: Debés ingresar un dato valido."); 
	}
}
public static void division(){
	Scanner datos = new Scanner(System.in);
	try {
		IngN1N2();
		if(n1 == 0 || n2 == 0) {
				throw new ArithmeticException();
		}
		resultado = n1 / n2;
			
		System.out.println("El resultado de la operacion es: "+ resultado);
	}catch(ArithmeticException e){
		System.out.println("Error: No se puede dividir entre 0");
	}catch (InputMismatchException e) {
        System.out.println("Error: Debés ingresar un dato valido."); 
	}
}
public static void multiplicacion(){
	Scanner datos = new Scanner(System.in);
	try {
	IngN1N2();
	resultado = n1 * n2;
		
	System.out.println("El resultado de la operacion es: "+ resultado);
	}catch (InputMismatchException e) {
        System.out.println("Error: Debés ingresar un dato valido."); 
	}
}
public static void seguirOno(){
	Scanner datos = new Scanner(System.in);
	System.out.println("\nDesea seguir con el programa?(elegir S o N)");
	Respuesta = datos.next().charAt(0);
		
	if(Respuesta == 'S'|| Respuesta == 's') {
		bandera = false;
	}
	if (Respuesta == 'N'|| Respuesta == 'n') {
		bandera = true;
	}
}
public static void main(String[] args) {
	Scanner datos = new Scanner(System.in);
		
	while(bandera != true) {
	IngDatos();
	switch(opcion) {
	case 1:{suma();
		seguirOno();
		break;
		}
	case 2:{resta();
		seguirOno();
		break;
		}
	case 3:{division();
		seguirOno();
		break;
		}
	case 4:{multiplicacion();
		seguirOno();
		break;
		}
	}
	}
}
}
