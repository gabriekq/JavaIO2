/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2.controler;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javaio2.model.Person;

/**
 *
 * @author Gabriel
 */
public class ManegeDate {
    
private ObjectOutputStream output;    
private ObjectInputStream input;    

    public ManegeDate() {
    
    try{
      output = new ObjectOutputStream(new FileOutputStream("pessoa.ser"));
      input = new ObjectInputStream(new FileInputStream("pessoa.ser"));
     }catch(IOException ioException){
          System.err.println("Erro to open the file");
     }
    
    }

    
public void Save(Person pessoa){
  
    try{
    output.writeObject(pessoa);
    output.flush();
    }catch(IOException ioExeption){
    
        System.err.println("Error writing to file.");
    }
    
}

 public void GetObjects(ArrayList<Person> peaple){
 
 try{
 
 while(true){
  Person ObjPerson =  (Person) input.readObject();
  peaple.add(ObjPerson);
  }
 
 }catch(EOFException endOfFileException){
       
    //System.err.println("end of file was reached"); 
 }catch( ClassNotFoundException classNotFoundException){
 
 System.err.println( "Unable to create object." );
 
 }catch(IOException ioException){
 System.err.println( "Error during read from file." );
 }
 
 
 }



public void CloseFile(){

    try{
    
        if(input != null ){
        input.close();
        }
        
        if(output != null){
        output.close();
        }
        
    }catch(IOException ioEception ){
    
        System.err.println("Error Closing file");
        System.exit(1);
        
    }
    
}
    
    
    
    
}
