
public class Subtraction implements BinaryExpression{
	private Expression left;
	private Expression right;

	public Subtraction(Expression l, Expression r) {
		left = l;
		right = r;
	}

	@Override
	public Expression left() {
		return left;
	}

	@Override
	public Expression right() {
		return right;
	}

	@Override
	public int evaluate() {
		return (left.evaluate() - right.evaluate());
	}

	@Override
	public String toString() {
		return String.format("%d %s %d", left.evaluate(), " - ", right.evaluate());
	}
}
