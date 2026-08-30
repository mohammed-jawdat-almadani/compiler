// Supporting script: copied to the output folder as-is (not processed by the compiler).
function confirmDelete() {
  return confirm("Are you sure you want to delete this product?");
}

document.addEventListener("DOMContentLoaded", function () {
  var cards = document.querySelectorAll(".card");
  for (var i = 0; i < cards.length; i++) {
    cards[i].addEventListener("mouseenter", function () { this.style.transform = "translateY(-2px)"; });
    cards[i].addEventListener("mouseleave", function () { this.style.transform = ""; });
  }
});
