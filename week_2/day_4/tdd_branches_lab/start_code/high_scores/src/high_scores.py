def latest(scores):
    return scores[-1]


def personal_best(scores):
    best_score = max(scores)
    return best_score


def personal_top_three(scores):
    size = len(scores)
    if size < 3:
        scores.sort()
        return scores[0:size]
    scores.sort()
    return scores[-3:]
    

def sort_scores(scores):
    scores.sort()
    return scores
