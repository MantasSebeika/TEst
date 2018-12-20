/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manta
 */
public class SaskiuLenta extends Lenta {
   
    public SaskiuLenta() {
        lenta = new char[Dydis][Dydis];
        balta = 12;
        juoda = 12;
        kienoejimas = 'B';
        // Isdeliojame saskes
        for (int i = 0; i < Dydis; i++) {
            for (int j = 0; j < Dydis; j++) {
                lenta[i][j] = '_';
            }
        }

        for (int i = 1; i < Dydis; i += 2) {
            lenta[i][1] = 'B';
            lenta[i][5] = 'J';
            lenta[i][7] = 'J';
        }
        for (int i = 0; i < Dydis; i += 2) {
            lenta[i][0] = 'B';
            lenta[i][2] = 'B';
            lenta[i][6] = 'J';
        }
    }
    @Override
             public String Informacija(){
        return "As Saskiu lenta";
             }

}
