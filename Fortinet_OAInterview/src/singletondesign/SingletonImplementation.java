/**
 * Program to show the implementation of singleton class
 */
package singletondesign;

/**
 * @date	   Sep 21, 2017
 * @author Vaishnavi Sivakumar
 */
public class SingletonImplementation {
	
	private static SingletonImplementation singletonInstance;
	
	/**
	 * private constructor for the class to prevent others to instantiate the singleton class
	 */
	private SingletonImplementation() {
		
	}
	
	/**
	 * Public static method that acts as a global access point to access the singleton object
	 * @return the singletonInstance
	 */
	public static SingletonImplementation getSingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonImplementation();
		}
		return singletonInstance;
	}

}
