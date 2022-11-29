from db.run_sql import run_sql

import repositories.artist_repository as artist_repository
from models.album import Album

def select(id):
    artist = artist_repository.select(result['artist_id'])
    album = None
    sql = "SELECT * FROM albums WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)
    if results:
        result = results[0]
        album = Album(result['title'], result['genre'], artist, result['id'])
        return album

def select_all():
    albums = []

    sql = "SELECT * FROM albums"
    results = run_sql(sql)

    for row in results:
        artist = artist_repository.select(row['artist_id'])
        album = Album(row['title'], row['id'])
        albums.append(album)
    return albums

def save(album):
    sql = f'''INSERT INTO albums (title, genre, artist_id)
    VALUES (%s, %s, %s) RETURNING *'''
    values = [album.title, album.genre, album.artist.id]
    results = run_sql(sql, values)
    id = results[0]['id']
    album.id = id
    return album

def delete_all():
    sql = "DELETE FROM albums"
    run_sql(sql)