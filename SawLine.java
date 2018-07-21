
public class SawLine implements Line
{
private double modValue;

public SawLine()
{
	this.modValue = 0.0;
}
public SawLine(double amodValue)
{
	setmodValue(amodValue);
}
public double getmodValue()
{
	return this.modValue;
}
public void setmodValue(double amodValue)
{
	if(amodValue > 0)
	{
		this.modValue = amodValue;
	}
}
public double getYPoint(double x)
{
	return (x%modValue);
}
}
