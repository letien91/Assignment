
public class Numeral implements Expression{
	private int value;
	
	public Numeral(int val){
		value = val;
	}
	
	@Override
	public int evaluate(){
		return value;
	}
	
	@Override
	public String toString(){
		return String.format("%d", value);
	}
}
