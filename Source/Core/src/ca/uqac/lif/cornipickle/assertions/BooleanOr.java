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

import java.util.List;

public class BooleanOr extends BooleanConnective
{	
	public BooleanOr(int arity)
	{
		super(arity);
	}
	
	public BooleanOr()
	{
		super(2);
	}
	
	@Override
	protected Value getBooleanValue(List<Value> false_values, List<Value> true_values) 
	{
		if (true_values.isEmpty())
		{
			return new NaryConjunctiveVerdict(false, false_values);
		}
		return new NaryDisjunctiveVerdict(true, true_values);
	}

	@Override
	protected Object get(Object... arguments) 
	{
		return null;
	}
	
	@Override
	public String toString()
	{
		return "Or";
	}

}
