public class SlopedLine implements Line
{
private double slope;

public SlopedLine()
{
	this.slope = 0.0;
}
public SlopedLine(double aslope)
{
	setslope(aslope);
}
public double getslope()
{
	return this.slope;
}
public void setslope(double aslope)
{
	if(aslope>0)
	{
	this.slope=aslope;
	}
}
public double getYPoint(double x)
{
	return (slope*x);
}
}
