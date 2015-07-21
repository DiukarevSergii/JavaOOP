package lesson05.monitorlist;

public class Main {
	public static void main(String[] args) {
		String [] list = {"c:\\1.txt", "c:\\2.txt", "c:\\3.txt"};
		Monitor m = new Monitor(list, new FileEvent());
		m.start();
	}
}