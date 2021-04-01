/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cad.prueba.tecnica.service;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class Algoritmia {
    public int[] arregloNumeros(int entrada[]){
        int salida[];
        
        Arrays.sort(entrada);
        salida = new int[entrada[entrada.length-1]];
        
        for (int i = 0; i < salida.length; i++) {
            salida[i] = i+1;
            
        }
        
     return salida;   
    }
    
    public String cadenaProactiva(String cadena){
        //char arreglo[] = cadena.toCharArray();
        StringBuilder respuesta = new StringBuilder(cadena);
        char c;
        char c1;
        for (int i = 0; i < respuesta.length(); i++) {
            c = respuesta.charAt(i);
            if ( (c >= (char)97 && c <= (char)122) || c == (char)164 ){
                c1 = c;
                if ( c >= (char)97 && c <= (char)109){
                    respuesta.setCharAt(i,++c1);
                } else if(c == (char)110){
                    respuesta.setCharAt(i,(char)164);
                } else if(c == (char)164){
                    respuesta.setCharAt(i,(char)111);
                } else if( c >= (char)111 && c <= (char)121){
                    respuesta.setCharAt(i,++c1);
                } else if(c == (char)122){
                    respuesta.setCharAt(i,(char)97);
                }
            }
            if ( (c >= (char)65 && c <= (char)90) || c == (char)165 ){
                c1 = c;
                if ( c >= (char)65 && c <= (char)77){
                    respuesta.setCharAt(i,++c1);
                } else if(c == (char)78){
                    respuesta.setCharAt(i,(char)164);
                } else if(c == (char)165){
                    respuesta.setCharAt(i,(char)79);
                } else if( c >= (char)79 && c <= (char)89){
                    respuesta.setCharAt(i,++c1);
                } else if(c == (char)90){
                    respuesta.setCharAt(i,(char)65);
                }
            }
        }
        
        return respuesta.toString();
    }
    
    public double[][] dinero(double monto){
        return null;
    }
}
