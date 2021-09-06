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
public class Fraction {

    private int num;
    private int den;

    public Fraction() {
    }

    public Fraction(int num, int den) {
        this.den = den;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public int GCD(int m, int n) {
        if (m < 0) {
            m = -m;
        }
        if (n < 0) {
            n = -n;
        }
        if (m == 0 || n == 0) {
            m = m + n;
        }
        while (m != n) {
            if (m > n) {
                m -= n;
            } else {
                n -= m;
            }
        }
        return m;
    }

    public void reduceFraction() {
        System.out.println("ReduceFraction: " + (num / GCD(num, den)) + "/" + (den / GCD(num, den)));
    }

    public void recipFraction() {
        int x = num;
        num = den;
        den = x;
        System.out.println("reciprocal: " + num + "/" + den);
    }

    public void addFraction(Fraction f2) {
        int numR, denR;
        numR = num * f2.getDen() + f2.getNum() * den;
        denR = den*f2.getDen();
        Fraction result = new Fraction(numR, denR);
        System.out.print("Sum: ");
        result.reduceFraction();
    }

    public void subFraction(Fraction f2) {
        int numR, denR;
        int m = num, n= den;
        numR = m * f2.getDen() - den * f2.getNum();
        denR = n * f2.getDen();
        Fraction result = new Fraction(numR, denR);
        System.out.print("Subtraction: ");
        result.reduceFraction();

    }

    public void mulFraction(Fraction f2) {
        int numR, denR;
        int m = num, n = den;
        numR = m*f2.getNum();
        denR = n*f2.getDen();
        Fraction result = new Fraction(numR, denR);
        System.out.print("Multiply: ");
        result.reduceFraction();

    }

    public void divFraction(Fraction f2) {
        int numR, denR;
        int m = num, n = den;
        numR = m*f2.getDen();
        denR = n*f2.getNum();
        Fraction result = new Fraction(numR, denR);
        System.out.print("Division: ");
        result.reduceFraction();
        
    }
    
    public void cmpFraction(Fraction f2) {
        float x1 = num/den;
        float x2 = f2.getNum()/f2.getDen();
        if(x1<x2) System.out.println("fraction1 is less then fraction2");
        if(x1>x2) System.out.println("Fraction1 is bigger than fraction2");
        else System.out.println("2 fractions are equal");
    }
}
   

