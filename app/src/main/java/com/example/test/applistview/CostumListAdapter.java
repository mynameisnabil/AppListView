package com.example.test.applistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

/**
 * Created by Rido Rianto on 10/11/2018.
 */

public class CostumListAdapter extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;
    public CostumListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam){
        super(context,R.layout.activity_listview , nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_listview, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nametextview);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infotextview);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageViewID);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;

    };
}