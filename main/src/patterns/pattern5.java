package patterns;
//To print 0-1 triangle pattern
//
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

public class pattern5 {
    public static void main(String[] args) {

        int n =10 ;

        for (int row =1; row<=n; row++){

            for (int col = 0; col<row;col++){

                int digit = (row+col)%2;

                System.out.print(digit);
            }

            System.out.println();
        }
    }
}
