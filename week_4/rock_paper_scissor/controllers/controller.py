from flask import render_template, request, redirect
from models.player import Player
from models.game import add_players

from app import app

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/play_game", methods=["POST"])
def enter_players():
    player_a = request.form["player_a"]
    player_b = request.form["player_b"]

    new_player_a = Player(player_a, None)
    new_player_b = Player(player_b, None)
    new_players = add_players(new_player_a, new_player_b)
    return render_template("play_game.html", players = new_players)

# @app.route("/record/<int:index_number>")
# def record(index_number):
#     book_record = catalogue[index_number]
#     return render_template("book_record.html", book=book_record)

# @app.route("/record/new")
# def new_record():
#     return render_template("new_record.html")

# @app.route("/", methods=['POST'])
# def save_record():
#     form_data = request.form
#     record_title = form_data["book_title"]
#     record_author = form_data["book_author"]
#     record_genre = form_data["book_genre"]
#     checked_out = "checked_out" in form_data

#     new_book = Book(record_title, record_author, record_genre, False)
#     add_record(new_book)

#     return render_template("index.html", books=catalogue, book=new_book)

# @app.route('/record/delete/<title>', methods=['POST'])
# def delete(title):
#   delete_record(title)

#   return redirect('/')