/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorarchivos;

/**
 *
 * @author User1
 */
public class LectorArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Archivos archivo = new Archivos();
        
        archivo.leerArchivo("C:\\archivo\\numeros.txt");
        
        
    }
    
}
