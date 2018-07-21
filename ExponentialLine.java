public class ExponentialLine implements Line
{
private double exponent;

public ExponentialLine()
{
	this.exponent = 0.0;
}
public ExponentialLine(double anexponent)
{
	setexponent(anexponent);
}

public double getexponent()
{
	return this.exponent;
}
public void setexponent(double anexponent)
{
	this.exponent = anexponent;
}
public double getYPoint(double x)
{
	return (Math.pow(x, exponent));
}
}
