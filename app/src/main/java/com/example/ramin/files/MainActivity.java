package com.example.ramin.files;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int selectedIndex;
    private CharSequence[] options = new CharSequence[]{"red","green","blue","black","white"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         AlertDialog.Builder builder = new AlertDialog.Builder(this);
         builder.setTitle("Select Your Favorite Color");
         builder.setCancelable(false);
         builder.setPositiveButton("0k", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 Toast.makeText(MainActivity.this,"you selected index : " + selectedIndex  + "\nValue is : " + options[selectedIndex] ,Toast.LENGTH_LONG).show();

             }
         });

         builder.setSingleChoiceItems(options, 0, new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 selectedIndex = i;
             }
         });
         AlertDialog alertDialog = builder.create();
         alertDialog.show();
    }
}
