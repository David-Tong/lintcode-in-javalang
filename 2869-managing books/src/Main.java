public class Main {
	public static void main(String[] args) {
		Library l = new Library();
		l.management();
		Library.Book b = new Library.Book("Java Tutorials", "ninechapter", 89);
		b.show();
	}
}
	