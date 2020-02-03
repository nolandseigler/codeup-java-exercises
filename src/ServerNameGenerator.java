public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjArr = {
                "capricious",
                "ephemeral",
                "eponymous",
                "impecunious",
                "inchoate",
                "insipid",
                "nefarious",
                "phlegmatic",
                "prodigal",
                "spurious"
        };
        String[] nounArr = {
                "gym",
                "tan",
                "laundry",
                "club",
                "hottub",
                "gelato",
                "steak",
                "pasta",
                "sauce",
                "juice"

        };
        System.out.println(randomElem(adjArr) + "-" + randomElem(nounArr));


    }
    public static String randomElem (String[] inputArr) {
        return inputArr[(int) Math.floor((Math.random() * 10))];
    }
}
