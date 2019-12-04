package es.Studium.Cuadrados;

public class Cuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La suma de los cuadrados es "+FuncCuadrado());
	}
	public static int FuncCuadrado()
	{
		int suma, i;
		suma=0;
		for(i=0; i<=99;i++) 
		{
			suma=suma+(i*i);
		}
		return suma;
	}
}
