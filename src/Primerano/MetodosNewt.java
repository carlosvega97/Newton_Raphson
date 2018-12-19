package Primerano;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodosNewt {
	private static Scanner teclado = new Scanner(System.in);

	public static void perdirNumPolinomios() {
		
		try {
			System.out.println("Introduce el tamaño del polimio: ");
			int numeroArrayPolinomio = teclado.nextInt();
			teclado.nextLine();
			System.out.println("introduce el grado del polinomio (maximo): ");
			int expMax = teclado.nextInt();
			
			// esto es un array del tamaño del grado del polinomio
			Polinomio Polinomios[] = new Polinomio[numeroArrayPolinomio];
			rellenarArrayPolinomio(Polinomios, expMax);



		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Introduce un número: ");
			teclado.nextLine();
		}
}
		

	// este metodo rrellena todo el array con polinomios
	public static void rellenarArrayPolinomio(Polinomio[] polinomios, int expMax) {
		for (int i = 0; i < polinomios.length; i++) {
			polinomios[i] = pedirPolinomio(expMax);
		}
		String Str_polinomio = "";
		System.out.println("array polinomios: ");
		for (Polinomio polinomio : polinomios) {
			Str_polinomio = Str_polinomio + polinomio.getSimbolo() + polinomio.getNumero() + "X^"
					+ polinomio.getSimboloExp() + polinomio.getExponente() + " ";
		}
		System.out.println("el polinomio es: " + Str_polinomio);
		// recorrer el string y preguntar si es + elimonar el primer caracter
		ArrayList<Polinomio> arrayPolinomioDerivado = new ArrayList<Polinomio>();
		arrayPolinomioDerivado = derivar(polinomios);
		// pedirXsub0(arrayPolinomioDerivado, polinomios);
	}

	// pide y devuelve un polinomio
	private static Polinomio pedirPolinomio(int expMax) {
		// falta hacer que introduzca los valores correctos
		int x, exp;
		String simbolo, simboloExp;
		System.out.println("introduzca signo de la X (SOLO si es '+' o '-')");
		simbolo = teclado.nextLine();
		System.out.println("introduzca valor que multiplica la X:");
		x = teclado.nextInt();
		teclado.nextLine();
		System.out.println("introdusca signo del exponente de la X (SOLO si es '+' o '-')");
		simboloExp = teclado.nextLine();
		System.out.println("introduzca valor del exponente");
		exp = teclado.nextInt();
		Boolean rompeBucle = true;
		while (rompeBucle) {
			if (exp > expMax) {
				System.out.println("introduzca un valor menor que el exponente maximo.");
				exp = teclado.nextInt();
			} else {
				rompeBucle = false;
			}
		}
		teclado.nextLine();
		Polinomio poli = new Polinomio(simbolo, x, exp, simboloExp);
		return poli;
	}

	// este metodo devuelve un array list con los polinomios derivados
	private static ArrayList<Polinomio> derivar(Polinomio[] polinomios) {
		ArrayList<Polinomio> arrayPolinomioDerivado = new ArrayList<Polinomio>();
		String PolinomioDerivado = "";
		for (Polinomio polinomio : polinomios) {
			int numDev = polinomio.getExponente() * polinomio.getNumero();
			int expDev;
			String simboloNumdev, simboloExpDev = null;
			// falta que si el exponente es negativo se multiplique los signos
			if (polinomio.getSimbolo().equals(polinomio.getSimboloExp())) {
				simboloNumdev = "+";
			} else {
				simboloNumdev = "-";
			}
			if (polinomio.getSimboloExp().equals("-")) {
				simboloExpDev = "-";
				expDev = polinomio.getExponente() + 1;
			} else {
				simboloExpDev = "+";
				expDev = polinomio.getExponente() - 1;
			}
			Polinomio polin = new Polinomio(simboloNumdev, numDev, expDev, simboloExpDev);
			arrayPolinomioDerivado.add(polin);
		}
		for (Polinomio polinomioDev : arrayPolinomioDerivado) {
			PolinomioDerivado = PolinomioDerivado + polinomioDev.getSimbolo() + polinomioDev.getNumero() + "X^"
					+ polinomioDev.getSimboloExp() + polinomioDev.getExponente() + " ";
		}
		System.out.println("el polinomio derivado es: " + PolinomioDerivado);
		return arrayPolinomioDerivado;
	}

	// este metodo pide x sub cero y numero de iteraciones
	public static void pedirXsub0() {
		System.out.println("introduzca el valor de xº");
		int valorX = teclado.nextInt();
		System.out.println("introduzaca numero de iteraciones:");
		int numIteraciones = teclado.nextInt();
		// newton(valorX, numIteraciones, arrayPolinomioDerivado, polinomios);
	}

	// este metodo hace todas las raices del polinomio
	private static void newton(int valorX, int numIteraciones, ArrayList<Polinomio> arrayPolinomioDerivado,
			Polinomio[] polinomios) {
	}
}