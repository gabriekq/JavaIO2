/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2;


import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;


/**
 *
 * @author Gabriel
 */
public class JavaIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
              
       ManageData manege = new ManageData();
       
       HashSet<String>  lista ;
       
       for(int ind=0; ind< 100; ind++  ){
           
           manege.Save( String.valueOf(ind));
           System.out.println("incluido -> "+ind);
       }
        
        
        lista = manege.getAll();        
        System.out.println("Numero da Lista   "+lista.size() );
       
        Iterator<String> interator = lista.iterator();
        
        while(interator.hasNext()){
       
         String  valor =  interator.next();
         System.out.println(valor);
        
        }
        
        
        
     
        manege.Close();
    }
    
}
