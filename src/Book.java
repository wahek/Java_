public class Book {
    private String name;
    private String author;
    private String genre;
    private int countPage;

    public Book(String name, String author, String genre, int countPage) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.countPage = countPage;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getCountPage() {
        return countPage;
    }

    @Override
    public String toString() {
        return (String.format("\nНазвание: %s|" +
                " Автор: %s|" +
                " Жанр: %s|" +
                " Количество страниц: %s", getName(), getAuthor(), getGenre(), getCountPage()));
    }
}

