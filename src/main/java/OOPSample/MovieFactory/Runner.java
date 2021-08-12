package OOPSample.MovieFactory;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String key=bufferedReader.readLine();
            boolean b=key.equalsIgnoreCase("soapOpera")||key.equalsIgnoreCase("Cartoon")||key.equalsIgnoreCase("Thriller");
            if (!b) break;
            Movie movie=MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
        }
        bufferedReader.close();

    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie=null;
            if ("soapOpera".equalsIgnoreCase(key)) {
                movie=new SoapOpera();
            } else if ("Cartoon".equalsIgnoreCase(key)) {
                movie=new Cartoon();
            } else if ("Thriller".equalsIgnoreCase(key)) {
                movie=new Thriller();
            }
return movie;
        }
    }

    static abstract class Movie {

    }
    static class SoapOpera extends Movie {

    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
