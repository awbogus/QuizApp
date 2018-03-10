package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String playerName;
    String streetName;
    String regionName;
    String planetName;
    int playerSiblings;
    String breakfast;
    String celebrityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    /**When submit button is clicked*/

    public void Submit(View view){
        getName();
        getStreet();
        getRegion();
        getPlanet();
        getSiblings();
        getBreakfastCereal();
        getBreakfastEggs();
        getBreakfastSausage();
        getBreakfastHashbrowns();
        getBreakfastFruit();
        getBreakfastCroissant();
        getBreakfastNothing();
        getCelebrity();
        displayMessage(playerName + streetName + regionName + planetName + playerSiblings + breakfast + celebrityName);
        displayMessage(playerName + "'s perfect day begins by getting the kind of deep, lengthy rest that " + playerName +
         " used to get when living on " + streetName + ". Now, however, " + playerName + " is about as likely to sleep that" +
                " soundly as " + playerName + " is to be dancing on " + planetName + ". Even so, we're talking about perfection here," +
                " so we can dare to dream. After waking, " + playerName + "'s perfect day continues with a favorite personality: " +
         celebrityName + ". " + playerName + " *loves* " + celebrityName + " and salivates at the idea of breaking bread with such " +
                "an admired sort. It's early, so the meal likely be a breakfast or brunch comprised of " + breakfast + ". Following " +
                "this - perhaps one of the best dining experiences of " + playerName + "'s life, comes the rest of the day in " + regionName + ". This can't be " +
                "perfect because perfection only comes in small doses, and too much of anything is never a good thing. \n \n Thanks for playing!");


    }


    private void getName(){
        EditText Name = (EditText) findViewById(R.id.questionOneResponse);
        playerName = Name.getText().toString();

    }

    private void getStreet(){
        EditText Street = (EditText) findViewById(R.id.questionTwoResponse);
        streetName = Street.getText().toString();
    }

    private void getRegion(){
        RadioGroup Region = (RadioGroup) findViewById(R.id.questionThreeResponse);
        int regionID = Region.getCheckedRadioButtonId();
        RadioButton regionRadioButton = (RadioButton) findViewById(regionID);
        regionName = regionRadioButton.getText().toString();

    }

    private void getPlanet(){
        RadioGroup Planet = (RadioGroup) findViewById(R.id.questionFourResponse);
        int planetID = Planet.getCheckedRadioButtonId();
        RadioButton planetRadioButton = (RadioButton) findViewById(planetID);
        planetName = planetRadioButton.getText().toString();
    }

    private void getSiblings(){
        EditText Siblings = (EditText) findViewById(R.id.questionFiveResponse);
        int numberSiblings = Integer.parseInt(Siblings.getText().toString());
        if (numberSiblings > 0) {
            playerSiblings = numberSiblings * 2;
        } else if (numberSiblings == 0) {
            playerSiblings = numberSiblings + 2;
        } else {
            Context context = getApplicationContext();
            CharSequence text = "You cannot have a negative number of siblings.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    private void getBreakfastCereal() {
        CheckBox Cereal = (CheckBox) findViewById(R.id.questionSixResponse1);
        boolean likesCereal = Cereal.isChecked();
        if (likesCereal) {
            breakfast = "cereal,";
        }
    }

    private void getBreakfastEggs() {

        CheckBox Eggs = (CheckBox) findViewById(R.id.questionSixResponse2);
        boolean likesEggs = Eggs.isChecked();
        if (likesEggs) {
            breakfast = breakfast + " eggs,";
        }
    }

    private void getBreakfastSausage() {
        CheckBox Sausage = (CheckBox) findViewById(R.id.questionSixResponse3);
        boolean likesSausage = Sausage.isChecked();
        if (likesSausage) {
            breakfast = breakfast + " sausage,";
        }
    }

    private void getBreakfastHashbrowns() {
        CheckBox Hashbrowns = (CheckBox) findViewById(R.id.questionSixResponse4);
        boolean likesHashbrowns = Hashbrowns.isChecked();
        if (likesHashbrowns) {
            breakfast = breakfast + " hashbrowns,";
        }
    }

    private void getBreakfastFruit() {
        CheckBox Fruit = (CheckBox) findViewById(R.id.questionSixResponse5);
        boolean likesFruit = Fruit.isChecked();
        if (likesFruit) {
            breakfast = breakfast + " fruit,";
        }
    }

    private void getBreakfastCroissant() {
        CheckBox Croissant = (CheckBox) findViewById(R.id.questionSixResponse6);
        boolean likesCroissant = Croissant.isChecked();
        if (likesCroissant) {
            breakfast = breakfast + " a croissant";
        }
    }


    private void getBreakfastNothing() {
        CheckBox Nothing = (CheckBox) findViewById(R.id.questionSixResponse7);
        boolean likesNothing = Nothing.isChecked();
        if (likesNothing) {
            breakfast = "nothing because I hate breakfast";
        }
    }


    private void getCelebrity(){
        RadioGroup Celebrity = (RadioGroup) findViewById(R.id.questionSevenResponse);
        int celebrityID = Celebrity.getCheckedRadioButtonId();
        RadioButton celebrityRadioButton = (RadioButton) findViewById(celebrityID);
        celebrityName = celebrityRadioButton.getText().toString();
    }


    private void displayMessage(String message) {
        TextView madLibResult = (TextView) findViewById(R.id.madlibResult);
        madLibResult.setText(message);
    }


}
