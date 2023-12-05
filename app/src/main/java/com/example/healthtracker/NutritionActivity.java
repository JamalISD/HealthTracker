package com.example.healthtracker;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class NutritionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
    }

    public void onSuggestFoodButtonClick(View view) {
        // Get the array of food items from resources
        String[] foodItems = getResources().getStringArray(R.array.food_items);

        // Get a random index to pick a food item
        int randomIndex = new Random().nextInt(foodItems.length);

        // Get the suggested food item
        String suggestedFood = foodItems[randomIndex];

        // Display the suggested food item in a TextView
        TextView suggestionTextView = findViewById(R.id.suggestionTextView);
        suggestionTextView.setText("Today's Suggestion:\n" + suggestedFood);
    }
}

