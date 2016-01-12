public class Cow extends FarmObject {
	private String name;
	private int hungrinessLevel;
	private int age;
	private int sicknessLevel;
	private int startHour;
	private int endHour;
		
	Cow(int x, int y) {
		super(x, y);
		this.hungrinessLevel = 0;
		this.sicknessLevel = 0;
		this.age = 0;
		this.startHour = 6;
		this.endHour = 18;
	}
	
	public void doStuffForAnHour(int hour) {
		this.hungrinessLevel += 2;
		this.age++;
		
		if (hour >= this.startHour || hour <= this.endHour) {
			this.move();
		}
		
		this.randomDie();
	}
	
	public void move() {
		if (Math.random() > 0.5) {
			if (Math.random() > 0.5) {
				this.x++;
				if (Cow.getX() == this.x && Cow.getY() == this.y) {
					x--;
				} else {
					this.eatGrass();
				}
			} else {
				this.x--;
				if (Cow.getX() == this.x && Cow.getY() == this.y) {
					x++;
				} else {
					this.eatGrass();
				}
			}	
		} else {
			if (Math.random() > 0.5) {
				this.y++;
				if (Cow.getX() == this.x && Cow.getY() == this.y) {
					y--;
				} else {
					this.eatGrass();
				}
			} else {
				this.y--;
				if (Cow.getX() == this.x && Cow.getY() == this.y) {
					y++;
				} else {
					this.eatGrass();
				}
			}
		}
	}
	
	public void eatGrass() {
		if (PoisonedGrass.getX() == this.x && PoisonedGrass.getY() == this.y) {
			this.sicknessLevel += PoisonedGrass.getAmount();
			PoisonedGrass.remove();
		} else if (Grass.getX() == this.x && Grass.getY() == this.y) {
			this.hungrinessLevel -= Grass.getAmount();
			Grass.remove();
		}
	}
	
	public void randomDie() {
		double chance = 0.0001 * this.age * this.sicknessLevel;
		if (Math.random() <= chance || this.hungrinessLevel >= 100 || this.age >= 90001) {
			super.remove();
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
