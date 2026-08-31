from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

store_name = "Demo Store"
currency = "USD"

products = [
    {"id": 1, "name": "Laptop", "price": 1200.50, "tags": ["computers", "portable"], "stock": 3},
    {"id": 2, "name": "Phone", "price": 800, "tags": ["mobile"], "stock": 0},
    {"id": 3, "name": "Cable", "price": 9.99, "tags": [], "stock": 120},
]


def in_stock(items):
    result = []
    for p in items:
        if p["stock"] > 0:
            result.append(p)
    return result


def total_value(items):
    total = 0
    for p in items:
        total = total + p["price"] * p["stock"]
    return total


@app.route("/")
def index():
    available = in_stock(products)
    return render_template("index.jinja",
                           products=products,
                           available=available,
                           total=total_value(products),
                           store_name=store_name,
                           currency=currency)


@app.route("/product/<int:product_id>")
def product(product_id):
    item = None
    for p in products:
        if p["id"] == product_id:
            item = p
    return render_template("product.jinja", item=item, store_name=store_name, currency=currency)


@app.route("/reset")
def reset():
    return redirect(url_for("index"))
