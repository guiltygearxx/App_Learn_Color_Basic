package androidapp.focus.hoangnam.assignment_learn_color_basic;

/**
 * Created by HoangNam on 12/22/2017.
 */

public class Color {
    private Integer color;
    private String nameOfColor;

    public Color(Integer color, String nameOfColor) {
        this.color = color;
        this.nameOfColor = nameOfColor;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getNameOfColor() {
        return nameOfColor;
    }

    public void setNameOfColor(String nameOfColor) {
        this.nameOfColor = nameOfColor;
    }
}
