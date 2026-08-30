from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

# ---------------------------------------------------------------------------
# Data (in memory).  The compiler evaluates this list and passes it to the
# templates as the "context data" during code generation.
# ---------------------------------------------------------------------------
products = [
    {"id": 1, "name": "Laptop", "price": 1200, "details": "High performance laptop", "image": "laptop.png"},
    {"id": 2, "name": "Phone", "price": 800, "details": "Smart phone", "image": "mobile.png"},
]

shop_name = "Products Application"


def _find_product_by_id(product_id):
    """Find a product dict by id using a simple loop."""
    for p in products:
        if p["id"] == product_id:
            return p
    return None


@app.route("/")
def index():
    total = len(products)
    return render_template("index.jinja", products=products, total=total, shop_name=shop_name)


@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        new_product = {
            "id": len(products) + 1,
            "name": request.form["name"],
            "price": request.form["price"],
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
        product["price"] = request.form["price"]
        product["details"] = request.form["details"]
        product["image"] = request.form["image"]
        return redirect(url_for("index"))

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
