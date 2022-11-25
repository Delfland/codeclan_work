import unittest
from models.book import Book

class BookTest(unittest.TestCase):

    def setUp(self):
        self.book = Book("The Bell Jar", "Sylvia Plath", "Novel")

    def test_book_has_a_title(self):
        expected_outcome = "The Bell Jar"
        actual_outcome = self.book.title
        self.assertEqual(expected_outcome, actual_outcome)

    def test_book_has_an_author(self):
        expected_outcome = "Sylvia Plath"
        actual_outcome = self.book.author
        self.assertEqual(expected_outcome, actual_outcome)

    def test_book_has_an_author(self):
        expected_outcome = "Novel"
        actual_outcome = self.book.genre
        self.assertEqual(expected_outcome, actual_outcome)