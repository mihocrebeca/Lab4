public class IncreaseProduction {
    public static void main(String[] args) {
      int month ;
      int parts=4000;
      double production=0.06;
      int productionRaise=7000;

      for(month=1;month<=24;month++) {
          System.out.println("In luna: " + month + " productia este:" + parts*production*month);
      }
          int c=1;
     System.out.println("Luna in care productia depaseste 7000 este: "+month+"\nAngajatul merita o marire!");
     while(c>=parts){
         System.out.print(c+"");
         c=c+1;
     }
      }

    }
