from models.author import Author
from models.book import Book

from repositories import author_repository
from repositories import book_repository

book_repository.delete_all()
author_repository.delete_all()

author1 = Author("Stephen King")
author_repository.save(author1)
author2 = Author("Maya Angelou")
author_repository.save(author2)

author_repository.select_all()

book1 = Book("And Still I Rise", author2, "Poetry")
book_repository.save(book1)
book2 = Book("It", author1, "Horror")
book_repository.save(book2)
book3 = Book("The Shining", author1, "Horror")
book_repository.save(book3)