package nisan23;

public class ForEach {
    public static void main(String[] args) {
        int[] liste = new int[4];
        liste[0] = 1;
        liste[1] = 2;
        liste[2] = 3;
        liste[3] = 4;
        //Asagidaki iki kod blogu da ayni seyi yapiyor

        for (int i = 0; i < liste.length; i++) {
            int value = liste[i];
            System.out.println(liste[i]);
        }
        //for each
        for (int value : liste) {
            System.out.println(value);

        }

        }

    }


