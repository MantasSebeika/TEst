public class Spausdintuvas {
    
    Lenta lenta;
    
    public Spausdintuvas(Lenta lenta){
        this.lenta = lenta;
    }
        
     public void printLenta()
    {
	int i,j;
        char[][] board = lenta.getLenta();
	System.out.println("  1 2 3 4 5 6 7 8 x");
	for (i=0;i<lenta.getDydis();i++) 
        {
	    System.out.print((i+1) + " ");
	    for (j=0;j<lenta.getDydis();j++) 
            {
                
		System.out.print(board[j][i] + " ");
	    }
	    System.out.println();
	}
	System.out.println("y");
    }

    void printPabaiga(String Nugaletojas) {
        System.out.println("Nugalėtojas yra: " + Nugaletojas);
            }

    void printString(String s) {
        System.out.println(s);
    }
}

