/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable;

/**
 *
 * @author fatkhan
 */
public class Variable {

    public void fatAge(){
        int age = 0;
        age = age + 18;
        System.out.println("Fatkhan age is : " + age);
    }
    
    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.fatAge();
    }
    
}
