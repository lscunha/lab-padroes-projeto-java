package one.digitalinovation.gof.singleton;

/**
 * Singleton
 * 
 * @author lscunha
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
