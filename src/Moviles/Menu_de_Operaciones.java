

package Moviles;

//import static Moviles.movil.teclado;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;




public class Menu_de_Operaciones {


    public static ArrayList<movil> listaDeTelefonos = new ArrayList<movil>(); //Esto es una lista de un array
   // public static ArrayList<smartphone> listaDeAplicaciones = new ArrayList<smartphone>(); //Esto es una lista de un array

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //sn.useDelimiter("\n");
        boolean salir = false;
        int opcion =0; //Guardaremos la opcion del usuario
        int telefono;
        int numero = 0;

        while (!salir) {
 
            System.out.println("1. Alta ");
            System.out.println("2. Baja ");
            System.out.println("3. Listado ");
            System.out.println("4. Hacer llamada ");
            System.out.println("5. Hacer foto ");
            System.out.println("6. Borrar foto ");
            System.out.println("7. Instalar aplicaciones ");
            System.out.println("8. Borrar aplicaciones ");
            System.out.println("9. Salir ");
            
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
            switch (opcion) {
                case 1:
                    
            System.out.println(" -_- TIPO DE MOVIL (Subemnu Del Alta) -_- ");


            int opc1=0;
            do{
            System.out.println("       SubMenu De Alta     ");
            System.out.println("1 --- Movil");
            System.out.println("2 --- Multimedia");
            System.out.println("3 --- Smartphone");            
            opc1=sc.nextInt();
 
            switch(opc1){

            case 1:
            //System.out.println("Solicitamos (Pedimos los) Datos del MOVIL ");
                System.out.println("MOVIL");
                
                //System.out.println("El numero de telefono es: ");
                System.out.println("El numero de telefono es: ");
            int Dime_numTelefono = sc.nextInt();
                System.out.println("El IMEI es: ");            
            long Dime_imei = sc.nextLong();
                System.out.println("La marca es: ");
            String Dime_marca = sc.next();
                System.out.println("El modelo es: ");
            String Dime_modelo = sc.next();
                System.out.println("Las llamadas son: ");
            int Dime_llamadas = sc.nextInt();
            

            movil Movil_1 = new movil (Dime_numTelefono, Dime_imei, Dime_marca, Dime_modelo, Dime_llamadas) ;

            
            listaDeTelefonos.add(Movil_1);
            
            break;

            case 2:

                System.out.println("MULTIMEDIA");
            System.out.println("Dime :  numTelefono, imei, marca, modelo, llamadas, camara, fotos ");
            
            

              //AQUI LO MISMO QUE MOVIL + CAM Y FOTOS
            
                System.out.println("El numero de telefono es: ");
            int Dime_numTelefono2 = sc.nextInt();
                System.out.println("El IMEI es: ");            
            long Dime_imei2 = sc.nextLong();
                System.out.println("La marca es: ");
            String Dime_marca2 = sc.next();
                System.out.println("El modelo es: ");
            String Dime_modelo2 = sc.next();
                System.out.println("Las llamadas son: ");
            int Dime_llamadas2 = sc.nextInt();
            
                System.out.println("Los megapixeles de la camara son: ");
            int Dime_Camara = sc.nextInt();
                System.out.println("Cuantas fotos has hecho: ");
            int Dime_Fotos = sc.nextInt();

            multimedia Multimedia_1 = new multimedia(Dime_numTelefono2,Dime_imei2,Dime_marca2,Dime_modelo2,Dime_llamadas2,Dime_Camara,Dime_Fotos);

            listaDeTelefonos.add(Multimedia_1);
                        
            break;

           case 3:
            //System.out.println("Solicitamos (Pedimos los) Datos del MOVIL ");
            System.out.println("SmartPhone");
                        
                System.out.println("El numero de telefono es: ");
            int Dime_numTelefono3 = sc.nextInt();
                System.out.println("El IMEI es: ");            
            long Dime_imei3 = sc.nextLong();
                System.out.println("La marca es: ");
            String Dime_marca3 = sc.next();
                System.out.println("El modelo es (Todo junto): ");
            String Dime_modelo3 = sc.next();
                System.out.println("Las llamadas son: ");
            int Dime_llamadas3 = sc.nextInt();
            
                System.out.println("Los megapixeles de la camara son: ");
            int Dime_Camara2 = sc.nextInt();

                System.out.println("Cuantas fotos has hecho: ");
            int Dime_Fotos2 = sc.nextInt();

                System.out.println("Tienes wifi? Si tienes pon (True) si no pon (False): ");
            boolean Dime_Si_Tienes_Wifi = sc.nextBoolean();
               System.out.println("Que conexion tienes? 2G,3G o 4G");
            String Dime_internet = sc.next();

            movil Smartphone_1 = new smartphone(Dime_numTelefono3,Dime_imei3,Dime_marca3,Dime_modelo3,Dime_llamadas3,Dime_Camara2,Dime_Fotos2,Dime_Si_Tienes_Wifi,Dime_internet);
            
            listaDeTelefonos.add(Smartphone_1);        
            
            break;

            
            default:
            System.out.println("Opcion invalida");
            }            
            }         
            
            while((opc1==4));
            break;
                    case 2:                         
                        //*************METODO ITERATOR HECHO*******************
                        System.out.println("Dime el numero de telefono que quieres que borre de la lista.");                        
                        numero=sc.nextInt();
                        
                        Iterator<movil> it = listaDeTelefonos.iterator();
                            while (it.hasNext()){ // Mientras hay elemento seguiremos en el bucle.
                            movil Movil_1 = it.next();
                            if (numero==Movil_1.Dime_NumTelefono()) {
                              System.out.println("Encontrado y borrado");
                              it.remove(); //it.strd errorr
                             }
                          }
                        
                        break;
                    case 3:
 
                        for (movil Movil : listaDeTelefonos){
                            System.out.println(Movil.toString());
                        }  
                        
                       
                        break;
                    case 4:
 
                        //pido el numero de telefono
                        System.out.println("Dime el numero de telefono");
                        numero = sc.nextInt();
 

                        //Aqui esta llamando a dime llamadas y cuando lo llamaa en el metodo le suma 1.
                        Iterator<movil> it2 = listaDeTelefonos.iterator();
                            while (it2.hasNext()){ // Mientras hay elemento seguiremos en el bucle.
                            movil Movil_1 = it2.next();
                            if (numero==Movil_1.Dime_NumTelefono()) {
                              System.out.println("Encontrado");
                              //Operación
                              Movil_1.Dime_Llamadas();
                              
                             }
                          }

 
                        break;
                    case 5:
 
                        System.out.println("Dime el numero de telefono");
                        numero = sc.nextInt();
                        multimedia x =new multimedia();
                        
                        for (movil Movil : listaDeTelefonos){
                            if(numero==Movil.Dime_NumTelefono()){
                                System.out.println("Encontrado y aumentado");
                               //funcion
                              
                                x = (multimedia) Movil;
                                x.Hacer_Fotos();
                            }
                        }
                        
 
                        break;
                    case 6:
                         
                        System.out.println("Dime el numero de telefono");
                        numero = sc.nextInt();
                        multimedia x2 =new multimedia();
                        
                        for (movil Movil : listaDeTelefonos){
                            if(numero==Movil.Dime_NumTelefono()){
                                System.out.println("Encontrado y borrado");
                                //funcion
                                x2 = (multimedia)Movil;
                                x2.Borrar_Fotos();
                            }
                        }                       
                            
                        break;
                        
                    case 7:
                        
                         System.out.println("Dime el nombre de la aplicacion : ");
                            String Dime_NombreAplicacion = sc.next();
                         System.out.println("Dime el telefono de la aplicacion");
                            int Dime_NumTelefono_De_Aplicacion = sc.nextInt();
                          smartphone sm= new smartphone();
                          
                           for (movil Movil : listaDeTelefonos){
                            if(Dime_NumTelefono_De_Aplicacion==Movil.Dime_NumTelefono()){
                                System.out.println("Encontrado y borrado");
                                //funcion
                                sm= (smartphone)Movil;
                                sm.añadirAplicaciones(Dime_NombreAplicacion);
                            }
                        }   
 
                        break;
                        
                    case 8:

                        
                        System.out.println("Dime el nombre de la aplicacion a borrar: ");
                            String Dime_NombreAplicacion_borrar = sc.next();
                         System.out.println("Dime el telefono de la aplicacion");
                            int Dime_NumTelefono_De_Aplicacion_borrar = sc.nextInt();
                          smartphone sm2= new smartphone();
                          
                        Iterator<movil> borra2 = listaDeTelefonos.iterator();
                            while (borra2.hasNext()){ // Mientras hay elemento seguiremos en el bucle.
                            movil Movil = borra2.next();
                            if (Dime_NumTelefono_De_Aplicacion_borrar==Movil.Dime_NumTelefono()) {
                              System.out.println("Encontrado y borrado");
                              //Operación
                               sm2= (smartphone)Movil;
                                sm2.borrarAplicaciones(Dime_NombreAplicacion_borrar);
                             
                             }
                          }
                        break;
                    
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 9");
                }
 
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
 
        }
 
    }    
 
}
