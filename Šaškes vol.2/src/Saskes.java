
import java.io.*;
import java.util.*;

public class Saskes  {

    public static void main(String args[]) {
        SaskiuLenta lenta = new SaskiuLenta();
        Spausdintuvas spausdintuvas = new Spausdintuvas(lenta);
        Taisykles taisykles = new Taisykles(lenta, spausdintuvas);
        taisykles.kitasejimas();
    }
}
