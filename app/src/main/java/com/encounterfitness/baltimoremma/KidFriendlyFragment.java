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
public class KidFriendlyFragment extends Fragment {


    public KidFriendlyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_list, container, false);

        //create an arraylist and add the Artist and Title
        final ArrayList<GymDetails> gyms = new ArrayList<>();
        gyms.add(new GymDetails("412 Eastern Blvd, Essex, MD 21221", "Baltimore Brazilian Jiu Jitsu"));
        gyms.add(new GymDetails("4130-4132 E Joppa Road, Suite #112 Perry Hall, MD 21236", "GAMA"));
        gyms.add(new GymDetails(R.drawable.amt,"7214 Harford Road Parkville,Maryland 21234", "American Muay Thai"));
        gyms.add(new GymDetails("8101 Pulaski Hwy Baltimore, MD 21237", "Ground Control"));

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
