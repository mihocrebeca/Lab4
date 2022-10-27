import java.util.Scanner;
import java.util.*;

public class RaspunsuriTest {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int punctaj, pctj = 0;
        int punctajMare = 0, punctajMic = 0, medieAritmetica = 0;
        while (true) {
            System.out.println("Introduceti un punctaj de la 0 la 10 : ");
            punctaj = in.nextInt();
            if (punctaj == 99)
                break;
            if (pctj >= 0 && punctaj <= 10) {
                if (pctj == 0 || punctaj > punctajMare)
                    punctajMare = punctaj;
                if (pctj == 0 || punctaj < punctajMic)
                    punctajMic = punctaj;
                medieAritmetica += punctaj;
                pctj++;
            } else {
                System.out.println("Punctajul trebuie sa fie intre 0 si 10!");
            }

        }
        System.out.println("Numarul punctajelor valabile: ");
        System.out.println(pctj);
        System.out.println("Punctajul cel mai mare este:  ");
        System.out.println(punctajMare);
        System.out.println("Punctajul cel mai mic este:  ");
        System.out.println(punctajMic);
        System.out.println("Media aritmetica a punctajelor este: " +(medieAritmetica/(double)pctj));


    }
}

