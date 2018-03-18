package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by GOODLUCK on 3/6/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /** Resource ID for the background color for this list of words*/
    private  int mColorsResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorsResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, words);
        mColorsResourceId = colorsResourceId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        // Get the miwok Translation from the current Word object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID english
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english);
        // Get the DefaultTranslation from the current Word  object and
        // set this text on the english TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());



        //Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());

        /***
         * set the theme color for the list item
         * REMEMBER TO NOT INCLUDE THIS CODE DURING CODING BEFORE
         */

        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorsResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
