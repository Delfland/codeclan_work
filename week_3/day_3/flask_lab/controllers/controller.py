from app import app
from flask import render_template
from models.orders_list import all_orders


@app.route("/")
def show_orders():
    return render_template("all_orders.html", title="Home", orders=all_orders)

@app.route("/order/<int:order_id>")
def show_single_order(order_id):
    order = all_orders[order_id]
    return render_template("single_order.html", title="Order", order=order)

