import unittest
from modules.song import Song

class SongTest(unittest.TestCase):

    def setUp(self):
        self.song = Song("Smells Like Teen Spirit")

    def test_song_has_name(self):
        expected_outcome = "Smells Like Teen Spirit"
        actual_outcome = self.song.name
        self.assertEqual(actual_outcome, expected_outcome)