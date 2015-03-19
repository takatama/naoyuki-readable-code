import java.io.*;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class RecipeReader {
    public static List<Recipe> load(final String filename) {
        List<Recipe> recipeList = new ArrayList<>();
        int id = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();

            while(line != null) {
                recipeList.add(new Recipe(id, line));
                id += 1;
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recipeList;
    }
}