package com.example.pankaj.app7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtStart = findViewById(R.id.txtStart);
        Button btnLoop = findViewById(R.id.btnLoop);
        final TextView txti = findViewById(R.id.txti);

        final TextView txtSwitch = findViewById(R.id.txtSwitch);
        Button btnSwitch = findViewById(R.id.btnSwitch);


        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             /*   for (int i = 0; i<=10; i++){
                    txtStart.setText( i + "");
                }
                */

             /*   int i = 0 ;
                while(i <=10){
                    txtStart.setText(i + "");
                    i++;
                }
                txti.setText(i + "");
            */

         /*  int y = 0 ;

           do{
               txtStart.setText(y + "");
               y++;
           }while (y <= 15);
           */

         for (int x = 0; x < 30; x++){

           /*  if (x == 10){
                 break;
             }
             */
           if(x == 5){
               continue;
           }
             Log.i("LOG",x + "");
         }


            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameString = "Animal1";

                switch (nameString){

                    case "Animal1":
                        txtSwitch.setText("Our Animal name is Animal1");
                        break;

                    case "Lion":
                        txtSwitch.setText("The Name of our Animal is Lion");
                        break;
                        default:
                            txtSwitch.setText("The Name of our Animal is Something Else");

                }
            }
        });

    }
}
