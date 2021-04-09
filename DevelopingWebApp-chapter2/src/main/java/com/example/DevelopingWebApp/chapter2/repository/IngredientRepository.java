package com.example.DevelopingWebApp.chapter2.repository;

import com.example.DevelopingWebApp.chapter2.entity.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(int id);
    Ingredient save(Ingredient ingredient);
}
