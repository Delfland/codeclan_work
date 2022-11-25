from models.event import Event
import datetime

event1 = Event(datetime.date(2022, 11, 26), "Eden's birthday", 15, "Blue room", "birthday party")
event2 = Event(datetime.date(2022, 11, 30), "Superpets", 50, "Green room", "cinema screening")
event3 = Event(datetime.date(2022, 12, 22), "Christmas ceilidh", 100, "Red room", "ceilidh dance")

events_list = [event1, event2, event3]

def get_event(event_index):
    return events_list[event_index]