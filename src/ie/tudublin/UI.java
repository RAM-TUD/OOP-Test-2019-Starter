package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{
	ArrayList<Color>colors = new ArrayList<Color>();
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColor();
		printcolor();
		Color c = findcolor(5);
		System.out.println("the color is " + c.getColor());
	}
	
	public void draw()
	{			
	}
	public void loadColor()
	{
		Table table = loadTable("colours.csv","header");
		for(TableRow row:table.rows())
		{
			Color c = new Color(row);
			colors.add(c);
		}
	}
	public void printcolor()
	{
		for(Color c:colors)
		{
			System.out.println(c);
		}
	}
	public Color findcolor(int value)
	{
		for(Color c:colors)
		{
			if(value == c.value)
			{
				return c;
			}
		}
		return null;
	}
}
