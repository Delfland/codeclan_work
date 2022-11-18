import unittest
from modules.karaoke import Karaoke

class KaraokeTest(unittest.TestCase):

    def setUp(self):
        self.karaoke = Karaoke("Delph's Karaoke", 100.00)

    def test_karaoke_has_name(self):
        expected_outcome = "Delph's Karaoke"
        actual_outcome = self.karaoke.name
        self.assertEqual(actual_outcome, expected_outcome)

    def test_karaoke_has_till(self):
        expected_outcome = 100.00
        actual_outcome = self.karaoke.till
        self.assertEqual(actual_outcome, expected_outcome)

    def test_can_increase_till(self):
        input_amount = 10.00
        expected_outcome = 110.00
        actual_outcome = self.karaoke.increase_till(input_amount)
        self.assertEqual(actual_outcome, expected_outcome)

    