class test {
    private static test dbObject;
 
    private test() {      
    }
 
    public static test getInstance() {
 
       // create object if it's not already created
       if(dbObject == null) {
          dbObject = new test();
       }
 
        // returns the singleton object
        return dbObject;
    }
 
    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
 }
 
 class Main {
    public static void main(String[] args) {
       test db1;
       test db2;
 
       // refers to the only object of Database
       db1= test.getInstance();
       db2= test.getInstance();
       
       db1.getConnection();
       db2.getConnection();
    }
 }
 