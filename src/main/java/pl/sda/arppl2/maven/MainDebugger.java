package pl.sda.arppl2.maven;

public class MainDebugger {
    public static void main(String[] args) {

        // ###################################################################
        //int, double, float, byte, char, short, long
        // Integer, Double, Float, Byte, Character, Short, Long

        // Zmienna z wartością, która jest liczbą całkowitą
        int a;

        // Zmienna z wartością, która jest liczbą zmiennoprzecinkową
        // dużej precyzji (zajmuje 64 bity = 8 bajtów)
        double b;

        // małej precyzji (zajmuje 32 = 4 bajty)
        float c;

        //Tekst -  ciąg liter
        String zmiennaZTekstem;


      // ####################################################################

        int zmiennaZWartosciaCalkowita = 5;

        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita +10;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita *23;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita /7;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita +10;


        System.out.println(zmiennaZWartosciaCalkowita
        );


    }
}

