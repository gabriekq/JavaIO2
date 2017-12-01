/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2;



import java.util.ArrayList;
import javaio2.controler.ManegeDate;
import javaio2.model.Person;
import javax.swing.JOptionPane;


/**
 *
 * @author Gabriel
 */
public class JavaIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
              
       
        ArrayList<Person> peaple = new ArrayList<>();
        ManegeDate manage = new ManegeDate();
  
        
      
         String Name = JOptionPane.showInputDialog("Type the name");
         int age = Integer.parseInt( JOptionPane.showInputDialog("Type the age"));
         double salary = Double.parseDouble( JOptionPane.showInputDialog("Type the  salary") ); 
     
        manage.Save(new Person(Name,age,salary));
       // sava
   
        manage.GetObjects(peaple);
        // ler
        System.out.println(""+peaple.size());
        
       for(Person ObjPessoa :  peaple ){
           System.out.println(ObjPessoa.getName()+ObjPessoa.getAge());
       }
        
    manage.CloseFile();
    }
    
}
