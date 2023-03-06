public class Main {
    public static void main(String[] args) {
        Author dmitryGlukhovsky = new Author("Дмитрий Глуховский");
        Author michaelBulgakov = new Author("Михаил Булгаков");

        Book metro = new Book("Метро", dmitryGlukhovsky, 2002);
        Book masterAndMargarita = new Book("Мастер и Маргарита", michaelBulgakov, 2006);

        System.out.println("masterAndMargarita.getName() = " + masterAndMargarita.getName());
        System.out.println("masterAndMargarita.getAuthor() = " + masterAndMargarita.getAuthor());
        System.out.println("masterAndMargarita.getPublishYear() = " + masterAndMargarita.getPublishYear());

    }
}
class Book {
    private String name;
    private Author author;
    private int publishYear;

    public Book (String name, Author author, int publishYear){
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
class Author {
    public String author;

    public Author (String author){
        this.author = author;
    }

    public String getName(){
        return author;
    }
    public void setName (String author){
        this.author = author;
    }
}