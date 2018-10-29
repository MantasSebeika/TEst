public class Lenta {
    
    private int Dydis = 8;
    private char[][] lenta;
    private int balta;     
    private int juoda;
    private char kienoejimas; 

    public int getDydis() {
        return Dydis;
    }

    public char[][] getLenta() {
        return lenta;
    }

    public int getBalta() {
        return balta;
    }

    public void setBalta(int balta) {
        this.balta = balta;
    }

    public int getJuoda() {
        return juoda;
    }

    public void setJuoda(int juoda) {
        this.juoda = juoda;
    }

    public char getKienoejimas() {
        return kienoejimas;
    }

    public void setKienoejimas(char kienoejimas) {
        this.kienoejimas = kienoejimas;
    }
    /**
     *
     */
    public Lenta() 
    {
	lenta = new char[Dydis][Dydis];
        balta = 12;
        juoda = 12;
        kienoejimas = 'B';
	// Isdeliojame saskes
	for (int i=0;i<Dydis;i++)
	    for (int j=0;j<Dydis;j++)
		lenta[i][j] = '_';

	for (int i=1;i<Dydis;i+=2) 
        {
	    lenta[i][1] = 'B';
	    lenta[i][5] = 'J';
	    lenta[i][7] = 'J';
	}
	for (int i=0;i<Dydis;i+=2)
        {
	    lenta[i][0] = 'B';
	    lenta[i][2] = 'B';
	    lenta[i][6] = 'J';
	}
    }
}
