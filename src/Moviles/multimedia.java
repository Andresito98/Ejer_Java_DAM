

package Moviles;



public class multimedia extends movil {
    
    //private movil [] moviles;
    private int camara;
    private int fotos;

    public multimedia() {
    }
   
     

    /*@Override*/
    public multimedia (int numTelefono,long IMEI,String marca,String modelo,int llamadas,int camara,int fotos){
        
        super(numTelefono, IMEI , marca , modelo , llamadas );
        
        this.camara=camara;
        this.fotos=fotos;
    
        
    }


  
    //----------------------------------------------------------------------------------
    
    public int Dime_Camara() {
        return camara;
    }

    public void Establece_Camara(int dame_camara) {
        this.camara = dame_camara;
    }

    //----------------------------------------------------------------------------------
    
    
    public int Dime_Fotos() {
        return fotos ;
    }

    public void Establece_Fotos(int dame_fotos) {
        this.fotos = dame_fotos;
    }
    
    //----------------------------------------------------------------------------------
    
    public int Borrar_Fotos (){
        return fotos --;
    }
    
    public int Hacer_Fotos (){
        return fotos ++;
    }
    
  //----------------------------------------------------------------------------------       
    @Override
    public String toString (){
        
        return super.toString()+", la camara tiene = "+ camara +" Megapixeles"+ " y ha hecho " +fotos+" fotos";
    }

        

}
