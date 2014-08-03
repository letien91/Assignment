
public class Square implements Expression{
	private Expression expression;
	
	public Square(Expression ex){
		expression = ex;
	}
	
	@Override
	public int evaluate(){
		return expression.evaluate() * expression.evaluate();
	}
	
	@Override
	public String toString(){
		return String.format("%s %s", expression.toString(),"^2");
	}
}
