import java.util.Locale;

public class Style {
    final public String fillColor, strokeColor;
    final public Double strokeWidth;

    public Style(String fillColor, String strokeColor, Double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg(){
        String style = String.format(Locale.ENGLISH, "fill:%s;stroke:%s;stroke-width:%f", this.fillColor, this.strokeColor, this.strokeWidth);
        return style;
    }
}
