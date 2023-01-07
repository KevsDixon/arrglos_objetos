 // este es como la creacion de una sud clase para no abrir otra pestaña
package arreglo_objetos;

public class objeto_Persona {

 // estos son sus atributos de la clase objeto_Persona 
        String nombre = "";
        int edad;
        
         // Este es el constructor de mi clase que resive 2 parametros
        public   objeto_Persona(String nom, int ed)
        {   
            // aqui los atributos los asignamos alos parametros que resive el constructor 
            nombre = nom;
            edad = ed;
        }
        
       // metodo toString para retornar los datos  que contiene los atributos nombre y edad      
         public String toString(){
             
             return "Nombre :"+ nombre + "-->"+ "Edad :"+ edad;
         }
       
        
        
}
