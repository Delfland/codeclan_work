import unittest
from src.football_results import *

class FootballResultsTest(unittest.TestCase):
    # Test we get the right result string for a final 
    # score dictionary representing -

        # Home win
        # Away win
        # Draw

    def test_result_is_a_home_win(self):
        game_score1 = {    
        "home_score": 2,
        "away_score": 1
        }
        score_input = game_score1
        expected_outcome = "Home win"
        actual_outcome = get_result(game_score1)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_result_is_an_away_win(self):
        game_score2 = {    
        "home_score": 0,
        "away_score": 1
        }
        score_input = game_score2
        expected_outcome = "Away win"
        actual_outcome = get_result(game_score2)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_result_is_a_draw(self):
        game_score3 = {    
        "home_score": 1,
        "away_score": 1
        }
        score_input = game_score3
        expected_outcome = "Draw"
        actual_outcome = get_result(game_score3)
        self.assertEqual(actual_outcome, expected_outcome)


    # Test we get right list of result strings for a list of 
    # final score dictionaries. 
    def test_get_final_scores_in_a_list(self):
        results = [{"home_score": 2, "away_score": 1},
                    {"home_score": 0, "away_score": 1},
                    {"home_score": 1, "away_score": 1}]
        results_input = results
        expected_outcome = ["Home win", "Away win", "Draw"]
        actual_outcome = get_results(results_input)
        self.assertEqual(actual_outcome, expected_outcome)



if __name__ == "__main__":
    unittest.main()
