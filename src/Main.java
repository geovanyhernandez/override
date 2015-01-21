import java.util.Hashtable;

public class Main{
    public static void main(String[] args){
      
    	Hashtable <String, Integer> precio = new Hashtable <String, Integer> ();		
      precio.put("leche", 1);
	  precio.put("agua",  2);  	
       
       System.out.println("\n--- Precio de productos ---");
		System.out.println("precio de leche: " + precio.get("leche"));
		System.out.println("precio de agua: " + precio.get("agua"));
		
		 System.out.println("\n---------");
		 
		 String nombresuper = null, direccion = null; 
		 SuperMercado sup = new SuperMercado(nombresuper, direccion);
       
       sup.setNombreSuper("lidl");
       sup.setDireccion("labretxa");
       sup.setIdSuper(123);
      
       sup.verDatosdeProductos();
        
    }
}