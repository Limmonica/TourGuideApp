package com.example.limmonica.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    // Use Unbinder to unbind the view in onDestroyView()
    Unbinder unbinder;

    // Bind the listView
    @BindView(R.id.recycler_view)
    ListView listView;

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout
        View rootView = inflater.inflate(R.layout.element_list, container, false);

        // Bind view using butter knife
        unbinder = ButterKnife.bind(this, rootView);

        // Create a new adapter
        ElementAdapter adapter = new ElementAdapter(getActivity(), DATA.getINSTANCE().getEvents());

        // Set the adapter on the listView
        listView.setAdapter(adapter);

        // Return the layout
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // unbind the view to free some memory
        unbinder.unbind();
    }
}
