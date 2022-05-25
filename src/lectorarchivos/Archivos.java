/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorarchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author User1
 */
public class Archivos {
    BufferedReader lector; //Lee el archivo 
    String linea; //recibe la linea de cada fila
    String partes[] = null; //almacena cada linea leida
    
    
    
    //Metodo en donde se lee la dirección del archivo
    //y se separan para poder utilizar los datos
    public void leerArchivo(String nombreArchivo) {  
        try{
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes = null;
    
        }
        catch(Exception e){
        }
    }
    
    //Metodo en donde se imprime la linea del archivo txt
    //Y se suma todo lo que esta almacenado en dicho documento
    
    public void imprimirLinea(){
        
        double suma = 0;
        double average = 0;
        double numero = 0;
        
        for (int i=0; i< partes.length; i++){   
            System.out.println(partes[i] + "  |  ");  
            System.out.println();
           numero = Double.parseDouble(partes[i]);
           suma = suma + numero;
           
        }    
        average = suma / partes.length;
        System.out.println("La suma de los datos es " +suma+ " y el promedio "+average);
        
        
    }
    
        
    
    
    
    
}
