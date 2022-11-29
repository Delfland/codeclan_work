import pdb
from models.artist import Artist
from models.album import Album
import repositories.artist_repository as artist_repository
import repositories.album_repository as album_repository

album_repository.delete_all()
artist_repository.delete_all()

artist1 = Artist('James')
artist_repository.save(artist1)
artist2 = Artist('Moby')
artist_repository.save(artist2)

album1 = Album('laid', 'pop', artist1)
album_repository.save(album1)


pdb.set_trace()