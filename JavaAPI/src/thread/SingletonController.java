package thread;

public class SingletonController {
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Sample sample = new Sample();
		Sample sample2 = new Sample();
		if (singleton == singleton2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (sample == sample2) {
			System.out.println("샘플 객체가 같다");
		} else {
			System.out.println("샘플 객체가 다르다");
		}
	}
}
