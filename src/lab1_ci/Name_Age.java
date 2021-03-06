package lab1_ci;
import java.util.*;
public class Name_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Enter your Age");
		
		int edad=entrada.nextInt();
		
		
//		int nextyear=(edad+1);
		
		System.out.println("Hi " + nombre_usuario + ", you are " + edad + " years old");
//					System.out.println("Hi " + nombre_usuario + " Next Year You are  " + nextyear + " years old");
//		System.out.println("Hi " + nombre_usuario + " You are  " + (edad+1) + " years old");

		//Close entrada var
		
		entrada.close();
	}

}