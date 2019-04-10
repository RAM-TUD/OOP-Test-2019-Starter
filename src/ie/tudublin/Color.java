package ie.tudublin;

import processing.data.TableRow;

public class Color
{
    private String color;
    public int r;
    public int g;
    public int b;
    public float value;

    public Color(String color,int r,int g,int b,float value)
    {
        this.color = color;
        this.r = r;
        this.b = b;
        this.g = g;
        this.value = value;
    }
    public Color(TableRow row)
    {
        this(row.getString("colour"),row.getInt("r"),row.getInt("g"),row.getInt("b"),row.getInt("value"));
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