import unittest

from src.high_scores import *

# Tests adapted from `problem-specifications//canonical-data.json` @ v4.0.0


class HighScoresTest(unittest.TestCase):
    
    # Tests

    # Test latest score (the last thing in the list)
    def test_latest_score(self):
        scores_list = [450000, 670000, 860630]
        expected_output = 860630
        actual_output = latest(scores_list)
        self.assertEqual(expected_output, actual_output)

    # Test personal best (the highest score in the list)
    def test_highest_score(self):
        scores_list = [450000, 860630, 670000, 230000]
        expected_output = 860630
        actual_output = personal_best(scores_list)
        self.assertEqual(expected_output, actual_output)


    # Test top three from list of scores
    def test_top_three_scores(self):
        scores_list = [450000, 860630, 670000, 230000]
        expected_output = [450000, 670000, 860630]
        actual_output = personal_top_three(scores_list)
        self.assertEqual(expected_output, actual_output)

    # Test ordered from highest to lowest
    def test_list_scores_highest_to_lowest(self):
        scores_list = [450000, 860630, 670000, 230000]
        expected_output = [230000, 450000, 670000, 860630]
        actual_output = sort_scores(scores_list)
        self.assertEqual(expected_output, actual_output)

    # Test top three when there is a tie
    def test_top_three_still_works_with_tie(self):
        scores_list = [450000, 860630, 670000, 230000, 670000]
        expected_output = [670000, 670000, 860630]
        actual_output = personal_top_three(scores_list)
        self.assertEqual(expected_output, actual_output)

    # Test top three when there are less than three
    def test_top_three_still_works_with_only_two_scores(self):
        scores_list = [670000, 230000]
        expected_output = [230000, 670000]
        actual_output = personal_top_three(scores_list)
        self.assertEqual(expected_output, actual_output)

    # Test top three when there is only one
    def test_top_three_still_works_with_only_one_score(self):
        scores_list = [230000]
        expected_output = [230000]
        actual_output = personal_top_three(scores_list)
        self.assertEqual(expected_output, actual_output)
    
