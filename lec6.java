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
        for(int i=0;i<=n;i++){
            System.out.println();
            for(int k=0;k<n-i;k++){//Spaces
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){//Left Half
                System.out.print(j+" ");
            }
            for(int l=1;l<i;l++){//Right Half
                System.out.print((l+1)+" ");
            }
        }
        // Output
        //       1 
        //     2 1 2 
        //   3 2 1 2 3 
        // 4 3 2 1 2 3 4 
        System.out.println();
        System.out.println();
        //Q4
        int temp1 = (n*2)-1;//Initial number of spaces required
        for(int i=0;i<=n;i++){// Upper Part
            System.out.println();
            for(int j=0;j<i;j++){//Upper Left
                System.out.print("* ");
                if(j == i-1){ //Position when j is at last position
                    for(int k=0;k<=temp1;k++){//Spaces
                        System.out.print("  ");
                    }
                    for(int l=0;l<i;l++){//Upper Right
                        System.out.print("* ");
                    }
                }
            } 
            temp1 -= 2;        
        }
        for(int i=0;i<=n;i++){ //Lower Part
            System.out.println();
            for(int j=n;j>i;j--){ //Lower Left
                System.out.print("* "); 
                if(j == i+1){ //Position when j is at last position
                    for(int k=0;k<i*2;k++){//Spaces
                        System.out.print("  ");
                    }
                    for(int l=n;l>=j;l--){//Lower Right
                        System.out.print("* ");
                    }
                }
            }         
        }
        // Output
        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *
        System.out.println();
        System.out.println();
        //Q5
        for(int i=0;i<n;i++){//Upper Part
            System.out.println();
            for(int j=0;j<n-1-i;j++){//Spaces
                System.out.print("  ");
            }
            for(int l=0;l<i;l++){//Upper Right
                System.out.print("* ");
            }
            for(int k=i;k>=0;k--){//Upper Left
                System.out.print("* ");
            }
        }
        for(int i=0;i<n;i++){//Lower Part
            System.out.println();
            for(int j=0;j<i;j++){//Spaces
                System.out.print("  ");
            }
            for(int k=0;k<=n-1-i;k++){//Lower Right
                System.out.print("* ");
            }
           for(int l=0;l<n-1-i;l++){//Lower Left
                System.out.print("* ");
            }
        }
        // Output    
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        // * * * * * * *
        //   * * * * *
        //     * * *
        //       *      
        System.out.println();
        System.out.println();
        //Q6
        int temp2 = (n*2)-1;//Initial number of spaces required
        for(int i=0;i<=n;i++){// Upper Part
            System.out.println();
            for(int j=0;j<i;j++){//Upper Left
                if(j==0 || j==i-1){//Printing stars only in the begining and at the end
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                if(j == i-1){ //Position when j is at last position
                    for(int k=0;k<=temp2;k++){//Spaces
                        System.out.print("  ");
                    }
                    for(int l=0;l<i;l++){//Upper Right
                        if(l==0||l==i-1){//Printing stars only in the begining and at the end
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
            } 
            temp2 -= 2;        
        }
        for(int i=0;i<=n;i++){ //Lower Part
            System.out.println();
            for(int j=n;j>i;j--){ //Lower Left
                if(j==n || j==i+1){//Checking for condition to print *
                    System.out.print("* ");
                }
                else{//Spaces in between
                    System.out.print("  ");
                } 
                if(j == i+1){ //Position when j is at last position
                    for(int k=0;k<i*2;k++){//Spaces in lines
                        System.out.print("  ");
                    }
                    for(int l=n;l>=j;l--){//Lower Right
                        if(l==n||l==i+1){//Checking for condition to print *
                            System.out.print("* ");
                        }
                        else{//Spaces in between
                            System.out.print("  ");
                        }
                    }
                }
            }         
        }
        // Output
        // *             *
        // * *         * *
        // *   *     *   *
        // *     * *     *
        // *     * *     *
        // *   *     *   *
        // * *         * *
        // *             *    
        System.out.println();
        System.out.println();
        //Q7
        for(int i=n;i>0;i--){
            System.out.println();
            for(int j=0;j<i;j++){//Spaces in lines
                System.out.print("  ");
            }
            for(int k=0;k<n;k++){
                if(i==n||i==1||k==0||k==n-1){//Checking for conditions to print *
                    System.out.print("* ");
                }
                else{//Spaces in between
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
        System.out.println();
        //Q8              
    }
}