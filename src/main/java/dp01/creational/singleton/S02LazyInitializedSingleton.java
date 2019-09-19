
package dp01.creational.singleton;

public class S02LazyInitializedSingleton {

    private static S02LazyInitializedSingleton instance;
    
    private S02LazyInitializedSingleton(){}
    
    public static S02LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new S02LazyInitializedSingleton();
        }
        return instance;
    }
}
