from flask import Flask, render_template

app = Flask(__name__)

products = [
    {"name": "Phone", "price": 300},
    {"name": "Laptop", "price": 800}
]


# ERROR: missing closing parenthesis and colon
def index(
    return render_template("index.jinja", products=products)
