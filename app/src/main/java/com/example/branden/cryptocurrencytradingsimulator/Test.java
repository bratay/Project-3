package com.example.branden.cryptocurrencytradingsimulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Creates the Settings activity that is displayed to the user. Settings is currently blank as it is lower priority
 * in creation but will eventually allow the user to modify aspects of the CrpytoCurrency Simulator.
 **/
public class Test extends AppCompatActivity {

    /**
     * onCreate is the default function called when starting an activity hence "onCreate" and runs the default
     * functions required based on the activity. The Settings onCreate() function sets the view to the correct XML
     * layout, and calls {@link #configureNavigationButtons()}.
     *
     * @ccs.Pre-condition The navigation button to launch Settings.
     * @ccs.Post-condition the textview is set, and the navigation buttons are configured.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        configureNavigationButtons();
    }

    /**
     * configureNavigationButtons() sets each of the Button XML elements click listeners to their corresponding button
     * in which they will startActivity the proper activity with the FLAG_ACTIVITY_CLEAR_TOP flag in order to clear
     * the stack down to any previous instances of the desired activity.
     *
     * @ccs.Pre-condition {@link #onCreate(Bundle)} is called.
     * @ccs.Post-condition Stack is cleared to any previous instance of desired activity, activity is then launched.
     */
    private void configureNavigationButtons() {
        Button homeButton = findViewById(R.id.homeBtn);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Test.this, Home.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        Button searchButton = findViewById(R.id.searchBtn);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Test.this, Search.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        Button settingsButton = findViewById(R.id.settingsBtn);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Test.this, Settings.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });
    }
}