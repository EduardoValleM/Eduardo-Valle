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
public class Imc {
    public float calcular (Usuario u )
    {
        // aqui va la logica del calculo
     float resultado= u.peso/(u.altura*u.altura);
     return resultado;
    }
}
