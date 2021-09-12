package com.example.sosgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.outputText)).setText("Player 1 turn!");
    }
    public void pressButton (View pressed){
        pressed.setEnabled(false);
        TextView output = findViewById(R.id.outputText);

        if(output.getText()=="Player 1 turn!"){
            ((TextView) findViewById(R.id.outputText)).setText("Player 2 turn!");
            Button thisButton = (Button) pressed;
            thisButton.setText("S");

        }
        else {
            ((TextView) findViewById(R.id.outputText)).setText("Player 1 turn!");
            Button thisButton = (Button) pressed;
            thisButton.setText("O");

        }
    }
    public void pressReset (View resetPressed){
        ((TextView) findViewById(R.id.outputText)).setText("Player 1 turn!");
        //Buttons
        ((Button) findViewById(R.id.button1)).setEnabled(true);
        ((Button) findViewById(R.id.button1)).setText("");

        ((Button) findViewById(R.id.button2)).setEnabled(true);
        ((Button) findViewById(R.id.button2)).setText("");

        ((Button) findViewById(R.id.button3)).setEnabled(true);
        ((Button) findViewById(R.id.button3)).setText("");

        ((Button) findViewById(R.id.button4)).setEnabled(true);
        ((Button) findViewById(R.id.button4)).setText("");

        ((Button) findViewById(R.id.button5)).setEnabled(true);
        ((Button) findViewById(R.id.button5)).setText("");

        ((Button) findViewById(R.id.button6)).setEnabled(true);
        ((Button) findViewById(R.id.button6)).setText("");

        ((Button) findViewById(R.id.button7)).setEnabled(true);
        ((Button) findViewById(R.id.button7)).setText("");

        ((Button) findViewById(R.id.button8)).setEnabled(true);
        ((Button) findViewById(R.id.button8)).setText("");

        ((Button) findViewById(R.id.button9)).setEnabled(true);
        ((Button) findViewById(R.id.button9)).setText("");

    }
}