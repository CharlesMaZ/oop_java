import java.util.Locale;

public class Polygon extends Shape {
    private Point points[];
    Style style = new Style("none", "black", 1.0);

    public Polygon(Style style) {
        super(style);
    }

    //    public Polygon(Point[] p, int vertex) {
//        this.points = new Point[vertex];
//    }
//    public Polygon(Point[] p, int vertex, Style styl) {
//        this.points = new Point[vertex];
//        this.style = styl;
//    }
    public void setP(int pointIndex, Point p) {
        this.points[pointIndex] = p;
    }

    public void setP(Point[] p) {
        this.points = p;
    }

    public String toSvg(String parametres){
        String pointsString = "";
        for (Point point: points) {
            pointsString += point.x + "," + point.y + " ";
        }
        System.out.println("toSvg Polygon " + String.format(Locale.ENGLISH,"<polygon points=\"%s\" %s />", pointsString,parametres));

        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style=\"%s\" />", pointsString, style.toSvg());
    }

    @Override //nnie wiem co ta metoda ma robić
    public String toSvg() {
        return null;
    }

//    public static Polygon square(){
//        return Polyg
//    }
}
