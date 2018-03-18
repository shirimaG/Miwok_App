/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view of the Family textView
        TextView familyView = (TextView) findViewById(R.id.family);

        //set OnclicListener on family view
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //Opening a family activity using intent
                Intent familyIntent = new Intent(view.getContext(),FamilyActivity.class);
                startActivity(familyIntent);
                Toast toast = Toast.makeText(view.getContext(),"Open the family list",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        //find View of the Colors TextView
        TextView colorsView= (TextView) findViewById(R.id.colors);

        //create colors onClickListener
        colorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
                Toast toast =Toast.makeText(MainActivity.this,"Open the Colors List",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        //Find view for the Phrases TextView
        TextView phrasesView= (TextView) findViewById(R.id.phrases);
        //Set OnClick Listener For the Phrases list Activity
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent =new Intent(MainActivity.this,PhraseActivity.class);
                startActivity(phrasesIntent);
                Toast toast=Toast.makeText(MainActivity.this,"Open the Phrases List",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        //Fnd View for the Numbers TextView
        TextView numbersView= (TextView) findViewById(R.id.numbers);
        //Set OnLick Listener for Numbers List Activity
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
                Toast toast=Toast.makeText(MainActivity.this,"Open the Numbers List",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}
