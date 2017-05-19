/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardo_valle;

/**
 *
 * @author T-
 */
public class Eduardo_Valle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //inician pruebas de caja negra
        //crearemos un usuario hipotetico
        Usuario u= new Usuario();
        //ahora le asignaremos valores
        u.altura=1.86f;
        u.peso=90f;
        //Generaremos el modelo
        Imc imc = new Imc();
        
        System.out.println("el valor es"+ imc.calcular(u) );
    }
    
}
