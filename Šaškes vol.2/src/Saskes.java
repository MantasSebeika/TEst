
import java.io.*;
import java.util.*;

public class Saskes {
    
   
    public static void main(String args[])
    {
        Lenta lenta = new Lenta();
        Spausdintuvas spausdintuvas = new Spausdintuvas(lenta);
        Taisykles taisykles = new Taisykles(lenta, spausdintuvas);      
        taisykles.kitasejimas();
    }
}