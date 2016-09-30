package br.android.cericatto.tourguideapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.android.cericatto.tourguideapp.R;
import br.android.cericatto.tourguideapp.adapter.EstablishmentAdapter;
import br.android.cericatto.tourguideapp.data.DataItems;
import br.android.cericatto.tourguideapp.data.Globals;
import br.android.cericatto.tourguideapp.model.Establishment;

/**
 * EstablishmentFragment.java.
 *
 * @author Rodrigo Cericatto
 * @since Sep 30, 2016
 */
public class EstablishmentFragment extends Fragment {

    //--------------------------------------------------
    // Constructor
    //--------------------------------------------------

    public EstablishmentFragment() {}

    public static EstablishmentFragment newInstance(int sectionNumber) {
        EstablishmentFragment fragment = new EstablishmentFragment();
        Bundle args = new Bundle();
        args.putInt(Globals.SECTION_NUMBER_ARGUMENT, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    //--------------------------------------------------
    // Fragment Life Cycle
    //--------------------------------------------------

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.id_fragment_main__recycler_view);
        setRecyclerView(recyclerView);

        return rootView;
    }

    //--------------------------------------------------
    // Methods
    //--------------------------------------------------

    private void setRecyclerView(RecyclerView recyclerView) {
        // Sets recycler view.
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // Sets adapter.
        List<Establishment> list = getEstablishmentList();
        if (list != null && list.size() >= 1) {
            recyclerView.setVisibility(View.VISIBLE);
            EstablishmentAdapter adapter = new EstablishmentAdapter(getActivity(), list);
            recyclerView.setAdapter(adapter);
        }
    }

    private List<Establishment> getEstablishmentList() {
        // Variables.
        List<Establishment> list = new ArrayList<>();
        int sectionNumber = getArguments().getInt(Globals.SECTION_NUMBER_ARGUMENT);
        int firstIndex = Globals.LIMIT * (sectionNumber - 1);
        int lastIndex = firstIndex + Globals.LIMIT - 1;

        // Populates list.
        for (int i = firstIndex; i <= lastIndex; i++) {
            Establishment item = new Establishment(DataItems.IMAGE[i], DataItems.NAME[i],
                DataItems.DESCRIPTION[i], DataItems.NEIGHBORHOOD[i]);
            list.add(item);
        }
        return list;
    }
}