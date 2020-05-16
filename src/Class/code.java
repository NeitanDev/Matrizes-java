/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author natan
 */
public class code {
    public void mostramat(){
        int m[][] = new int[4][8];
        int sounou = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<8;j++){
                System.out.print(sounou+" ");
                sounou++;
            }
            System.out.println(" ");
        }
    }
}
