package com.encounterfitness.baltimoremma;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoxingFragment extends Fragment {


    public BoxingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_list, container, false);

        //create an arraylist and add the Artist and Title
        final ArrayList<GymDetails> gyms = new ArrayList<>();
        gyms.add(new GymDetails(R.drawable.amt, "7214 Harford Road Parkville,Maryland 21234", "American Muay Thai"));
        gyms.add(new GymDetails(R.drawable.baltimoreboxing, "506 ½ South Broadway Baltimore, MD 21231", "Baltimore Boxing"));
        gyms.add(new GymDetails("1901 Pennsylvania Ave. Baltimore, Md.  21217", "Upton Boxing Center"));
        gyms.add(new GymDetails("5000 Wabash Ave. Baltimore, MD 21215", "Uppercut Boxing Gym"));

        GymDetailsAdapter adapter = new GymDetailsAdapter(getActivity(), gyms);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                GymDetails gym = gyms.get(position);
            }

        });
        return rootView;
    }
}