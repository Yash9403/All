import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();

        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));

        System.out.println("Sorting by Rating: ");
        RatingCompare r = new RatingCompare();
        Collections.sort(list, r);
        for(Movie movie : list)
        {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " "
                    + movie.getYear());
        }

        System.out.println("\nSorted by name");
        NameCompare n = new NameCompare();
        Collections.sort(list, n);
        for(Movie movie : list)
        {
            System.out.println(movie.getYear() + " "
                    + movie.getRating() + " "
                    + movie.getName() + " ");
        }

        System.out.println("\nSorted by year");
        Collections.sort(list);
        for(Movie movie : list)
        {
            System.out.println(movie.getYear() + " "
                    + movie.getRating() + " "
                    + movie.getName() + " ");
        }
    }
}
