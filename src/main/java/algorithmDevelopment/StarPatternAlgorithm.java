package algorithmDevelopment;

public class StarPatternAlgorithm {

    public static void main(String[] args){

        int n = 5; //number of rows

        //Upper half
        for (int i = 1; i <= n; i++) {

            //print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Lower half
        for (int i = n - 1; i >= 1; i--) {

            //print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
