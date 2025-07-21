// pattern printing basic - Completed
public class lec5 {
    public static void main(String[] args) {        
        int n=4;
        //Q1
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
        }
        // Output
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        System.out.println();
        System.out.println();
        //Q2        
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                if(i==0 || i == 3 || j==0 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
        // Output
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        System.out.println();
        System.out.println();
        //Q3
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
        }
        // Output
        // *
        // * *
        // * * *
        // * * * *   
        System.out.println();
        System.out.println();
        //Qn
        for(int i=n;i>0;i--){
            System.out.println();
            for(int j=0;j<=i-1;j++){
                System.out.print("* ");
            }
        }
        // Output
        // * * * *
        // * * * 
        // * *
        // *  
        System.out.println();
        System.out.println();
        //Q5
        for(int i=n;i>0;i--){
            System.out.println();
            for(int j=1;j<=n;j++){
                if(j>=i){
                    
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
        // Output
        //       *
        //     * *
        //   * * *
        // * * * *
        System.out.println();
        System.out.println();
        //Q6
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
        }
        // Output
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        System.out.println();
        System.out.println();
        //Q7
        for(int i=n;i>=1;i--){
            System.out.println();
            for(int j=0;j<i;j++){
                System.out.print(j+1+" ");
            }
        }
        // Output
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        System.out.println();
        System.out.println();
        //Q8
        int temp1=1;
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print(temp1 + " ");
                temp1++;
            }
        }
        // Output
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        System.out.println();
        System.out.println();
        //Q9
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<i+1;j++){
                if((i+j)%2==0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
        }
        // Output
        // 0
        // 1 0
        // 0 1 0
        // 1 0 1 0
        System.out.println();
        System.out.println();       
    }
}
