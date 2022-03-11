import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int Calificaciones[] = new int[50];
		
		int n = 0;
		String entrar = "";
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca 50 n�meros enteros:");
		
		while(n < 50) 
		{
			
			entrar = leer.nextLine();
			
			if(entrar.trim().matches("")) 
			{
				System.out.println("No se ha introducido ning�n valor, por favor vuelva a intentarlo introduciendo solo n�meros enteros");
				System.exit(0);
			}
			
			if(!entrar.matches("[0-9].*")) 
			{
				System.out.println("Se ha introducido un valor no v�lido, por favor vuelva a intentarlo introduciendo solo n�meros enteros");
				System.exit(0);
			}
			
			Calificaciones[n] = Integer.parseInt(entrar);
			n++;
		}
		
		System.out.println("");
		System.out.println("Los n�meros introducidos fueron:");
		
		n = 0;
		
		while(n < 50) 
		{
			System.out.println(Calificaciones[n]);
			n++;
		}
		
	}

}
