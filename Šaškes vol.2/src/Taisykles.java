
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manta
 */
public class Taisykles {

    Lenta lenta;
    Spausdintuvas spausdintuvas;

    public Taisykles(Lenta lenta, Spausdintuvas spausdintuvas) {
        this.lenta = lenta;
        this.spausdintuvas = spausdintuvas;
    }

    public void kitasejimas() {

        spausdintuvas.printLenta();
        Scanner stdin = new Scanner(System.in);

        if (lenta.getKienoejimas() == 'B') {
            spausdintuvas.printString("Baltų ejimas");
        } else {
            spausdintuvas.printString("Juodų ejimas");
        }

        boolean moved = false;
        // Ciklas kol padaromas teisingas ejimas
        while (!moved) {
            spausdintuvas.printString("Pasirinkite langelį iš kurio norite pajudėti");
            spausdintuvas.printString("PVZ: x=5, y=3, įveskite 53");
            int movefrom = stdin.nextInt();

            spausdintuvas.printString("Įveskite langelį į kurį norite pajudėti ");
            int moveto = stdin.nextInt();

            if (GalimasEjimas(movefrom, moveto)) {
                Vykdymas(movefrom, moveto);
                moved = true;
            } else {
                spausdintuvas.printString("Šis ėjimas negalimas, bandykite dar karta");
            }
        }

        // Pasako kieno ejimas
        if (lenta.getKienoejimas() == 'B') {
            lenta.setKienoejimas('J');
        } else {
            lenta.setKienoejimas('B');
        }

        if (Pabaiga()) {
            spausdintuvas.printPabaiga(Nugaletojas());
        } else {
            kitasejimas();
        }
    }

    public Lenta getLenta() {
        return lenta;
    }

    public void setLenta(Lenta lenta) {
        this.lenta = lenta;
    }

    public Spausdintuvas getSpausdintuvas() {
        return spausdintuvas;
    }

    public void setSpausdintuvas(Spausdintuvas spausdintuvas) {
        this.spausdintuvas = spausdintuvas;
    }

    // Ar ejimas galimas ?
    public boolean GalimasEjimas(int movefrom, int moveto) {
        int xfrom = movefrom / 10 - 1;
        int yfrom = movefrom % 10 - 1;
        int xto = moveto / 10 - 1;
        int yto = moveto % 10 - 1;

        if (xfrom < 0 || xfrom > 7 || yfrom < 0 || yfrom > 7
                || xto < 0 || xto > 7 || yto < 0 || yto > 7) {
            return false;
        } // Ar vieta neuzimta ?
        else if (lenta.getLenta()[xfrom][yfrom] == lenta.getKienoejimas() && lenta.getLenta()[xto][yto] == '_') {
            // Paprastas ejimas
            if (Math.abs(xfrom - xto) == 1) {
                if ((lenta.getKienoejimas() == 'B') && (yto - yfrom == 1)) //Jei -1 eina atgal
                {
                    return true;
                } else if ((lenta.getKienoejimas() == 'J') && (yto - yfrom == -1)) //Jei 1 eina atgal
                {
                    return true;
                }
            } // kirtimas
            else if (Math.abs(xfrom - xto) == 2) {
                if (lenta.getKienoejimas() == 'B' && (yto - yfrom == 2)
                        && lenta.getLenta()[(xfrom + xto) / 2][(yfrom + yto) / 2] == 'J') {
                    return true;
                } else if (lenta.getKienoejimas() == 'J' && (yto - yfrom == -2)
                        && lenta.getLenta()[(xfrom + xto) / 2][(yfrom + yto) / 2] == 'B') {
                    return true;
                }
            }
        }
        // Jei neatitinka nei vienos taisykles
        return false;
    }

    // Paejimo vykdymas
    public void Vykdymas(int movefrom, int moveto) {
        int xfrom = movefrom / 10 - 1;
        int yfrom = movefrom % 10 - 1;
        int xto = moveto / 10 - 1;
        int yto = moveto % 10 - 1;

        lenta.getLenta()[xfrom][yfrom] = '_';
        lenta.getLenta()[xto][yto] = lenta.getKienoejimas();
        if (Math.abs(xto - xfrom) == 2) {
            lenta.getLenta()[(xfrom + xto) / 2][(yfrom + yto) / 2] = '_';
            //Skaiciuojam nukirstas saskes
            if (lenta.getKienoejimas() == 'B') {
                lenta.setBalta(lenta.getBalta() - 1);
            } else {
                lenta.setJuoda(lenta.getJuoda() - 1);
            }
        }

    }
    public boolean Pabaiga() {
        return (lenta.getBalta() == 0 || lenta.getJuoda() == 0);
    }

    public String Nugaletojas() {
        if (lenta.getJuoda() == 0) {
            return "Balti";
        } else {
            return "Juodi";
        }
    }
}


