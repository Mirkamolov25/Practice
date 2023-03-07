package Exersice2;

public class Dimensions {
    private final int width;
    public final int length;
    public final int height;
    public Dimensions(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public Dimensions() {
        width = 0;
        length = 0;
        height = 0;
    }
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(width, length, height);
    }
    public Dimensions setLength(int length) {
        return new Dimensions(width, length, height);
    }
    public Dimensions setHeight(int height) {
        return new Dimensions(width, length, height);
    }
    public int volumeDimensions() {
        return width*length*height;
    }
}
