class Recipe {
    private final int id;
    private final String title;

    public Recipe(final int id, final String title) {
        this.id = id;
        this.title = title;
    }

    int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }
}