// Bitwise operators and bit manipulations - Completed
public class lec15 {
    public static void main(String[] args) {
        // Get Bit (know what is the bit at specific index)  num & bitmask
        int n1 = 5;//0101
        int pos1 = 2;//indexing starts from zero(0) //0 --1-- 01
        int bitmask =  1 << pos1; // 0001 to 0100
        if((n1 & bitmask )== 0){// 0101 & 0100 == 0  --1-- 00
            System.out.println("Get Bit: "+"bit at the position = "+"0");
        }
        else{
            System.out.println("Get Bit: "+"bit at the position = "+"1");        
        }
        // Set Bit (change bit to opposite state at specific index)  num | bitmask
        int n2 = 5;//0101
        int pos2 = 1;//01 --0-- 1
        bitmask =  1 << pos2; // 0001 to 0010
        int newNum = n2 | bitmask;// 0101 | 0010 == 01 --1-- 1
        System.out.println("Set Bit: number after changing bit "+newNum);
        // Clear Bit (change bit at specific index)  num & ~(bitmask)
        int n3 = 5;//0101
        int pos3 = 2;//0 --1-- 01
        bitmask =  ~(1 << pos3); // 0001 to 0100 => 1011
        int neww = n3 & bitmask;// 0101 & 1011 == 0  --0-- 01
        System.out.println("Clear Bit: "+"number before clearing bit is: "+n3+" number after clearing bit is: "+neww);     
        // Update Bit
        // If you want to update existing bit from 0 to 1 use Set Bit  num | bitmask
        // If you want to update existing bit from 1 to 0 use Clear Bit  num & ~(bitmask)
    }
}
