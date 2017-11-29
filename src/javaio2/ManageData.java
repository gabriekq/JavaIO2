/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ManageData    {

     PrintWriter recordFile;
     Scanner input;
             
    public ManageData() throws FileNotFoundException {
    recordFile = new PrintWriter(new FileOutputStream( new File("arquivo.txt"),true)   );
    
    }
       
 public void Save(String valor ) {
     
   recordFile.printf(valor+"%n"); 
   recordFile.flush();
 }
 
 private void OpenFile(){
 
 try{
 input = new Scanner(new File("arquivo.txt")  );
 
 }catch(FileNotFoundException  fileNotFoundException  ){
 
     System.err.println("Error opening file.");
     System.exit(1);
 }
 
 }
 
 
 public HashSet<String> getAll(){
 OpenFile();
 HashSet<String> lista = new  HashSet<String>() ;
   
 try{
     
   while(input.hasNext()){
   lista.add( input.next());      
   }
 
 }catch(NoSuchElementException elementException){
 
      System.err.println( "File improperly formed." );
      input.close();
      System.exit( 1 );
 
 }catch(IllegalStateException stateException){
  System.err.println( "Error reading from file." );
  System.exit( 1 );
 }
 
 Close();
 return lista;
 }
 
 
 
 
 public void Close(){
  recordFile.close();
  input.close();
  
 }
    
 
 
    
}
