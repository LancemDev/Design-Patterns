public class Singleton{
    private static Singleton instance = null;
    private int counter = 0;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            //This is the only instance that is created in the entire program
            instance = new Singleton();
        }
        return instance;
    }
    public void incrementCounter(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}