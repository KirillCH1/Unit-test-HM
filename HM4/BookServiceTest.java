
public class BookServiceTest {

    private BookRepository mockRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        // Создаем мок-объект для интерфейса BookRepository
        mockRepository = mock(BookRepository.class);

        // Внедряем мок-репозиторий в BookService
        bookService = new BookService(mockRepository);
    }

    @Test
    void testFindBookById() {
        // Подготовка
        String bookId = "1";
        Book expectedBook = new Book(bookId, "Book1", "Author1");

        // Настройка мок-репозитория для возврата ожидаемой книги при вызове findById с bookId
        when(mockRepository.findById(bookId)).thenReturn(expectedBook);

        // Действие
        Book actualBook = bookService.findBookById(bookId);

        // Проверка
        assertEquals(expectedBook, actualBook);

        // Проверка, что метод findById мок-репозитория был вызван с правильным аргументом
        verify(mockRepository).findById(bookId);
    }

    @Test
    void testFindAllBooks() {
        // Подготовка
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> expectedBooks = Arrays.asList(book1, book2);

        // Настройка мок-репозитория для возврата ожидаемых книг при вызове findAll
        when(mockRepository.findAll()).thenReturn(expectedBooks);

        // Действие
        List<Book> actualBooks = bookService.findAllBooks();

        // Проверка
        assertEquals(expectedBooks, actualBooks);

        // Проверка, что метод findAll мок-репозитория был вызван
        verify(mockRepository).findAll();
    }
}
