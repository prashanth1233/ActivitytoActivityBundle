package com.example.prasanth.bundle_example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SendBundleActivity extends Activity{
    public Button show_name;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bundle_);
        show_name=(Button)findViewById(R.id.button1);
        show_name.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                EditText  enter_First_Name=(EditText)findViewById(R.id.text1);
                EditText enter_Last_Name=(EditText)findViewById(R.id.text2);
                String fstName=enter_First_Name.getText().toString();
                String lastName=enter_Last_Name.getText().toString();
                Bundle b=new Bundle();
                b.putString("view_First_Name",fstName);
                b.putString("view_Last_Name",lastName);
                Intent intent=new Intent(SendBundleActivity.this,ReceiveBundleActivity.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
