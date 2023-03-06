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