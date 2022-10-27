public class NrPerfect {
    public static void main(String[] args) {
        System.out.println("Numerele perfecte (de la 1 la 1000) sunt: ");
        for(int x=1; x<=1000; x++){
            int p=0;
            for(int i=1; i<=x/2; i++){
                if(x%i==0){
                    p+=i;
                }
            }
            if(p==x){
                System.out.println(x);
            }
        }

    }
}