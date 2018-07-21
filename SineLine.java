
public class SineLine implements Line
{
private double amplitude;
private double frequency;

public SineLine()
{
	this.amplitude = 0.0;
	this.frequency = 0.0;
}
public SineLine(double anamplitude, double afrequency)
{
	setamplitude(anamplitude);
	setfrequency(afrequency);
}
public double getamplitude()
{
	return this.amplitude;
}
public double getfrequency()
{
	return this.frequency;
}
public void setamplitude(double anamplitude)
{
	this.amplitude = anamplitude;
}
public void setfrequency(double afrequency)
{
	this.frequency = afrequency;
}
public double getYPoint(double x)
{
	return (amplitude*Math.sin(x*frequency));
}
}
