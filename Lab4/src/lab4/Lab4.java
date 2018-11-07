/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author dias
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Human human = new Human("Homer");
        human.work();
        human.relax();
        System.out.println(human);
        
        Student student = new Student("Dias", 3.69);
        student.relax();
        student.cheat();
        System.out.println(student);
        
        Human kon = new Kid("Tommy", 3);
        kon.talk();
        System.out.println(kon);
        
        Oap oap= new Oap("John");
        oap.relax();
        System.out.println(oap);
        
    }
    
}
