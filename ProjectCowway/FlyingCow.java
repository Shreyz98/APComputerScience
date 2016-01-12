public class FlyingCow extends Cow{
	FlyingCow(int x, int y) {
		super(x, y);
	}
	
	public void move() {
		do {
			this.x = (int)(Math.random() * farmGrid.length);
			this.y = (int)(Math.random() * farmGrid[this.x].length);
		} while (Cow.x == this.x && Cow.y == this.y);
		super.eatGrass();
	}
}
