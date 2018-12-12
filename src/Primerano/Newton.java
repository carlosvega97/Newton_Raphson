package Primerano;

/**
 * @author Jorge Da Silva
 * @author José Aceituno
 * @version 1.0
 */
import java.util.Scanner;

public class Newton 
{

	static Scanner sc;
	static int contador = 0;
	static double LecturaNum(){
		sc = new Scanner(System.in);
		double num;

		while(!sc.hasNextDouble()) { 
			System.out.println("Introduzca un valor válido:");
			sc.next();
		}
		num = sc.nextDouble();
		return num;
	}
	public static double calcularResultadoNoDerivado(double x)
	{
		double resultadoNoDerivado;
		resultadoNoDerivado = (-2)*Math.log10((0.75+0.93121*x)/1855)-x;
		System.out.print(resultadoNoDerivado);

		return resultadoNoDerivado;
	}
	public static double calcularResultadoDerivado(double x)
	{
		double resultadoDerivado;
		resultadoDerivado = (-2*((0.93121/(0.75+0.93121*x)*(1/Math.log(10))))-1);
		System.out.print("\t\t"+ resultadoDerivado);
		return resultadoDerivado;
	}
	public static double calcularResultado(double resultadoNoDerivado, double resultadoDerivado, double x)
	{
		double resultado = x - (resultadoNoDerivado / resultadoDerivado);
		return resultado;
	}

	public static void main(String[] args) {
		double x;
		int error;
		double resultadoNOderivado = 0;
		double resultadoDerivado;
		double resultado = 0;

		System.out.println("Introduzca el valor de x: ");


		x = Newton.LecturaNum();
		System.out.println("Cuantos 0's de error vas a permitir, por ejemplo, 12.");
		error = (int) Newton.LecturaNum();
		System.out.print("El resultado NO derivado es:");
		System.out.print("\tEl resultado Derivado es:");
		do 
		{
			System.out.println();
				resultadoNOderivado = calcularResultadoNoDerivado(x);
				resultadoDerivado = calcularResultadoDerivado(x);
				resultado = calcularResultado(resultadoNOderivado, resultadoDerivado, x);
				x = resultado;
				contador++;	
			
			
		}while (!(resultadoNOderivado <= Math.pow(10, -error)));
		System.out.println();
		System.out.println("El resultado final: " + resultadoNOderivado);
		System.out.println("La raiz de la función es: " + resultado);
		System.out.println("El nº de iteraciones ha sido: " +contador);

	}
}
