/**
 * 
 */
package com.otsi.core.constructor;

/**
 * @author praveen.hemadri
 *
 */
public class HelloService {
	private int id;
	private String name;
	private HelloRepository helloRepository;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloRepository getHelloRepository() {
		return helloRepository;
	}

	public void setHelloRepository(HelloRepository helloRepository) {
		this.helloRepository = helloRepository;
	}
	/*
	 * for initailizing HelloRepository and is private because not allowing to
	 * create no args object ie for creating HelloService object we need some
	 * default values....
	 */

	private HelloService() {
		System.out.println("Creating " + this.getClass().getName() + " object");
		HelloRepository helloRepository = new HelloRepository();
		this.setHelloRepository(helloRepository);
	}

	/*
	 * when overrloading a constructor compiler doesnot provide default constructor
	 * so we need to provide constructor when we need zero args construtcor
	 */
	public HelloService(int id, String name) {
		// constructor chaining
		this();
	}

	public static void main(String[] args) {
		HelloService helloService = new HelloService(1, "praveen");
		String result = helloService.sayHello("praveen");
		System.out.println(result);
	}

	private String sayHello(String subject) {
		return "Saying Hello to Subject : " + subject;
	}

}
