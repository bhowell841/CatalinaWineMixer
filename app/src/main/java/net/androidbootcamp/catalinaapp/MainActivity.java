package net.androidbootcamp.catalinaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //declare variables
    double costperticket = 34.00;
    int numberOfTickets;
    double totalCost;
    String ticketChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare and initialize references
        final EditText tickets=(EditText)findViewById(R.id.txtNumOfTickets);
        final Spinner group = (Spinner)findViewById(R.id.txtTime);

        // declare button
        Button cost = (Button)findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener(){
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View v){
                numberOfTickets = Integer.parseInt(tickets.getText().toString());
                totalCost = numberOfTickets * costperticket;

                //Format decimal
                DecimalFormat currency = new DecimalFormat("$###,###.##");

                //define choice
                ticketChoice = group.getSelectedItem().toString();

                result.setText("The Cost " + ticketChoice + " is " + currency.format(totalCost));

            }
        });




    }
} //end class
