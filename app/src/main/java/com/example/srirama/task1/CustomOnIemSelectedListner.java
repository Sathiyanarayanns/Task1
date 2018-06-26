package com.example.srirama.task1;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;


/**
 * Created by srirama on 6/14/2018.
 */

class CustomOnIemSelectedListner implements OnItemSelectedListener {
    @Override
    public void  onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(),"onitem"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
        //Toast.makeText(parent.getContext(),"on item selected :",parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
