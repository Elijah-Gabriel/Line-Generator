
public class StaircaseLine implements Line
{
private double width;
private double height;

public StaircaseLine()
{
	this.width = 0.0;
	this.height = 0.0;
}
public StaircaseLine(double awidth, double aheight)
{
	this.width(awidth);
	this.height(aheight);
}
public double width()
{
	return this.width;
}
public double height()
{
	return this.height;
}
public void width(double awidth)
{
	if(awidth > 0)
	{
		this.width = awidth;
	}
}
public void height(double aheight)
{
	if(aheight > 0)
	{
		this.height = aheight;
	}
}
public double getYPoint(double x)
{
	return ((int)x/(int)width)* height;
}
}
