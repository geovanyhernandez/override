public class SuperMercado extends InfoMercado{

 private int idSuper;
 //constructor//
 public SuperMercado(String nombresuper, String direccion) { 
     //la palabra super hace referencia a Main donde esta el constructor Supermercado y coge a nombresuper y direccion que los extedenra a InfoMercado. 
     super(nombresuper, direccion);
    
 }
 
 public void setIdSuper(int idSuper){
     this.idSuper=idSuper;
 }

 public int getIdSuper(){
     return idSuper;
 }
        @Override  //el override es para sobre escribir en la clase infroMercado lo que esta en "verDatosdeProductos".
        public void verDatosdeProductos() {
            //super apunta a la clase padre que seria infomercado y .verDatosdeProductos(), apunta ah  public void verDatosdeProductos() el cual tiene los System.out.println esto lo hacemos para no escribir nuevamente lo system por que ya lo tenemos escrito en  public void verDatosdeProductos() de infomercado
             // si no escribieramos: super.verDatosdeProductos(), los machacaria todo lo que esta en InfoMercado y solo los mostratia el System.out de idSuper 
               super.verDatosdeProductos(); 
		System.out.println("id del supermercado: " + idSuper);
        }
 
}