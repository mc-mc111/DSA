import java.util.Scanner;

public class lec12 {
    public static void main(String[] args) {
        //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        int n = 0;
        String arr[] = new String[n];
        int length =0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            arr[i] = sc.nextLine();
            length += arr[i].length();
        }
        System.out.println(length);
        // Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        // Example : 
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”
        String one = sc.nextLine();
        one = one.replace('e','i');
        System.out.println(one);
        // Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        // Example : 
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”
        String email = sc.nextLine();
        String username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)!='@'){
                username += email.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println("username: "+ username);
        // Converting for int to to string using parse int and integer class
        String number = "111";
        int num = Integer.parseInt(number);
        System.out.println(num+" "+ (num+1)); 
        sc.close();
    }
}
