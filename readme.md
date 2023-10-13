# Лабораторна робота №1
## Тема: Розробіть програму мовою Java для керування простою бібліотекою
____________

### Виконав: Білоус Марк Олександрович ПД-31

____________


### Що потрібно мати в лабораторній роботі?

Додавати нову книгу в бібліотеку.
Показувати всі книги в бібліотеці.
Шукайти книгу за її назвою.
Видаляти книгу з бібліотеки за її номером ISBN.


## Етапи виконання

### Перший етап

Створення репозиторія в GitHub, створення нового 
проєкту на java та push на репозиторій.

### Другий етап

Створення класу Book, вказуємо тип даних які повинні зберігатись про книжки.
Створення класу Library LibraryManager. 
Також реалізували головні методи для додавання, видалення, відображення та пошуку книг.

### Третій етап

Створення JUnit тестів для нашої програми для перевірки функціоналу класу Book,
Ці тести перевіряють конструктор класу Book, а також методи доступу 
(getTitle(), getAuthor(), getIsbn(), getYear()) і метод toString(). 

Створення тесту також для класу library
Ці тести покривають додавання книги, пошук книги за назвою і видалення книги за ISBN. 

Та на останок створення тесту для класу LibraryManager
Цей тест перевіряє основну функціональність LibraryManager, таку як додавання, пошук та видалення книг.

