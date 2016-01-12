public class NocturnalCow extends Cow {	
	NocturnalCow(int x, int y) {
		super(x, y);
		super.startHour = 18;
		super.endHour = 6;
	}
}
