package com.example.shubham.firebaseapp.Form_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.shubham.firebaseapp.R;

public class fragment_form_prefrences extends Fragment {


    View view;
    ViewPager viewPager;
    Button done_btn;

    public fragment_form_prefrences() {

    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_from_preferences , container , false);

        done_btn = view.findViewById(R.id.form_preferences_doneBTN);

        Spinner spin_category = view.findViewById(R.id.job_caetgories);
        Spinner spin_job_1 = view.findViewById(R.id.job_prefer_1);
        Spinner spin_job_2 = view.findViewById(R.id.job_prefer_2);
        Spinner spin_job_3 = view.findViewById(R.id.job_prefer_3);


        String[] categories = {"chooose here","Accounting Jobs" ,"Interior Design Jobs" ,"Bank Jobs" ,"Content Writing Jobs" ,"Consultant Jobs" ,"Engineering Jobs" ,"Export Import Jobs" ,"Merchandiser Jobs" ,"Security Jobs" ,"HR Jobs" ,"Hotel Jobs" ,"Application Programming Jobs" ,"Client Server Jobs", "DBA Jobs" ,"Ecommerce Jobs", "ERP Jobs", "VLSI Jobs" ,"Mainframe Jobs", "Middleware Jobs" ,"Mobile Jobs", "Network administrator Jobs" ,"IT Jobs" ,"Testing Jobs System", "Programming Jobs" ,"EDP Jobs Telecom" ,"Software Jobs", "Telecom Jobs", "BPO Jobs" ,"Legal Jobs" ,"Marketing Jobs" ,"Packaging Jobs" ,"Pharma Jobs" ,"Maintenance Jobs", "Logistics Jobs" ,"Sales Jobs" ,"Secretary Jobs"};
        ArrayAdapter<String> adapter_categories = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item,categories);
        adapter_categories.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spin_category.setAdapter(adapter_categories);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.Jobs_preferences_array));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spin_job_1.setAdapter(adapter);
        spin_job_2.setAdapter(adapter);
        spin_job_3.setAdapter(adapter);

        // setting up location prefrences


        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(),"success" , Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
