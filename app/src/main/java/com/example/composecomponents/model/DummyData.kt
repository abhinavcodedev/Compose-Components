package com.example.composecomponents.model

object DummyData {

    val foodCategories = listOf(
        "Pizza",
        "Burger",
        "Drinks",
        "Dessert"
    )
    val foodItems = listOf(
        FoodModel(
            name = "Burger",
            description = "Cheese Burger",
            image = "https://picsum.photos/200",
            price = 12
        ),

        FoodModel(
            name = "Pizza",
            description = "Italian Pizza",
            image = "https://picsum.photos/201",
            price = 15
        ),

        FoodModel(
            name = "Cold Drink",
            description = "Fresh Cold Drink",
            image = "https://picsum.photos/202",
            price = 5
        )
    )
}