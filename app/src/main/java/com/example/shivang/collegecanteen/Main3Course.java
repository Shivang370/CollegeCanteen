package com.example.shivang.collegecanteen;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main3Course extends Activity {

    TextView t,t1,t2,t3,val1,val2,val3;
    Button a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_course);
        Intent ob=getIntent();
        t=(TextView)findViewById(R.id.OrderId);
        t.setPaintFlags(t.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        t.setText("Your Order");
        a=(Button)findViewById(R.id.Home);
        b=(Button)findViewById(R.id.Confirm);
        TakeOrder(ob);
    }
    public void TakeOrder(Intent ob)
    {
        t1=(TextView) findViewById(R.id.od1);
        t2=(TextView) findViewById(R.id.od2);
        t3=(TextView) findViewById(R.id.od3);
        val1=(TextView) findViewById(R.id.val1);
        val2=(TextView) findViewById(R.id.val2);
        val3=(TextView) findViewById(R.id.val3);
        String str1;
        String str2;
        String msg1;
        String msg2;
        String msg3;
        String str3;
        int value=0,d;
        d=ob.getIntExtra("count",0);
        if(d==1)
        {
            msg1=ob.getStringExtra("snacks1");
            str1=ob.getStringExtra("item1");
            t1.setText(str1);
            val1.setText(msg1);
            t2.setText("Total : ");
            val2.setText(msg1);
        }
        if(d==2)
        {
            String a,b;
            int value2,value1;
            msg1=ob.getStringExtra("snacks1");
            msg2=ob.getStringExtra("snacks2");
            str1=ob.getStringExtra("item1");
            str2=ob.getStringExtra("item2");
            t1.setText(str1);
            t2.setText(str2);
            t3.setText("Total : ");
            a=msg1.substring(0,2);
            b=msg2.substring(0,2);
            value1=Integer.parseInt(a);
            value2=Integer.parseInt(b);
            value=value1+value2;
            val1.setText(msg1);
            val2.setText(msg2);
            String con=Integer.toString(value);
            String s1=" Rs.";
            String s2=con+s1;
            val3.setText(s2);

        }
    }
    public void onClick1(View v)
    {
        Intent ob=new Intent(Main3Course.this,MainCourse.class);
        startActivity(ob);
    }
    public void Confirm(View view)
    {
        AlertDialog.Builder build=new AlertDialog.Builder(this);
        build.setTitle("Confirm Order");
        build.setMessage("Placing order with selected items? ");
        build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(i);
            }
        });
        build.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Reselecting items...",Toast.LENGTH_SHORT).show();
            }
        });
        build.show();
    }
}