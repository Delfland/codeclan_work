import random

class Player:

    def __init__(self, name, choice = None):
        self.name = name
        self.choice = choice

    def choose(self):
        random_choice = print(random.randint(1,3))
        if random_choice == 1:
            self.choice = "rock"
            return self.choice
        if random_choice == 2:
            self.choice = "paper"
            return self.choice
        if random_choice == 3:
            self.choice = "scissor"
            return self.choice
