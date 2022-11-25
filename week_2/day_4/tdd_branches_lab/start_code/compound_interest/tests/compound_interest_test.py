import unittest

from src.compound_interest import CompoundInterest

class CompoundInterestTest(unittest.TestCase):

    # Tests

    # Should return 732.81 given 100 principal, 10 percent, 20 years
    def test_compound_interest_1(self):
        compound_interest1 = CompoundInterest(100.00, 10, 20, 0)
        expected_outcome = 732.81
        actual_outcome = compound_interest1.calculate_investment()
        self.assertEqual(actual_outcome, expected_outcome)
    # Should return 181.94 given 100 principal, 6 percent, 10 years
    def test_compound_interest_2(self):
        compound_interest2 = CompoundInterest(100.00, 6, 10, 0)
        expected_outcome = 181.94
        actual_outcome = compound_interest2.calculate_investment()
        self.assertEqual(actual_outcome, expected_outcome)
    # Should return 149,058.55 given 100000 principal, 5 percent, 8 years
    def test_compound_interest_3(self):
        compound_interest3 = CompoundInterest(100000.00, 5, 8, 0)
        expected_outcome = 149058.55
        actual_outcome = compound_interest3.calculate_investment()
        self.assertEqual(actual_outcome, expected_outcome)
    # Should return 0.00 given 0 principal, 10 percent, 1 year
    def test_compound_interest_4(self):
        compound_interest4 = CompoundInterest(0.00, 5, 8, 0)
        expected_outcome = 0.00
        actual_outcome = compound_interest4.calculate_investment()
        self.assertEqual(actual_outcome, expected_outcome)
    # Should return 100.00 given 100 principal, 0 percent, 10 years
    def test_compound_interest_5(self):
        compound_interest5 = CompoundInterest(100.00, 0, 10, 0)
        expected_outcome = 100.00
        actual_outcome = compound_interest5.calculate_investment()
        self.assertEqual(actual_outcome, expected_outcome)

    # Extention tests

    # Should return 118,380.16 given 100 principal, 5 percent, 8 years, 1000 per month
    # def test_compound_interest_with_contributions_1(self):
    #     compound_interest_with_contributions_1 = CompoundInterest(100.00, 5, 8, 1000)
    #     expected_outcome = 118380.16
    #     actual_outcome = compound_interest_with_contributions_1.calculate_investment_with_contributions()
    #     self.assertEqual(actual_outcome, expected_outcome)
    # Should return 156,093.99 given 100 principal, 5 percent, 10 years, 1000 per month

    # Should return 475,442.59 given 116028.86, 7.5 percent, 8 years, 2006 per month

    # Should return 718,335.96 given 116028.86 principal, 9 percent, 12 years, 1456 per month

