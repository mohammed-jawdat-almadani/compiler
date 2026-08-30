from flask import Flask, render_template

app = Flask(__name__)

products = [
    {"id": 1, "name": "Laptop", "price": 999.99}
]

# ERROR 1: price_list is never defined
total = price_list + 5

# ERROR 2: 'return' outside a function
return total


def helper():
    return 1


# ERROR 3: redeclaration of 'helper' in the same scope
def helper():
    return 2


@app.route("/")
def index():
    # ERROR 4: call to an undefined function
    items = load_items()
    return render_template("index.jinja", products=products)


@app.route("/about")
def about():
    # ERROR 5: renders a template that does not exist
    return render_template("about.jinja")
