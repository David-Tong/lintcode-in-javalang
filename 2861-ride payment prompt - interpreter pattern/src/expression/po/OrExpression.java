package expression.po;

import java.util.*;

import expression.Expression;

public class OrExpression implements Expression {
	// write your code here
	private Expression e1;
	private Expression e2;
	
	public OrExpression(Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return e1.interpret(context) || e2.interpret(context);
	}    
}