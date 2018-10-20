package com.example.vimukthi.customlistviewwithbutton;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String>{
    Context context;
    ImageButton btnList;
    TextView txtList;
    List<String> listValues;

    public CustomAdapter(@NonNull Context context, int resource, List<String> listValues) {
        super(context, resource, listValues);
        this.context = context;
        this.listValues = listValues;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final String currentItems=listValues.get(position);
        LayoutInflater layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= layoutInflater.inflate(R.layout.custom,null);

        txtList =(TextView)convertView.findViewById(R.id.txtCustom);
        txtList.setText(currentItems);
        btnList = (ImageButton)convertView.findViewById(R.id.btnList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"you click the button",Toast.LENGTH_SHORT).show();
            }
        });







        return convertView;
    }
}
