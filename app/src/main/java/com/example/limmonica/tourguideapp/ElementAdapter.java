package com.example.limmonica.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link ElementAdapter} is an {@link ArrayAdapter} that can provide the layout for each recycler_view
 * item based on a {@link DATA} source, which is a recycler_view of {@link @Element} objects
 */
public class ElementAdapter extends ArrayAdapter<Element> {

    /**
     * Create a new {@link ElementAdapter} object.
     *
     * @param context  is the current context (i.e. Activity) that the adapter is being created in.
     * @param elements is the recycler_view of {@link Element}s to be displayed.
     */
    ElementAdapter(Context context, ArrayList<Element> elements) {
        super(context, 0, elements);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Initialise the holder
        ViewHolder holder;

        // If there is no existing view being reused
        if (convertView == null) {
            // Inflate the view
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            // Setup the holder
            holder = new ViewHolder(convertView);
            // Store the holder tag with the convertView
            convertView.setTag(holder);
        } else {
            // Otherwise use the holder instead of calling findViewById() on resource every time
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the {@link Element} object located at this position in the recycler_view
        final Element currentElement = getItem(position);

        // Find and set/assign values if the object currentElement is not null
        if (currentElement != null) {
            // Get the layout elements from the ViewHolder and set the value for each element
            holder.elementNameTextView.setText(currentElement.getElementNameId());
            holder.elementDescTextView.setText(currentElement.getElementDescId());
            holder.elementPicImageView.setImageResource(currentElement.getElementPicResId());
            // Make sure the view is visible
            holder.elementPicImageView.setVisibility(View.VISIBLE);
            // Find the Directions TextView, don't set any value, but create an Intent action

            // Set a click listener on the Directions TextView
            holder.elementMapTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the element map address and store it as a String
                    String elementMap = getContext().getResources().getString(currentElement.getElementMapId());
                    // Create an Intent to open the element map directions
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(elementMap));
                    mapIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(mapIntent);
                }
            });

            // Check if a logo image is provided for the current element
            if (currentElement.hasLogo()) {
                // If a logo image is available, display the provided image
                holder.elementLogoImageView.setImageResource(currentElement.getElementLogoResId());
                // Make sure the view is visible
                holder.elementLogoImageView.setVisibility(View.VISIBLE);
            } else {
                // Otherwise hide the ImageView
                holder.elementLogoImageView.setVisibility(View.GONE);
            }

            // Check if a phone number is provided
            if (currentElement.hasPhone()) {
                // If a phone number is available, store it in a String variable
                final String elementPhone = getContext().getResources().getString(currentElement.getElementPhoneId());
                // Set a click listener on the Phone TextView
                holder.elementPhoneTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Create a call Intent
                        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(String.format("tel:%s", elementPhone)));
                        callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        getContext().startActivity(callIntent);
                    }
                });
            } else {
                // Otherwise hide the Phone TextView
                holder.elementPhoneTextView.setVisibility(View.GONE);
            }
        }

        // Check if a website address is provided
        assert currentElement != null;
        if (currentElement.hasWeb()) {
            // If an website address is available, store it in a String variable
            final String elementWeb = getContext().getResources().getString(currentElement.getElementWebId());
            // Set a click listener on the Website TextView
            holder.elementWebTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a view Intent
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(elementWeb));
                    webIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(webIntent);
                }
            });
        } else {
            // Otherwise hide the Website TextView
            holder.elementWebTextView.setVisibility(View.GONE);
        }

        // Check if a Facebook page web address is provided
        if (currentElement.hasFb()) {
            // If a Facebook page address is provided, store it in a String variable
            final String elementFb = getContext().getResources().getString(currentElement.getElementFbId());
            // Set a click listener of the Facebook TextView
            holder.elementFbTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Create a view Intent
                    Intent fbIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(elementFb));
                    fbIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(fbIntent);
                }
            });
        } else {
            // Otherwise hide the TextView
            holder.elementFbTextView.setVisibility(View.GONE);
        }

        // Return the whole layout containing 2 ImageViews and 6 TextViews so that if can be shown
        // in the CardView List layout
        return convertView;
    }

    /**
     * Create a class {@link ViewHolder} to hold/cache the exact set of views that we need.
     * A {@link ViewHolder} object stores each of the component views inside the tag field of the
     * Layout, so it can immediately be accessed without the need to look them up repeatedly.
     */
    static class ViewHolder {
        // Bind the views
        @BindView(R.id.element_name_text_view)
        TextView elementNameTextView;
        @BindView(R.id.element_desc_text_view)
        TextView elementDescTextView;
        @BindView(R.id.element_logo_view)
        ImageView elementLogoImageView;
        @BindView(R.id.element_image_view)
        ImageView elementPicImageView;
        @BindView(R.id.call_now_action)
        TextView elementPhoneTextView;
        @BindView(R.id.visit_web_action)
        TextView elementWebTextView;
        @BindView(R.id.locate_action)
        TextView elementMapTextView;
        @BindView(R.id.fb_action)
        TextView elementFbTextView;

        ViewHolder(View view) {
            // Pass the view to ButterKnife to bind it
            ButterKnife.bind(this, view);
        }
    }
}