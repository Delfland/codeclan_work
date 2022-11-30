from db.run_sql import run_sql

from models.book import Book
from repositories import author_repository

def save(book):
    sql = "INSERT INTO books (title, author_id, genre) VALUES (%s, %s, %s) RETURNING *"
    values = [book.title, book.author.id, book.genre]
    results = run_sql(sql, values)
    book.id = results[0]['id']
    return book

def select_all():
    books = []

    sql = "SELECT * FROM books"
    results = run_sql(sql)

    for row in results:
        author = author_repository.select(row['author_id'])
        book = Book(row['title'], author, row['genre'], row['id'])
        books.append(book)
    return books

def delete_all():
    sql = "DELETE FROM books"
    run_sql(sql)

def delete(book):
    sql = "DELETE FROM books WHERE id = %s"
    values = [id]
    run_sql(sql, values)