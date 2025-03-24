
public class four{
    public static void generateException(){
        String text=null;
        System.out.println(text.length());
    }
    public static void HandleException(){
        try {
            String text=null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception"+e.getMessage());
        }
    }
    public static void main(String[] args) {
        
        HandleException();
    }
}