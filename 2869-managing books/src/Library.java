class Library {
	// write your code here
	public static class Book {
		private String name;
		private String author;
		private int price;
		
		public Book(String name, String author, int price) {
			this.name = name;
			this.author = author;
			this.price = price;
		}
		
		public void show() {
			System.out.printf("The book title is %s \n", name);
			System.out.printf("The author is %s \n", author);
			System.out.printf("Price is $%d.0 \n", price);
		}
	}

	public void management() {
		System.out.println("Managing Books");
	}
}