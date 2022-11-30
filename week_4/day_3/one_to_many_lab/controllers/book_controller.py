from flask import render_template, Blueprint, redirect
from repositories import book_repository, author_repository
from models.book import Book

book_blueprint = Blueprint("books", __name__)

#INDEX
#GET '/books'
@book_blueprint.route('/books')
def books():
    all_books = book_repository.select_all()
    return render_template('books/index.html', all_books_key = all_books)

# DELETE
@book_blueprint.route('/books/<book_id>/delete', methods=['POST'])
def delete_book(book_id):
    book_repository.delete(book_id)
    return redirect('/books')