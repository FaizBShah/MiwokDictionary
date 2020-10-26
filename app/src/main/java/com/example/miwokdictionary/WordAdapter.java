package com.example.miwokdictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        this.mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Getting the current Word object from the ArrayList
        Word currentWord = getItem(position);

        // Getting the different view from the listItemView
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        ImageView imageView = listItemView.findViewById(R.id.word_image);

        // Setting the miwok translation in the miwokTextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Setting the default translation in the defaultTextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Checking if the current word has an image associated with it
        if(currentWord.hasImage()) {
            // If it has, then set the associated image with the imageView
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // If it does not have, remove the imageView
            imageView.setVisibility(View.GONE);
        }

        // Setting the background color
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
