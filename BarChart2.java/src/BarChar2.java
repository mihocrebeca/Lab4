import java.util.Scanner;

public class BarChar2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in)  ;
        int i;
        int punctajArt,punctajBob,punctajCal,punctajDan,punctajEli;
        System.out.println("Introduceti punctajul obtinut de Art: ");
        punctajArt= scanner.nextInt();
        System.out.println("Introduceti punctajul obtinut de Bob: ");
        punctajBob= scanner.nextInt();
        System.out.println("Introduceti punctajul obtinut de Cal: ");
        punctajCal=scanner.nextInt();
        System.out.println("Introduceti punctajul obtinut de Dan: ");
        punctajDan=scanner.nextInt();
        System.out.println("Introduceti punctajul obtinut de Eli: ");
        punctajEli= scanner.nextInt();
        System.out.println("Punctajele pentru joc: ");
        drawChart("Art: ", punctajArt);
        drawChart("Bob: ", punctajBob);
        drawChart("Cal: ", punctajCal);
        drawChart("Dan: ", punctajDan);
        drawChart("Eli: ", punctajEli);

    }

    private static void drawChart(String nume,int punctaj) {
        int a;
        System.out.print(nume+" ");
        for(a=0;a<punctaj/10;++a)
            System.out.print("*");
        System.out.println();
    }
}