package collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double lenght;
    private boolean isStampled;

    public Stamp(String name, double width, double lenght, boolean isStampled) {
        this.name = name;
        this.width = width;
        this.lenght = lenght;
        this.isStampled = isStampled;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public boolean isStampled() {
        return isStampled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 && Double.compare(stamp.lenght, lenght) == 0 && isStampled == stamp.isStampled && name.equals(stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, lenght, isStampled);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", lenght=" + lenght +
                ", isStampled=" + isStampled +
                '}';
    }
}
