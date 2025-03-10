package leveltwo.taskone;

import java.util.Objects;

public class Restaurant {
    private final String name;
    private final int rating;


    public Restaurant(String name, int score) {
        this.name = name;
        this.rating = score;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return getRating() == that.getRating() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRating());
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
