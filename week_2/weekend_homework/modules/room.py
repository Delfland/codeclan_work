from modules.guest import Guest
from modules.karaoke import Karaoke

class Room:
    
    def __init__(self, name, maximum_guests, entry_fee):
        self.name = name
        self.room_guests = []
        self.songs_list = []
        self.maximum_guests = maximum_guests
        self.entry_fee = entry_fee

    def check_in(self, karaoke, room, person):
        if len(self.room_guests) < self.maximum_guests:
            self.room_guests.append(person.name)
            person.reduce_wallet(self.entry_fee)
            karaoke.increase_till(self.entry_fee)
            return self.room_guests
        if len(self.room_guests) >= self.maximum_guests:
            return "This room is full"

    def check_out(self, guest):
        for name in self.room_guests:
            if name == guest.name:
                self.room_guests.remove(guest.name)
        return self.room_guests

    def add_song(self, song):
        self.songs_list.append(song)
        return self.songs_list

    def cheer(self, guest):
        for item in self.songs_list:
            if guest.favourite_song == item.name:
                return "Whoo!"
        else:
            return "No song by that name available."