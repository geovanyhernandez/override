public class InfoMercado{
   private String nombreSuper;
   private String direccion;

   /*ejemplo: protected String nombreSuper;//protected significa que si puede ser accedida por las classes hijos*/
  
    
    public InfoMercado (String nombreSuper, String direccion) {
		
		this.nombreSuper = nombreSuper;
		this.direccion = direccion;
	}
    
    
    public void setNombreSuper(String nombreSuper){
        this.nombreSuper=nombreSuper;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getNombreSuper(){
        return nombreSuper;
    }
    public String getDireccion(){
        return direccion;
    }
    
     public void verDatosdeProductos() {
		System.out.println("\n--- Super Mercado ---");
		System.out.println("Nombre de supermercado: " + nombreSuper);
		System.out.println("Dirección de supermercado: " + direccion);
        }
    
}