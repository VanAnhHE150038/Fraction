/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction a = new Fraction(4, 6);
        a.reduceFraction();
        a.recipFraction();
        Fraction b = new Fraction(5, 10);
        
        a.addFraction(b);
        b.addFraction(a);
    }
}

