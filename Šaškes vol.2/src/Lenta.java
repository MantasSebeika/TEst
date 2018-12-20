
public abstract class Lenta {

    protected int Dydis = 8;
    protected char[][] lenta;
    protected int balta;
    protected int juoda;
    protected char kienoejimas;

    public String Informacija(){
        return "As esu Paprasta Lenta";
    }
    public int getDydis() {
        return Dydis;
    }

    public char[][] getLenta() {
        return lenta;
    }

    public int getBalta() {
        return balta;
    }

    public void setDydis(int Dydis) {
        this.Dydis = Dydis;
    }

    public void setLenta(char[][] lenta) {
        this.lenta = lenta;
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
    
}
