package warmups;

import java.util.ArrayList;
import java.util.Arrays;

public class MorningWarmups {

    public static void main(String[] args) {
//        System.out.println(binaryMath("10", "11"));
        String[] jerseyShore = {"Mike", "Vinny", "Pauly", "Ronnie", "Snooki", "Sammi", "JWoww"};
        ArrayList<String> jerseyShoreHouse = new ArrayList<>();
        ArrayList<String> miamiHouse = new ArrayList<>(Arrays.asList(jerseyShore));
        for (String italian : jerseyShore) {
            jerseyShoreHouse.add(italian);
        }
        System.out.println(jerseyShoreHouse);
        miamiHouse.add("null");
        System.out.println(miamiHouse);
        System.out.println(miamiHouse.get(miamiHouse.size() - 1));
        int counter = 0;
        try {
            int num = 5 / 0;
            int num2 = 5 / 0;
        } catch (Exception ex) {
            counter++;
        }
        System.out.println(counter);
    }
    //03FEB20
    public static String binaryMath (String binary1, String binary2) {
        return Integer.toBinaryString(Integer.parseInt(binary1, 2) + Integer.parseInt(binary2, 2));
    }
    //
}
