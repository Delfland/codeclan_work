


# Add a method has_player that takes in a string of a player's name 
# and checks to see if they are in the players list. 
# It should return True if the player's name is in the list and False otherwise.

class Team:
    def __init__(self, input_team_name, input_team_players, input_team_coach):
        self.name = input_team_name
        self.players = input_team_players
        self.coach = input_team_coach
        self.points = 0

    def add_player(self, new_player):
        self.players.append(new_player)


    def has_player(self, player_to_find):
        for player in self.players:
            if player == player_to_find:
                return True
        return False

    def play_game(self, result):
        if result == True: # or if result:
            self.points += 3

        



    

