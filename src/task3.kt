fun showMenu(menu: List<Dish>) {
    if (menu.isEmpty()) {
        println("Меню пусто.")
        return
    }
    println("\n=== МЕНЮ ===")
    for (dish in menu) {
        dish.displayInfo()
        println()
    }
}