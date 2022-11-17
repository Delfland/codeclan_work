def get_result(final_score):
    home_score = final_score.get("home_score") 
    away_score = final_score.get("away_score")
    if home_score > away_score:
        return "Home win"
    if home_score < away_score:
        return "Away win"
    if home_score == away_score:
        return "Draw"

def get_results(final_scores):
    total_scores = []
    for score in final_scores:
        total_scores.append(get_result(score))
    return total_scores
    # (You could try and use a list comprehension for this)