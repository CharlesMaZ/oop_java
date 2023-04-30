import java.util.Locale;

public class Segment {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double getLength(){
        double len = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        return len;
    }

    public String toSvg(){
        String str = "";
        str = String.format(Locale.ENGLISH,"<svg>\n" +
                "  <line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />\n" +
                "</svg>", p1.x, p1.y, p2.x, p2.y);
        return str;
    }
    public static Segment[] getNewSegment(Segment segment, Point point){
        Point p1;
        Segment[] segmentTab = new Segment[2];
        double len = segment.getLength();

        double a1 = (segment.getP2().y - segment.getP1().y)/(segment.getP2().x- segment.getP1().x);
        double b = segment.getP1().y - a1 * segment.getP1().x;
        double a2 = a1 * (-1); //wsp prostej prostopadłej
        double b2 = point.y - a2 * point.x;
        double x;
        double y = point.x * a2 + b2;
        double dx = (segment.getP2().x - segment.getP1().x) / len;
        double dy = (segment.getP2().y - segment.getP1().y) / len;

        p1 = new Point(point.x + (len * dy), point.y - len * dx);
        segmentTab[0] = new Segment(point, p1);
        segmentTab[1] = new Segment(point, p1);
        return segmentTab;
    }

}
