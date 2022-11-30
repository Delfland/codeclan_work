from db.run_sql import run_sql

from models.book import Book
from repositories import author_repository

def save(book):
    sql = "INSERT INTO books (title, author_id, genre) VALUES (%s, %s, %s) RETURNING *"
    values = [book.title, book.author.id, book.genre]
    results = run_sql(sql, values)
    book.id = results[0]['id']
    return book

def delete_all():
    sql = "DELETE FROM books"
    run_sql(sql)