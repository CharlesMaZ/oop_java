import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SvgScene {
    private List<Polygon> polygonList = new ArrayList<>();

    void addPolygonToList(Polygon polygon){
        this.polygonList.add(polygon);
    }

    public void save(String url){
        try {
            FileWriter file = new FileWriter(url);
            file.write("<html><body>\n<svg width=1000 height=1000>\n\t");
            for (Polygon polygon :polygonList) {
                file.write(polygon.toSvg("") + "\n");
            }
            file.write("</svg>\n</body></html>");
            file.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
