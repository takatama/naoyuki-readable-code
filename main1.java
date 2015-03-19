import java.util.List;

class main1 {
    public static void main(String args[]) {
        String recipeDataFilename = "recipe-data.txt";
        List<Recipe> recipeList = RecipeReader.load(recipeDataFilename);
        for (Recipe recipe: recipeList) {
            System.out.println(recipe.getId() + ": " + recipe.getTitle());
        }
    }
}

