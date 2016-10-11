package com.enginelaldi.fragmentlerarasihaber;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by EnginElaldi on 10.10.2016.
 */
public class FragmentA extends Fragment implements View.OnClickListener{

    Communicator comm;
    Button benitikla;
    int counter = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (savedInstanceState == null){
            counter =0;
        }else{
            counter = savedInstanceState.getInt("counter",0);
        }

        return inflater.inflate(R.layout.fragment_a_layout,container,false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        benitikla= (Button) getActivity().findViewById(R.id.bBeniTikla);
        benitikla.setOnClickListener(this);
        comm = (Communicator) getActivity();

    }
    //burada bir yorum var
    //bi yorum daha
    //enginnnn

    @Override
    public void onClick(View view) {

        counter++;
        comm.respond("Butona "+ counter +" kere basıldı.");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }
}
