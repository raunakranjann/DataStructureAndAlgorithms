package patterns;

//Floyd's Triangle Pattern
//
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15



public class pattern4 {

    public static void main(String[] args) {

        int n = 10;
        int count = 1;


for (int c = 1;c<=n; c++ ){

    for (int row= 1; row <= c; row++){
        System.out.print(count + " ");
        count++;
    }
    System.out.println();
}



    }
}
