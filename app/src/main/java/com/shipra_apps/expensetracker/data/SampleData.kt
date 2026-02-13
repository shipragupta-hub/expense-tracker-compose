package com.shipra_apps.expensetracker.data

import com.shipra_apps.expensetracker.model.Expense

object SampleData {
    val expense = listOf(
        Expense(
            123,
            "New Life",
            "Food",
            2000.00,
            "03-02-2026"),
        Expense(
            124,
            "New Life",
            "Transport",
            3000.00,
            "03-02-2026"),
        Expense(
            125,
            "New Life",
            "Clothes",
            500.00,
            "03-02-2026"),
        Expense(
            126,
            "New Life",
            "Savings",
            10000.00,
            "03-02-2026"),
        Expense(
            127,
            "New Life",
            "House Rent",
            5000.00,
            "03-02-2026")
    )
}