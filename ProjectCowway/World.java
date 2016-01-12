public class World {
	private int time;
	private int numFarms;
	private Farm[] allFarms;
	
	World(int t, int num) {
		this.time = t;
		this.numFarms = num;
		this.allFarms = new Farm[this.numFarms];
	}
	
	public void incrementTime() {
		if (this.time > 23) {
			this.time++;
		} else {
			this.time = 0;
		}
	}
	
	public int getTime() {
		return this.time;
	}
	
	public void addFarm(int num, Farm farm) {
		this.allFarms[num] = farm;
	}
}
