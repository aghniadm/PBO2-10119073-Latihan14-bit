package pbo2.pkg10119073.latihan14.bit;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk mengimplementasikan bit
 *
 */
public class PBO210119073Latihan14Bit {

    public static void main(String[] args) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        
        c = a & b;
        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);
        
        c = a | b;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);
        
        c = a ^ b;
        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);
        
        c = ~a;
        /* -61 = 1100 0011 */
        System.out.println("~a = " + c);
        
        c = a << 2;
        /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);
        
        c = a >> 2;
        /* 15 = 0000 1111 */
        System.out.println("a >> 2 = " + c);
    }
    
}
