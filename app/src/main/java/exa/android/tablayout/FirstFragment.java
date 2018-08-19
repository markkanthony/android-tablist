package exa.android.tablayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class FirstFragment extends Fragment {

    public FirstFragment() {
// Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_first,container,false);
        ListView lv = rootView.findViewById(R.id.listView);
        lv.setAdapter();

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

}
