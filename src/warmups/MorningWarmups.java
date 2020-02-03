package warmups;

public class MorningWarmups {

    public static void main(String[] args) {
        System.out.println(binaryMath("10", "11"));
    }
    //03FEB20
    public static String binaryMath (String binary1, String binary2) {
        return Integer.toBinaryString(Integer.parseInt(binary1, 2) + Integer.parseInt(binary2, 2));
    }
}
