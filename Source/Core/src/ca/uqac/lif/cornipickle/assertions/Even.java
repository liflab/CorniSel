package ca.uqac.lif.cornipickle.assertions;

public class Even extends AtomicFunction
{
	public Even()
	{
		super(1);
	}
	
	@Override
	protected Object get(Object ... arguments) 
	{
		Object o = arguments[0];
		if (!(o instanceof Number))
		{
			throw new InvalidArgumentTypeException(this);
		}
		Number n = (Number) o;
		if (n.intValue() != n.floatValue() || n.intValue() % 2 != 0)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public String toString()
	{
		return "IsEven";
	}
}