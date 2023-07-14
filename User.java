public class User {
    private String name;
    private Integer currentCalories;
    private Integer basalMetabolic;

    public User(String name, Integer basalMetabolic) {
        this.name = name;
        this.basalMetabolic = basalMetabolic;
        this.currentCalories = 0;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCurrentCalories() {
        return this.currentCalories;
    }

    public Integer getBasalMetabolic() {
        return this.basalMetabolic;
    }

    public void eat(Food food) {
        this.currentCalories += food.getCalories();
    }

    public String toString() {
        return this.name + " " + this.currentCalories + " " + this.basalMetabolic;
    }
}