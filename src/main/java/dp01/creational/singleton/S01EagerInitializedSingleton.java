
package dp01.creational.singleton;

public class S01EagerInitializedSingleton {
    
    private static final S01EagerInitializedSingleton instance = new S01EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private S01EagerInitializedSingleton(){}

    public static S01EagerInitializedSingleton getInstance(){
        return instance;
    }
}
