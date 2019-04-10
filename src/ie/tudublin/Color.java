package ie.tudublin;

import processing.data.TableRow;

public class Color
{
    private String color;
    public int r;
    public int g;
    public int b;
    public float value;

    public Color(TableRow row)
    {
        this.color = row.getString("colour");
        this.r = row.getInt("r");
        this.b = row.getInt("b");
        this.g = row.getInt("g");
        this.value = row.getInt("value");
    }

    public String toString()
    {
        return color + "\t" + r + "\t" + g+ "\t" + b+ "\t" + value;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }


}