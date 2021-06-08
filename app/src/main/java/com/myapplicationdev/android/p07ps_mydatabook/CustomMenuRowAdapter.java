package com.myapplicationdev.android.p07ps_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomMenuRowAdapter extends ArrayAdapter<NavigationItem> {

    private ArrayList<NavigationItem> IconList;
    private Context context;
    private int resource;

    public CustomMenuRowAdapter(Context context, int resource, ArrayList<NavigationItem> objects) {
        super(context, resource, objects);
                this.context = context;
                this.resource = resource;
                this.IconList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(resource, parent, false);

        NavigationItem NavigationItems = IconList.get(position);

        TextView tvDisplay;
        ImageView ivDisplay;

        tvDisplay = view.findViewById(R.id.menu_title);
        ivDisplay = view.findViewById(R.id.icon_image);

        tvDisplay.setText(NavigationItems.getMenuChoice());
        ivDisplay.setImageDrawable(NavigationItems.getMenuImage());

        return view;
    }
}
