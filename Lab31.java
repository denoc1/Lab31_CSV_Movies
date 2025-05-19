import java.io.*;
import java.util.*;

public class Lab31{
    public static void main(String[] args) {
      
        ArrayList<Movie> movies = new ArrayList<>();
        String fileName = "movies.csv";  // Replace with your actual file name

        try {
            Scanner input = new Scanner(new File(fileName));
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split(",", 5); // 5 parts: title, genre, rating, year, duration

                if (parts.length == 5) {
                    String title = parts[0];
                    String genre = parts[1];
                    double rating = Double.parseDouble(parts[2]);
                    int year = Integer.parseInt(parts[3]);
                    int duration = Integer.parseInt(parts[4]);

                    Movie m = new Movie(title, genre, rating, year, duration);
                    movies.add(m);
                }
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (Exception e) {
            System.out.println("Error reading data: " + e.getMessage());
        }

        // Optional: Print movies to confirm it worked
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
