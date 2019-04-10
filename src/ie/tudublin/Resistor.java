package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class Resistor
{
    ArrayList<Color>colors = new ArrayList<Color>();
    public int value;
    public int ones;
    public int tens;
    public int hundreds;
    PApplet ui;

    public Resistor(int value,PApplet ui)
    {
        this.value = value;
        this.hundreds = (value / 100);
		this.tens = (value - (hundreds * 100)) / 10;
        this.ones = value - ((hundreds * 100)  + (tens * 10));
        this.ui = ui;
    }
    public void render(int i,Color c1, Color c2, Color c3)
    {
        int border = 50;
        int gap = 50;
        int size = 100;
        float x =ui.width/2 - border;
        float y = border + (i*(size+gap));         
        ui.rect(x,y,size,size );
        ui.line(x-50,y + size/2,x,y+size/2);
        ui.line(x+size,y + size/2,x+size+50,y+size/2);
        
        for(int j = 0; j <3; j++)
        {
            if(j==0)
            {
                ui.fill(c1.r,c1.g,c1.b);
            }
            if(j==1)
            {
                ui.fill(c2.r,c2.g,c2.b);
            }
            if(j==2)
            {
                ui.fill(c3.r,c3.g,c3.b);
            }
            int gap2 = 20;
            ui.rect(x+10+(j*gap2),border,15,size);
        }
        ui.fill(0);
        ui.textSize(20);
        ui.text(value,ui.width-50,y+size/2);
        ui.fill(255);
        
        
    }
}