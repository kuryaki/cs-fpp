package prob2;


public class Top {
	int t = 1;
	Middle mid = new Middle();
	Middle.Bottom midbot = mid.getBottom();
	
	int readBottom() {
		return midbot.b;
	}
	class Middle {
		int m = 2;
		Bottom bottom = new Bottom();
		
		int addTopAndBottom() {
			return t+m;
		}
		public Bottom getBottom() {
			return bottom;
		}
		class Bottom {
			int b = 3;
			int multiplyAllThree() {
				return t+b+m;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}

}