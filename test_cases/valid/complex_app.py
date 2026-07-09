from flask import Flask
app = Flask(__name__)

class Store:
    def __init__(self, name):
        self.name = name

store = Store("MyStore")
products = [
    {"id": 1, "name": "A", "price": 10},
    {"id": 2, "name": "B", "price": 20}
]

def get_product(pid):
    for p in products:
        if p.id == pid:
            return p
    return None

x = 10 + 20
if x > 15:
    y = "valid"

not_found = False
