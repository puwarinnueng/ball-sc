/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty1;

import java.util.Scanner;

/**
 *
 * @nueng
 */
public class boundproperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boundset mySource = new boundset();  
        Listener1 listener1 = new Listener1(); 
        Listener2 listener2 = new Listener2(); 
        mySource.addPropertyChangeListener(listener1); 
        mySource.addPropertyChangeListener(listener2); 
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score: ");
            String inputValue = sc.nextLine();
            if (inputValue.equals("")) {
                break;
            }
            mySource.setInputValue(inputValue);
        }
    }

}
