public class Main {
    public static void main(String[] args) {
        /*
         *** Необязательное задание**
         * Написать программу - реализацию книжного шкафа в библиотеке.
         * Должны иметь возможность добавлять \ удалять книги.
         * Узнать кол-во книг
         * При запросе сообщить есть ли такая книга у нас или нет
         * Делаем с принципом инкапсуляции. Используем геттеры, сеттеры, конструкторы
         */
        Book book = new Book("wef", "wer", "erg", 12);
        System.out.println(book);
        BookCloset bookCloset = new BookCloset();
        bookCloset.addBook(new Book("Повелитель мух", "Уильям Голдинг", "роман", 64));
        bookCloset.addBook(new Book("Дежавю", "Kizaru", "биография", 131));
        System.out.println(bookCloset);
        bookCloset.removeBook();
        System.out.println(bookCloset);
        System.out.println("Количество книг в шкафу: "+bookCloset.getCountBook());
        bookCloset.findBook();

    }
}