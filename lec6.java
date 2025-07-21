// pattern printing advanced - Pending
public class lec6 {
    public static void main(String[] args) {
        int n=4;
        //Q1
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            System.out.println("* * * *");
        }
        // Output
        //         * * * *
        //       * * * *
        //     * * * *
        //   * * * *
        System.out.println();
        System.out.println();
        //Q2
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){   
                System.out.print((i+1)+" ");
            }
        }
        // Output
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4    
        System.out.println();
        System.out.println();
        //Q3
    }
}