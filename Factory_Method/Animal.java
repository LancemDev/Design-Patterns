package Factory_Method;

public abstract class Animal{
    public abstract String getName();
    public static Animal createAnimal(String name){
        if(name.equals("dog")){
            return new dog();
        }else if(name.equals("cat")){
            return new cat();
        }else{
            throw new IllegalArgumentException("Invalid animal name: " + name);
        }
    }  
}
