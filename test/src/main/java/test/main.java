package test;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hola mundo ");
		boolean flag = true;
		String cadena = "soy una cadena";
//		int numero = 1;
//		float decimales = 1.5f;
		Boolean response = movimiento(flag);
		System.out.println("el valor de la respuesta es:" + response);
	}
	public static Boolean movimiento(boolean x) {
		System.out.println("el valor de x es:" + x);
		return x;
		
	}

}
