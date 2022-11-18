import unittest
from modules.room import Room
from modules.guest import Guest
from modules.song import Song
from modules.karaoke import Karaoke

class RoomTest(unittest.TestCase):
    
    def setUp(self):
        self.karaoke = Karaoke("Delph's Karaoke", 100.00)
        self.room = Room("Karaoke 1", 3, 10.00)
        self.guest1 = Guest("Ida", 40.00, "Smells like Teen Spirit")
        self.guest2 = Guest("Jodie", 25.00, "Wish you were here")
        self.guest3 = Guest("Joe", 30.00, "Laid")
        self.guest4 = Guest("Eden", 45.00, "Let it go")
        self.song1 = Song("Smells like Teen Spirit")
        self.song2 = Song("Let it go")
        self.song3 = Song("Wish you were here")
        self.song4 = Song("Laid")
        
    
    def test_room_has_name(self):
        expected_outcome = "Karaoke 1"
        actual_outcome = self.room.name
        self.assertEqual(actual_outcome, expected_outcome)


    def test_add_guest_to_room(self):
        new_guest = self.guest1
        expected_outcome = ["Ida"]
        actual_outcome = self.room.check_in(self.karaoke, self.room, new_guest)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_remove_guest_from_room(self):
        self.room.check_in(self.karaoke, self.room, self.guest1)
        self.room.check_in(self.karaoke, self.room, self.guest2)
        self.room.check_in(self.karaoke, self.room, self.guest3)
        input_guest = self.guest2
        expected_outcome = ["Ida", "Joe"]
        actual_outcome = self.room.check_out(input_guest)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_add_song_to_room(self):
        input_song = self.song2.name
        expected_outcome = ["Let it go"]
        actual_outcome = self.room.add_song(input_song)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_refuse_entry_if_room_is_at_max_capacity(self):
        self.room.check_in(self.karaoke, self.room, self.guest1)
        self.room.check_in(self.karaoke, self.room, self.guest2)
        self.room.check_in(self.karaoke, self.room, self.guest3)
        input_guest = self.guest4
        expected_outcome = "This room is full"
        actual_outcome = self.room.check_in(self.karaoke, self.room, input_guest)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_charge_entry_fee_when_adding_customer_to_room(self):
        input_room = self.room
        input_guest = self.guest4
        input_guest2 = self.guest1
        input_karaoke = self.karaoke
        self.room.check_in(input_karaoke, input_room, input_guest)
        self.room.check_in(input_karaoke, input_room, input_guest2)
        expected_outcome1 = ["Eden", "Ida"]
        expected_outcome2 = 35.00
        expected_outcome3 = 30.00
        self.assertEqual(expected_outcome1, self.room.room_guests)
        self.assertEqual(expected_outcome2, input_guest.wallet)
        self.assertEqual(expected_outcome3, input_guest2.wallet)

    def test_guest_cheers_for_favourite_song(self):
        self.room.add_song(self.song1)
        self.room.add_song(self.song2)
        self.room.add_song(self.song3)
        self.room.add_song(self.song4)
        expected_outcome = "Whoo!"
        actual_outcome = self.room.cheer(self.guest3)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_favourite_song_not_in_song_list(self):
        self.room.add_song(self.song1)
        self.room.add_song(self.song2)
        self.room.add_song(self.song3)
        expected_outcome = "No song by that name available."
        actual_outcome = self.room.cheer(self.guest3)
        self.assertEqual(actual_outcome, expected_outcome)

    def test_can_increase_till_when_guest_checks_in(self):
        input_room = self.room
        input_guest = self.guest4
        input_guest2 = self.guest1
        input_karaoke = self.karaoke
        self.room.check_in(input_karaoke, input_room, input_guest)
        self.room.check_in(input_karaoke, input_room, input_guest2)
        expected_outcome1 = ["Eden", "Ida"]
        expected_outcome2 = 35.00
        expected_outcome3 = 30.00
        expected_outcome4 = 120.00
        self.assertEqual(expected_outcome1, self.room.room_guests)
        self.assertEqual(expected_outcome2, input_guest.wallet)
        self.assertEqual(expected_outcome3, input_guest2.wallet)
        self.assertEqual(expected_outcome4, input_karaoke.till)