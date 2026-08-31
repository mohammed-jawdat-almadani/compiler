from flask import Flask, render_template, request, redirect, url_for
from data import products, shop_name

app = Flask(__name__)


def _find_product_by_id(product_id):
    """Find a product dict by id using a simple loop."""
    for p in products:
        if p["id"] == product_id:
            return p
    return None


def _next_id():
    highest = 0
    for p in products:
        if p["id"] > highest:
            highest = p["id"]
    return highest + 1


@app.route("/")
def index():
    total = len(products)
    return render_template("index.jinja", products=products, total=total, shop_name=shop_name)


@app.route("/product/<int:product_id>")
def product_details(product_id):
    product = _find_product_by_id(product_id)
    return render_template("product_details.jinja", product=product, shop_name=shop_name)


@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        new_product = {
            "id": _next_id(),
            "name": request.form["name"],
            "price": int(request.form["price"]),
            "details": request.form["details"],
            "image": request.form["image"],
        }
        products.append(new_product)
        return redirect(url_for("index"))

    return render_template("add_product.jinja", shop_name=shop_name)


@app.route("/edit/<int:product_id>", methods=["GET", "POST"])
def edit_product(product_id):
    product = _find_product_by_id(product_id)

    if request.method == "POST" and product:
        product["name"] = request.form["name"]
        product["price"] = int(request.form["price"])
        product["details"] = request.form["details"]
        product["image"] = request.form["image"]
        return redirect(url_for("product_details", product_id=product_id))

    return render_template("edit_product.jinja", product=product, shop_name=shop_name)


@app.route("/delete/<int:product_id>")
def delete_product(product_id):
    global products

    new_products = []
    for p in products:
        if p["id"] != product_id:
            new_products.append(p)

    products = new_products
    return redirect(url_for("index"))


if __name__ == "__main__":
    app.run(debug=True)
