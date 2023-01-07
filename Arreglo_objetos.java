
package arreglo_objetos;





  



public class Arreglo_objetos {

    // el medodo main señala la clase principal 
    public static void main(String[] args) {
   
    // declaro mi arreglo de tipo sud clase y de tamaño 5
     objeto_Persona arreglo [] = new objeto_Persona [5];
     // Lenamos el arreglo con objetos 
     arreglo[0] = new objeto_Persona("cielo",19);
     arreglo[1] = new objeto_Persona("kevin",20);
     arreglo[2] = new objeto_Persona("andres",23);
     arreglo[3] = new objeto_Persona("brenda",22);
     arreglo[4] = new objeto_Persona("jessica",21);

     
     for(int i=0; i<arreglo.length; i++)
     {
         System.out.println("pocision : ["+i+"] "+arreglo[i].toString());
     }
        
     
    }
    
}

                  