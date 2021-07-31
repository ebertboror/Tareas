/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist_v2;

/**
 *
 * @author carlo
 */
public class Mylist_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       lista a = new lista();
        a.insertar(4, 1);
        a.imprimir();
        a.insertar(5, 6);//insertar( int, int)
       
        a.imprimir();
    }
    
}
