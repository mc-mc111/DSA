// String Builder Class - completed
public class lec13 {
    public static void main(String[] args) {
        // Reversing a string
        StringBuilder sb = new StringBuilder("ih");
        for(int i=0;i<sb.length()/2;i++){
            int frontCharIndex = i;
            int backCharIndex  = sb.length() - 1 -i;
            char front = sb.charAt(frontCharIndex);
            char back = sb.charAt(backCharIndex);
            sb.setCharAt(frontCharIndex, back);
            sb.setCharAt(backCharIndex, front);
        }
        System.out.println(sb);
    }
}
