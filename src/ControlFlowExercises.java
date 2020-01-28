public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf(" %d ", i);
//            i++;
//        }
//        int j = 100;
//        do {
//            System.out.printf("%d \n", j);
//            j -= 5;
//        } while(j >= -10);
//        long k = 2;
//        do {
//            System.out.printf("%d \n", k);
//            k *= k;
//        } while (k < 1000000);
//        double k = 2;
//        do {
//            System.out.printf("%.0f \n", k);
//            k = Math.pow(k, 2);
//        } while (k < 1000000);
        for (int i = 5; i <= 15; i++) {
            System.out.printf(" %d ", i);
        };
        System.out.println('\n');
        for (int j = 100; j >= -10; j -= 5) {
            System.out.printf("%d \n", j);
        };
        System.out.print('\n');
        for (long k = 2; k < 1000000; k *= k) {
            System.out.printf("%d \n", k);
        }

    }
}
