package javaDy3;

public class Ball implements Bouncable,Rollable{
	
	private int bf;
	private int rf;
	
	private String color;
	
	public Ball(String ballcolor) {
		super();
		this.color = ballcolor;
	}

	

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void bounce() {
		System.out.println("It is a " + this.color+" color ball bouncing ball with bounce factor: "+this.bf);
	}
	@Override
	public void setBounceMutltiple(int multiple) {
		
		this.bf = BOUNCE_FACTOR*multiple;
	}
	
	@Override
	public void roll() {
		System.out.println("It is a " + this.color+" color ball rolling ball with roll factor: "+this.bf);
	}
	@Override
	public void setRollMultiple(int multiple) {
		
		this.rf = ROLL_FACTOR*multiple;
	}
}
