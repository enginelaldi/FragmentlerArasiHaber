package com.enginelaldi.fragmentlerarasihaber;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by EnginElaldi on 10.10.2016.
 */
public class FragmentB extends Fragment {
    TextView sonuc;
    String veri;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b_layout,container,false);

        if (savedInstanceState == null){

        }else{
            veri=savedInstanceState.getString("text");
            TextView text = (TextView) view.findViewById(R.id.tvSonuc);
            text.setText(veri);
        }

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        sonuc = (TextView) getActivity().findViewById(R.id.tvSonuc);


    }

    public void yaziyiDegis(String gelenVeri){
        this.veri = gelenVeri;
        sonuc.setText(veri);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",veri);
    }
}
