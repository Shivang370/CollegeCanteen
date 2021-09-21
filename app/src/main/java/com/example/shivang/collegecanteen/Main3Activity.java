package com.example.shivang.collegecanteen;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.internal.NavigationMenu;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import io.github.yavski.fabspeeddial.FabSpeedDial;

import static android.content.Intent.ACTION_DIAL;

public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp;
    ImageView v;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t = (TextView) findViewById(R.id.Contact);
        //a = (Button) findViewById(R.id.Dial);
        //b=(Button)findViewById(R.id.exit);
        sp = (Spinner) findViewById(R.id.spinner);
        v = (ImageView) findViewById(R.id.stars);
        sp.setOnItemSelectedListener(this);
        FloatingActionButton floatingActionButton=(FloatingActionButton)findViewById(R.id.FloatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] TO={"shivangtripathi370@gmail.com"};
                Intent mail=new Intent(android.content.Intent.ACTION_SEND);
                mail.setType("plain/text");
               // mail.setData(Uri.parse("mailto:"));
                mail.putExtra(Intent.EXTRA_EMAIL,TO);
                mail.putExtra(Intent.EXTRA_BCC,"shivangtripathi370@gmail.com");
                mail.putExtra(Intent.EXTRA_SUBJECT,"Feedback/Suggestion :");
                startActivity(mail);

            }
        });
        FloatingActionButton floatingActionButton2=(FloatingActionButton)findViewById(R.id.floatingActionButton2);
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = t.getText().toString().trim();
                Intent ob4 = new Intent(Intent.ACTION_CALL);
                ob4.setData(Uri.parse("tel:" + s));
                if (ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(ob4);
            }
        });
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(((TextView)view).getText().toString().trim().equals(" "))
        {
            v.setImageResource(R.drawable.zerostar);
            Toast.makeText(this,"Ratings not given",Toast.LENGTH_LONG).show();
        }
        if(((TextView)view).getText().toString().trim().equals("Good"))
        {
            v.setImageResource(R.drawable.good);
            Toast.makeText(this,"Food was good",Toast.LENGTH_LONG).show();
        }
        if(((TextView)view).getText().toString().trim().equals("Average"))
        {
            v.setImageResource(R.drawable.average);
            Toast.makeText(this,"Food was average",Toast.LENGTH_LONG).show();
        }

        if(((TextView)view).getText().toString().trim().equals("Awesome"))
        {
            v.setImageResource(R.drawable.awesome);
            Toast.makeText(this,"Food was awesome",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
