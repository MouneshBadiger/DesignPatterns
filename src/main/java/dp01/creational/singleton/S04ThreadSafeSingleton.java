
package dp01.creational.singleton;

public class S04ThreadSafeSingleton {

    private static S04ThreadSafeSingleton instance;
    
    private S04ThreadSafeSingleton(){}
    
    public static synchronized S04ThreadSafeSingleton getInstance(){//Higher scoper
        if(instance == null){
            instance = new S04ThreadSafeSingleton();
        }
        return instance;
    }

    /*Above implementation works fine and provides thread-safety but it reduces the performance
     *  because of the cost associated with the synchronized method,
     *   although we need it only for the first few threads who might create the separate instances 
     *   To avoid this extra overhead every time, double checked locking principle is used.
     *    In this approach, the synchronized block is used inside the if condition with an additional check to
     *     ensure that only one instance of a singleton class is created.

    Below code snippet provides the double-checked locking implementation.*/
    public static S04ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (S04ThreadSafeSingleton.class) {//lower scope
	            if(instance == null){
	                instance = new S04ThreadSafeSingleton();
	            }
	        }
	    }
	    return instance;
    }

    
}
