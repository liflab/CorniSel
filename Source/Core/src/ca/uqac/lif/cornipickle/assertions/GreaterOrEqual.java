/*
    Cornipickle, validation of layout bugs in web applications
    Copyright (C) 2015-2020 Laboratoire d'informatique formelle
    Université du Québec à Chicoutimi, Canada
    
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    
    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ca.uqac.lif.cornipickle.assertions;

public class GreaterOrEqual extends AtomicFunction
{
	public GreaterOrEqual()
	{
		super(2);
	}

	@Override
	protected Object get(Object... arguments)
	{
		Object o1 = arguments[0];
		Object o2 = arguments[1];
		if (!(o1 instanceof Number) || !(o2 instanceof Number))
		{
			throw new InvalidArgumentTypeException(this);
		}
		Number n1 = (Number) o1;
		Number n2 = (Number) o2;
		return n1.floatValue() >= n2.floatValue();
	}

	@Override
	public String toString()
	{
		return "&ge;";
	}
}
