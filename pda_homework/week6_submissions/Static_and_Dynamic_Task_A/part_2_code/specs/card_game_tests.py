import unittest
from src.card import Card
from src.card_game import CardGame

class TestCardGame(unittest.TestCase):

    def setUp(self):
        self.card1 = Card("Hearts", 12)
        self.card2 = Card("Diamond", 1)
        self.cardgame = CardGame()
        self.cards = [self.card1, self.card2]

    
    def test_card_is_an_ace(self):
        expected_outcome = False
        actual_outcome = self.cardgame.check_for_ace(self.card1)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_card1_is_highest(self):
        expected_outcome = self.card1
        actual_outcome = self.cardgame.highest_card(self.card1, self.card2)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_cards_total_is_thirteen(self):
        expected_outcome = "You have a total of 13"
        actual_outcome = self.cardgame.cards_total(self.cards)
        self.assertEqual(actual_outcome, expected_outcome)