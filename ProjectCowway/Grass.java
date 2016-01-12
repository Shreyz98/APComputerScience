public class Grass extends FarmObject {
	private int amount;
	
	Grass(int x, int y) {
		super(x, y);
		this.amount = 1;
	}
	
	public void increaseAmount() {
		this.amount++;
	}
	
	public void createRandom() {
		int newX = this.x++;
		int newY = this.y++;
		double chance = 0.1 * this.amount;
		
		if (Math.random() <= chance) {
			Grass grass = new Grass(newX, newY);
		}
	}
	
	public int getAmount() {
		return this.amount;
	}
}
