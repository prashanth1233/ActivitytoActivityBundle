package com.example.prasanth.bundle_example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiveBundleActivity extends Activity {
    String msg="YOUR NAME IS";
    private TextView fstName;
    private TextView lstName;
    private TextView spclCase;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bundle_activity2_layout);
        fstName=(TextView)findViewById(R.id.t1);
        lstName=(TextView)findViewById(R.id.t2);
        spclCase=(TextView)findViewById(R.id.t3);

        Bundle b1=getIntent().getExtras();
        String show_First_Name,show_First_Name1;
        String show_Last_Name;
        show_First_Name=b1.getString("view_First_Name");
        if(show_First_Name.contains("sai"))
        {
            show_Last_Name="YOUR LAST NAME IS"+b1.get("view_Last_Name");
            show_First_Name="YOUR FIRST NAME IS"+b1.getString("view_First_Name");
            show_First_Name1="HELLO"+b1.getString("view_First_Name")+"SIR";
            spclCase.setText(show_First_Name1);
            fstName.setText(show_First_Name);
            lstName.setText(show_Last_Name);
        }
       else
        {
            show_First_Name="YOUR FIRST NAME IS"+b1.getString("view_First_Name");
            show_Last_Name="YOUR LAST NAME IS"+b1.get("view_Last_Name");
            fstName.setText(show_First_Name);
            lstName.setText(show_Last_Name);
        }

    }

}
