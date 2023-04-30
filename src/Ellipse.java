public class Ellipse extends Shape{
    private Point center;
    double r;
    Style styl;

    public Ellipse(Style style) {
        super(style);
    }

    @Override
    public String toSvg() {
        return null;
    }
}
