from models.player import Player

class Game:

    def __init__(self, player_a, player_b):
        self.player_a = player_a
        self.player_b = player_b
        self.players = []

    