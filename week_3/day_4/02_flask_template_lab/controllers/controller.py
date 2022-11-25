from flask import render_template
from models.events_list import events_list, get_event
from models.event import Event

from app import app

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/events")
def events():
    return render_template("current_events.html", events=events_list)

# @app.route("/events/int:event_index")
# def event(event_index):
#     my_event = get_event(event_index)
#     return render_template("event.html", event=my_event)