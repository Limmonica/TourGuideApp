package com.example.limmonica.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ElementAdapter extends ArrayAdapter<Element> {

    ElementAdapter(Context context, ArrayList<Element> elements) {
        super(context, 0, elements);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Element currentElement = getItem(position);

        ImageView elementImageView = listItemView.findViewById(R.id.element_image_view);
        assert currentElement != null;
        elementImageView.setImageResource(currentElement.getElementImgResId());
        elementImageView.setVisibility(View.VISIBLE);

        TextView elementNameTextView = listItemView.findViewById(R.id.element_name_text_view);
        elementNameTextView.setText(currentElement.getElementNameId());

        TextView elementDescTextView = listItemView.findViewById(R.id.element_desc_text_view);
        elementDescTextView.setText(currentElement.getElementDescId());

        return listItemView;
    }
}