package com.myapplicationdev.android.p07ps_mydatabook;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class VaccinationFragment extends Fragment {

    TextView tvVac;
    Button btnEdit;
    FloatingActionButton btnSearch;
//    ActionBarDrawerToggle toggle;
//    DrawerLayout drawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vaccination, container, false);
        tvVac = view.findViewById(R.id.tvVacc);
        btnEdit = view.findViewById(R.id.btnEdit);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Edit Vaccination");
                builder.setView(inflater.inflate(R.layout.dialog_edit, null)).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Dialog d = (Dialog) dialog;
                        EditText etDialog = d.findViewById(R.id.etDialog);
                        tvVac.setText(etDialog.getText().toString());
                        dialog.dismiss();
                    }
                }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Log.d("dialog", "onClick: cancel");
                        dialog.cancel();
                    }
                });
                builder.create().show();
            }
        });
        return view;
    }
}