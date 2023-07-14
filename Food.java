public class Food {
    private String name;
    private Integer calories;

    public Food(String name, Integer calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCalories() {
        return this.calories;
    }

    public String toString() {
        return this.name + " " + this.calories;
    }
}