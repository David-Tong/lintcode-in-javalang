package expression.po;

import java.util.*;

import expression.Expression;

public class TerminalExpression implements Expression {
	// write your code here
	private String[] data;
	
	public TerminalExpression(String[] data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		for (String datum : data) {
			if (context.contains(datum)) {
				return true;
			}
		}
		return false;
	}
}