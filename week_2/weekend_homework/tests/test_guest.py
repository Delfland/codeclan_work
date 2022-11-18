import unittest
from modules.guest import Guest

class GuestTest(unittest.TestCase):

    def setUp(self):
        self.guest = Guest("John", 50.00, "She will be loved")

    def test_guest_has_name(self):
        expected_outcome = "John"
        actual_outcome = self.guest.name
        self.assertEqual(actual_outcome, expected_outcome)

    def test_guest_has_wallet(self):
        expected_outcome = 50.00
        actual_outcome = self.guest.wallet
        self.assertEqual(actual_outcome, expected_outcome)

    def test_reduce_wallet(self):
        input_sum = 10.00
        expected_outcome = 40.00
        actual_outcome = self.guest.reduce_wallet(input_sum)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_guest_has_favourite_song(self):
        expected_outcome = "She will be loved"
        actual_outcome = self.guest.favourite_song
        self.assertEqual(actual_outcome, expected_outcome)