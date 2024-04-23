public class GenericImplementation {
    
    public static void main(String[] args) {
    GenericClass<String> generic = new GenericClass<>("Hello World");
    
    System.out.println(generic.getDataPertama());
    
    generic.setDataPertama("Hello semua!");
    System.out.println(generic.getDataPertama());
    }
}