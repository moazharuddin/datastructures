package com.samp.patterns;

public class Singleton {
	
	private static final Singleton instace = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instace;
	}

}

class ThreadSingleton{
	private static ThreadSingleton instance;
	
	private ThreadSingleton() {
	}
	
	public static synchronized ThreadSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSingleton(); 
		}
		return instance;
	}
}
