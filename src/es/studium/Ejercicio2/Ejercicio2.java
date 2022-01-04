package es.studium.Ejercicio2;

public class Ejercicio2 implements Runnable {
	
	
	
	@Override //Porque lo estoy sobreescribiendo
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
		System.out.println("Termina thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Ejercicio2 ejercicio2 = new Ejercicio2();
		Thread hilo = new Thread(ejercicio2, "Hilo de prueba");
		hilo.start();
	}
}
