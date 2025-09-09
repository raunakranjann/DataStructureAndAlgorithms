package patterns;

//inverted half pyramid with numbers pattern
//
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

public class pattern3 {
    public static void main(String[] args) {

        int n = 5 ;

        //column
        for(int c=n; c>=1;c--){


//            row
            for(int r=1; r<=c;r++){

                System.out.print(r);

            }

            System.out.println();
        }
    }
}
