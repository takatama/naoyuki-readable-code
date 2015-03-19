import java.util.List;

class main1 {
    public static void main(String args[]) {
        String recipeDataFilename = args[0];
        int recipeId = Integer.parseInt(args[1]);
        List<Recipe> recipeList = RecipeReader.load(recipeDataFilename);
        for (Recipe recipe: recipeList) {
            if (recipe.getId() == recipeId) {
                System.out.println(recipe.getId() + ": " + recipe.getTitle());
            }
        }
    }
}

