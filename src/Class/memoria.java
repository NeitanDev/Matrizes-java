/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Random;

/**
 *
 * @author natan
 */
public class memoria {
    public void sortear(){
        int m[][] = new int[4][8];
        Random ran = new Random();
        int num = 1;
        
        while(num<17){
            int lin = ran.nextInt(4);
            int col = ran.nextInt(8);
            boolean existe = true;
            
            while(existe==true){
                if(m[lin][col]==0){
                    m[lin][col]=num;
                    existe = false;
                } else {
                    lin = ran.nextInt(4);
                    col = ran.nextInt(8);
                }
            }
            existe = true;
            lin = ran.nextInt(4);
            col = ran.nextInt(8);
            while(existe==true){
                if(m[lin][col]==0){
                    m[lin][col]=num;
                    existe = false;
                } else {
                    lin = ran.nextInt(4);
                    col = ran.nextInt(8);
                }
            }
        
            num++;
        }
        
        
        for(int i=0; i<4; i++){
            for(int j=0; j<8;j++){
                System.out.print(m[i][j]+"  ");
            }
            System.out.println("    ");
        }
    }
}
