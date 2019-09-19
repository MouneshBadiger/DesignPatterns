
package dp01.creational.singleton;
//same as eager initialization except it support exception handling while creating singleton object
public class S03StaticBlockSingleton {

    private static S03StaticBlockSingleton instance;
    
    private S03StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new S03StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static S03StaticBlockSingleton getInstance(){
        return instance;
    }
}
