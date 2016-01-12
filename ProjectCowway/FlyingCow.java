public class FlyingCow extends Cow{
	FlyingCow(int x, int y) {
		super(x, y);
	}
	
	public void move() {
		do {
			super.x = (int)(Math.random() * farmGrid.length);
			super.y = (int)(Math.random() * farmGrid[super.x].length);
		} while (Cow.x == super.x && Cow.y == super.y);
		super.eatGrass();
	}
}
