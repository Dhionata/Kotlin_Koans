fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.forEachIndexed { index, (description, price, popularity) ->
                tr {
                    td(getCellColor(index, 0)) {
                        text(description)
                    }
                    td(getCellColor(index, 1)) {
                        text(price)
                    }
                    td(getCellColor(index, 2)) {
                        text(popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"
