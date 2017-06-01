/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package campoestatico;

/**
 *
 * @author Tiago
 */
public class CampoEstatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A obj1 = new A();
        A obj2 = new A();
        obj1.teste = 10;
        obj2.teste = 100;
        A obj3 = new A();
        System.out.println(obj3.teste);
    }
}
