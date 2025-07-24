// Sorting Techniques :  Bubble Sort, Selection Sort, Insertion Sort
public class sorting_techniques {
    public static void printArray(int arr[]){
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }  
    }
    public static void main(String[] args) {
        // Bubble Sort
        System.out.print("Bubble Sort:");
        int array1[] = {96,9,84,3,2,1};
        for (int i=0;i<array1.length-1;i++){
            int temp;
            for(int j=0;j<array1.length - i -1;j++){// Removing -1 as we dont want to exceed the array index if length is 5 then for j+1 i.e 5+1 =6 we would be searching for 6th element 
                // if(j+1 == arr.length - i){
                //     break;
                // }// not required if we remove extra 1 incase if we dont put -1 we can use this block
                if(array1[j]>array1[j+1]){
                    temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                }
            }
            System.out.println();//printing array in every iteration to know the values being changed
            System.out.print("Sorted Array " + "in "+(i+1)+" iteration: ");
            printArray(array1);
        }
        System.out.println();//printing the final sorted array
        System.out.print("Final Sorted Array: ");
        printArray(array1);
        System.out.println();
        System.out.println();
        // Selection Sort
        System.out.print("Selection Sort:");
        int array2[] = {96,9,84,3,2,1};
        int smallestIndex=0,smallest=0;
        for(int i=0;i<array2.length;i++){
            smallest = array2[i];
        }
        System.out.println();//printing the final sorted array
        System.out.print("Final Sorted Array: "); 
        printArray(array2);
        // Insertion Sort
    }
}
