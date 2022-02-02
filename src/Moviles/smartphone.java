
package Moviles;

//import static Moviles.movil.teclado;
import java.util.ArrayList;
import java.util.List;


public class smartphone extends multimedia{
    
    private boolean wifi ;
    private String internet;
   // private String nomApli;
   // private int numTelefoApli;   //APLICACIONES DEBE SER UN ARRAYLIST DE ENTEROS
    private ArrayList<String> listaDeAplicaciones = new ArrayList<String>(); //Esto es una lista de un array

    
    //EL APARTADO DE INSTALAR APP Y BORRAR APP HACER CON ARRAYLIST MIRAR ARRAYLIST.

    public smartphone() {
    }
     

    
    /*@Override*/
    public smartphone (int numTelefono,long IMEI,String marca,String modelo,int llamadas,int camara,int fotos ,boolean wifi,String internet){
        
        
        super (numTelefono,IMEI,marca,modelo,llamadas,camara,fotos); 
        
        this.wifi=wifi;
        this.internet=internet;
    }


   


 //----------------------------------------------------------------------------------

    public boolean Dime_Wifi() {

        return wifi;
    }

    public void Establece_Wifi(boolean dame_wifi) {
        this.wifi = dame_wifi;
    }

    public String Dime_Internet() {
        return internet;
    }

    public void Establece_Internet(String dame_internet) {
        this.internet = dame_internet;
    }

    
//----------------------------------------------------------------------------------

    public ArrayList<String> getListaDeAplicaciones() {
        return listaDeAplicaciones;
    }
        
      public void añadirAplicaciones(String apli) {
        this.listaDeAplicaciones.add(apli);
    }
    
      public void borrarAplicaciones(String apli) {
        this.listaDeAplicaciones.remove(apli);
    }
       
    
 //----------------------------------------------------------------------------------


   

 
    
//----------------------------------------------------------------------------------
   
        
//----------------------------------------------------------------------------------

    @Override
    public String toString() {
        return super.toString()+" smartphone{" + "wifi=" + wifi + ", internet=" + internet + ", listaDeAplicaciones=" + listaDeAplicaciones + '}';
    }

    
}