package movies;

import util.Input;
import java.util.Arrays;
public class MoviesApplication {
    private static Input myScanner = new Input();
    public static void main(String[] args) {
        Movie[] moviesArr = MoviesArray.findAll();
        Movie[] middlingArr = new Movie[moviesArr.length];
        Movie[] outputArr = new Movie[moviesArr.length];
        while (true) {
            boolean stop = false;
            int userChoice = myScanner.getInt("\nWhat would you like to do?\n\n0 - Exit\n1 - View All Movies\n2 - View Movies In The Animated Category\n3 - View Movies In The Drama Category\n4 - View Movies In The Horror Category\n5 - View Movies In The SciFi Category\n\nEnter your choice\t");
            switch(userChoice) {
                case 0:
                    stop = true;
                    break;
                case 1:
                    outputArr = moviesArr;
                    break;
                case 2:
                    int j = 0;
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("animated")) {
                            middlingArr[j] = movie;
                            j++;
                        }

                    }
                    outputArr = Arrays.copyOf(middlingArr, j);
                    break;
                case 3:
                    int k = 0;
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("drama")) {
                            middlingArr[k] = movie;
                            k++;
                        }

                    }
                    outputArr = Arrays.copyOf(middlingArr, k);
                    break;
                case 4:
                    int l = 0;
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("horror")) {
                            middlingArr[l] = movie;
                            l++;
                        }

                    }
                    outputArr = Arrays.copyOf(middlingArr, l);
                    break;
                case 5:
                    int m = 0;
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("scifi")) {
                            middlingArr[m] = movie;
                            m++;
                        }

                    }
                    outputArr = Arrays.copyOf(middlingArr, m);
                    break;
                case 6:
                    outputArr = Arrays.copyOf(moviesArr, moviesArr.length + 1);
                    outputArr[outputArr.length - 1] = new Movie((myScanner.getString("\nInput a movie title: \t")), (myScanner.getString("\nInput a movie category: \t")));
                    moviesArr = outputArr;
                    break;
                default:
                    break;

            }
            if (stop) {
                break;
            }
            int i = 1;
            for (Movie movie : outputArr) {
                System.out.printf("%d. Title: %s  :  Category: %s\n", i, movie.getName(), movie.getCategory());
                i++;
            }
        }

    }
}
