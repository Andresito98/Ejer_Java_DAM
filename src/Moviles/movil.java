

package Moviles;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class movil  {
    
    static Scanner teclado=new Scanner (System.in);
    
 
    private int numTelefono;    
    private long IMEI;    
    private String marca;
    private String modelo;
    private static int llamadas=0; //bucle
    

    public movil (){

}
    public movil (int numTelefono,long IMEI,String marca,String modelo,int llamadas) {
    
        this.numTelefono = numTelefono;
        this.IMEI = IMEI;
        this.marca = marca;
        this.modelo = modelo;
        this.llamadas = llamadas;

}
    

    public static void numTelefono(){
          
    System.out.println( "Escribe un numero de telefono. 9 digitos"); 
    String cadena=teclado.nextLine(); 
        
     Pattern pat = Pattern.compile("[0-9]{9}");
     Matcher mat = pat.matcher(cadena);

     if (mat.matches()) {
         System.out.println("SI");
     } else {
         System.out.println("NO");
     }
    }

    public int Dime_NumTelefono() {
        return numTelefono;
    }

    public void Establece_NumTelefono(int dime_numTelefono) {
        this.numTelefono = dime_numTelefono;
    }
    
    
  //----------------------------------------------------------------------------------


    public static void IMEI(){
          
    System.out.println( "Escribe un numero de IMEI. 15 digitos"); 
    String cadena=teclado.nextLine(); 
        
     Pattern pat = Pattern.compile("[0-9]{15}");
     Matcher mat = pat.matcher(cadena);

     if (mat.matches()) {
         System.out.println("SI");
     } else {
         System.out.println("NO");
     }
    }

    public long Dime_IMEI() {
        return IMEI;
    }

    public void Establece_IMEI(long dime_IMEI) {
        this.IMEI = dime_IMEI;
    }
    
    

//----------------------------------------------------------------------------------
    
        //No devuelve dato solo lo modifica
    public void establece_marca (String dime_marca){ //SETTER
        marca=dime_marca;
    }
    
         //Este solo mostrara datos
    public String dime_marca (){
        return "La marca del movil es : "+marca;
    }
    
 //----------------------------------------------------------------------------------   
            //No devuelve dato solo lo modifica
    public void establece_modelo(String dime_modelo){ //SETTER
        modelo=dime_modelo;
    }
    
         //Este solo mostrara datos
    public String dime_modelo (){
        return "El modelo del movil es : "+modelo;
    }
    
 //----------------------------------------------------------------------------------
    

    public int Dime_Llamadas() {
        return llamadas ++;
    }

    public void Establece_Llamadas(int dime_llamadas) {
        this.llamadas = dime_llamadas;
    }
    
    public void llamar()
    {this.llamadas++;}
    
    
    
 //----------------------------------------------------------------------------------   
    
    @Override
    public String toString (){
        
        return " El numero de telefono es: "+numTelefono+" El IMEI es: "+IMEI+" La marca es:  "+marca+" El modelo es: "+modelo+ " Las llamadas son : "+llamadas;
    }

    
}
    
