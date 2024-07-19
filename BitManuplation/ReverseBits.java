package BitManuplation;

public class ReverseBits {
    public static void main(String[] args) {
        // Corrected binary literal
        int n = 0b00000010100101000001111010011100;
        int ans = reverseBits(n);
        System.out.println(ans);
    }

    public static int reverseBits(int n) {
        int ans = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((mask & n) != 0) {
                ans |= 1 << (31 - i);
            }
            mask <<= 1; // Correctly update mask
        }
        return ans;
    }
}

//left shift operator is used to shift the bits towards the left side of the expression.
//example 1 << 2 = 4 how? 1 = 0001 in binary, 1 << 2 = 0100 = 4

//right shift operator is used to shift the bits towards the right side of the expression.
//example 4 >> 2 = 1 how? 4 = 0100 in binary, 4 >> 2 = 0001 = 1
//0011001 >> 1 => 0001100
//0011001 << 1 => 0110010