package com.example.healthtracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ExerciseActivity extends AppCompatActivity {

    private TextView exerciseTextView;

    // List of exercises (add more as needed)
    private String[] exercises = {"Push-ups", "Sit-ups", "Jumping Jacks", "Squats", "Plank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);

        exerciseTextView = findViewById(R.id.exerciseTextView);
    }

    // Called when the "New Workout" button is clicked
    public void onNewWorkoutButtonClick(View view) {
        // Get a random exercise from the list
        String randomExercise = getRandomExercise();

        // Display the selected exercise in the TextView
        exerciseTextView.setText("Current Exercise: " + randomExercise);
    }

    // Method to get a random exercise from the list
    private String getRandomExercise() {
        Random random = new Random();
        int index = random.nextInt(exercises.length);
        return exercises[index];
    }
}
