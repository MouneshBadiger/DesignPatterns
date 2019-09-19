
package dp01.creational.singleton;

public class S05BillPughSingleton {

    private S05BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final S05BillPughSingleton INSTANCE = new S05BillPughSingleton();
    }
    
    public static S05BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
