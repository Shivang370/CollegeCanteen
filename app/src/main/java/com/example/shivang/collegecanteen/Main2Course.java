package com.example.shivang.collegecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Course extends AppCompatActivity {

    CheckBox s1,s2,s3,s4,so1,so2,so3,so4,n1,n2,n3,n4,d1,d2,d3,d4;
    TextView tS1,tS2,tS4,tN1,tN2,tN3,tN4,tSo1,tSo2,tSo3,tSo4,tD1,tD2,tD3,tD4,tS3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_course);
        Intent ob=getIntent();
        s1=(CheckBox)findViewById(R.id.Snacks1);
        s2=(CheckBox)findViewById(R.id.Snacks2);
        s3=(CheckBox)findViewById(R.id.Snacks3);
        s4=(CheckBox)findViewById(R.id.Snacks4);
        n1=(CheckBox)findViewById(R.id.North1);
        n2=(CheckBox)findViewById(R.id.North2);
        n3=(CheckBox)findViewById(R.id.North3);
        n4=(CheckBox)findViewById(R.id.North4);
        so1=(CheckBox)findViewById(R.id.South1);
        so2=(CheckBox)findViewById(R.id.South2);
        so3=(CheckBox)findViewById(R.id.South3);
        so4=(CheckBox)findViewById(R.id.South4);
        d1=(CheckBox)findViewById(R.id.Drinks1);
        d2=(CheckBox)findViewById(R.id.Drinks2);
        d3=(CheckBox)findViewById(R.id.Drinks3);
        d4=(CheckBox)findViewById(R.id.Drinks4);
        tS1=(TextView)findViewById(R.id.S1);
        tS2=(TextView)findViewById(R.id.S2);
        tS3=(TextView)findViewById(R.id.S3);
        tS4=(TextView)findViewById(R.id.S4);
        tN1=(TextView)findViewById(R.id.N1);
        tN2=(TextView)findViewById(R.id.N2);
        tN3=(TextView)findViewById(R.id.N3);
        tN4=(TextView)findViewById(R.id.N4);
        tSo1=(TextView)findViewById(R.id.SO1);
        tSo2=(TextView)findViewById(R.id.SO2);
        tSo3 =(TextView)findViewById(R.id.SO3);
        tSo4=(TextView)findViewById(R.id.SO4);
        tD1=(TextView)findViewById(R.id.D1);
        tD2=(TextView)findViewById(R.id.D2);
        tD3=(TextView)findViewById(R.id.D3);
        tD4=(TextView)findViewById(R.id.D4);
    }
    public void onclickbtn(View v)
    {
        String str1;
        String str2;
        String str3;
        String v1;
        String v2;
        String v3;
        int c;
        Intent ob=new Intent(this,Main3Course.class);
        if(s1.isChecked() || s2.isChecked() || s3.isChecked() || s4.isChecked())
        {
            if(s1.isChecked())
            {
                str1=tS1.getText().toString();
                ob.putExtra("item1","Samosa");
                ob.putExtra("snacks1",str1);
                if(s2.isChecked())
                {
                    c=2;
                    str2=tS2.getText().toString();
                    ob.putExtra("item2","Sandwich");
                    ob.putExtra("snacks2",str2);
                    if(s3.isChecked() || s4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() ||
                            d4.isChecked() ||n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        startActivity(ob);
                    }
                }
                else if(s3.isChecked())
                {
                    c=2;
                    str2=tS3.getText().toString();
                    ob.putExtra("item2","Patties");
                    ob.putExtra("snacks2",str2);
                    if(s2.isChecked()|| s4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() ||
                            d4.isChecked() ||n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        startActivity(ob);
                    }
                }
                else if(s4.isChecked())
                {
                    c=2;
                    str2=tS4.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Bread Roll");
                    ob.putExtra("snacks2",str2);
                    if(s2.isChecked() || s3.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() ||
                            d4.isChecked() || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        startActivity(ob);
                    }
                }
                 else if(d1.isChecked())
                    {
                        c=2;
                        str2=tD1.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Hot Coffee");
                        ob.putExtra("snacks2",str2);
                        if(s4.isChecked() || s2.isChecked() || s3.isChecked() ||d2.isChecked() || d3.isChecked() ||
                                d4.isChecked() || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);

                    }
                    else if(d2.isChecked())
                    {
                        c=2;
                        str2=tD2.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Tea");
                        ob.putExtra("snacks2",str2);
                        if(s2.isChecked() || s3.isChecked() || s4.isChecked() ||d1.isChecked() || d3.isChecked()
                                || d4.isChecked() ||n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d3.isChecked())
                    {
                        c=2;
                        str2=tD3.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Cold Coffee");
                        ob.putExtra("snacks2",str2);
                        if(d1.isChecked() || d2.isChecked() || d4.isChecked() || n1.isChecked() ||
                                n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d4.isChecked())
                    {
                        c=2;
                        str2=tD4.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Cold Drink");
                        ob.putExtra("snacks2",str2);
                        if(s4.isChecked() || s2.isChecked() || s3.isChecked() || d1.isChecked() || d3.isChecked() || d2.isChecked() ||n1.isChecked() || n2.isChecked() ||
                                n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                else if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "Snacks are only available with Drinks ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    c=1;
                    ob.putExtra("count",c);
                    startActivity(ob);
                }
            }
            else if(s2.isChecked())
            {
                str1=tS2.getText().toString();
                ob.putExtra("item1","Sandwich");
                ob.putExtra("snacks1",str1);
                if(s3.isChecked())
                {
                    c=2;
                    str2=tS3.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Patties");
                    ob.putExtra("snacks2",str2);
                    if(s1.isChecked() || s4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked()
                            || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                        startActivity(ob);
                }
                else if(s4.isChecked())
                {
                    c=2;
                    str2=tS4.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Bread Roll");
                    ob.putExtra("snacks2",str2);
                    if(s1.isChecked() || s3.isChecked() ||  d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked()
                            || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                        startActivity(ob);
                }
                else if(d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked())
                {
                    if(d1.isChecked())
                    {
                        c=2;
                        str2=tD1.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Hot Coffee");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s4.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked()
                                || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d2.isChecked())
                    {
                        c=2;
                        str2=tD2.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Tea");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s4.isChecked() || d1.isChecked() || d3.isChecked() || d4.isChecked()
                                || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d3.isChecked())
                    {
                        c=2;
                        str2=tD3.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Cold Coffee");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s4.isChecked() || d1.isChecked() || d2.isChecked()  || d4.isChecked()
                                || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d4.isChecked())
                    {
                        c=2;
                        str2=tD4.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Cold Drink");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()
                                || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                }
                else if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "Snacks are only available with Drinks ", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        c=1;
                        ob.putExtra("count",c);
                        startActivity(ob);
                    }
            }
            else if(s3.isChecked())
            {
                str1=tS3.getText().toString();
                ob.putExtra("item1","Patties");
                ob.putExtra("snacks1",str1);
                if(s4.isChecked())
                {
                    c=2;
                    str2=tS4.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Bread Roll");
                    ob.putExtra("snacks2",str2);
                    if(s1.isChecked() || s2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked()
                            || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                        startActivity(ob);
                }
                else if(d1.isChecked())
                {
                    c=2;
                    str2=tD1.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Hot Coffee");
                    ob.putExtra("snacks2",str2);
                    if(s1.isChecked() || s4.isChecked() || s2.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked()
                            || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                        startActivity(ob);
                }
                else if(d2.isChecked())
                {
                    c=2;
                    str2=tD2.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Tea");
                    ob.putExtra("snacks2",str2);
                    if(s1.isChecked() || s4.isChecked() || s2.isChecked() || d1.isChecked() || d3.isChecked() || d4.isChecked()
                            || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                        startActivity(ob);
                }
                else if(d3.isChecked())
                {
                    c=2;
                    str2=tD3.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Cold Coffee");
                    ob.putExtra("snacks2",str2);
                    if(s1.isChecked() || s4.isChecked() || s2.isChecked() || d1.isChecked() || d2.isChecked() || d4.isChecked()
                            || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                        startActivity(ob);
                }
                else if(d4.isChecked())
                {
                    c=2;
                    str2=tD4.getText().toString();
                    ob.putExtra("count",c);
                    ob.putExtra("item2","Cold Drink");
                    ob.putExtra("snacks2",str2);
                    if(s1.isChecked() || s4.isChecked() || s2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() ||
                            n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                    {
                        Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                    }
                    else
                        startActivity(ob);
                }
                else if (n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() ||
                        so1.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "Snacks are only available with drinks", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    c=1;
                    ob.putExtra("count",c);
                    startActivity(ob);
                }
            }
            else if(s4.isChecked())
            {
                str1=tS4.getText().toString();
                ob.putExtra("snacks1",str1);
                ob.putExtra("item1","Bread Roll");
                if(d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked())
                {
                    if(d1.isChecked())
                    {
                        c=2;
                        str2=tD1.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Hot Coffee");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s2.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked()
                                || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d2.isChecked())
                    {
                        c=2;
                        str2=tD2.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Tea");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s2.isChecked() || d1.isChecked() || d3.isChecked() || d4.isChecked()
                                || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d3.isChecked())
                    {
                        c=2;
                        str2=tD3.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Cold Coffee");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s2.isChecked() || d1.isChecked() || d2.isChecked() || d4.isChecked()
                                || n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                    else if(d4.isChecked())
                    {
                        c=2;
                        str2=tD4.getText().toString();
                        ob.putExtra("count",c);
                        ob.putExtra("item2","Cold Drink");
                        ob.putExtra("snacks2",str2);
                        if(s1.isChecked() || s3.isChecked() || s2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() ||
                                n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                        {
                            Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                        }
                        else
                            startActivity(ob);
                    }
                }
                else if (n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() ||
                        so1.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "Snacks are only available with drinks", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    c=1;
                    ob.putExtra("count",c);
                    startActivity(ob);
                }
            }
        }
        else if(n1.isChecked())
        {
            str1=tN1.getText().toString();
            ob.putExtra("item1","Chili Potato");
            ob.putExtra("snacks1",str1);
            if(n2.isChecked())
            {
                c=2;
                str2=tN2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Pav bhaji");
                ob.putExtra("snacks2",str2);
                if(n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(n3.isChecked())
            {
                c=2;
                str2=tN3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Aloo Paratha");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(n4.isChecked())
            {
                c=2;
                str2=tN4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Fried Rice");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so1.isChecked())
            {
                c=2;
                str2=tSo1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Idli Dosa");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() ||
                        so2.isChecked() || so3.isChecked() || so4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so2.isChecked())
            {
                c=2;
                str2=tSo2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Upma");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so3.isChecked() || so4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so3.isChecked())
            {
                c=2;
                str2=tSo3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Uttapam");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() || so4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()|| d4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so4.isChecked())
            {
                c=2;
                str2=tSo4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Sambar vada");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||
                        so3.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||
                        so3.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||
                        so3.isChecked() || d1.isChecked() || d3.isChecked() || d4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||
                        so3.isChecked() || d1.isChecked() || d2.isChecked() || d4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || so2.isChecked() ||
                        so3.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(n2.isChecked())
        {
            str1=tN2.getText().toString();
            ob.putExtra("item1","Pav bhaji");
            ob.putExtra("snacks1",str1);
            if(n3.isChecked())
            {
                c=2;
                str2=tN3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Aloo Paratha");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(n4.isChecked())
            {
                c=2;
                str2=tN4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Fried Rice");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);            }
            else if(so1.isChecked())
            {
                c=2;
                str2=tSo1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Idli Dosa");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);

            }
            else if(so2.isChecked())
            {
                c=2;
                str2=tSo2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Upma");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so1.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so3.isChecked())
            {
                c=2;
                str2=tSo3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Uttapam");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so2.isChecked() || so1.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so4.isChecked())
            {
                c=2;
                str2=tSo4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Sambar vada");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so2.isChecked() || so3.isChecked() || so1.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks1",str1);
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d2.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d2.isChecked() || d1.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n3.isChecked() || n4.isChecked() || d2.isChecked() || d3.isChecked()
                        || d1.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(n3.isChecked())
        {
            str1=tN3.getText().toString();
            ob.putExtra("item1","Aloo Paratha");
            ob.putExtra("snacks1",str1);
            if(n4.isChecked())
            {
                c=2;
                str2=tN4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Fried Rice");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so1.isChecked())
            {
                c=2;
                str2=tSo1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Idli Dosa");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()
                        || d4.isChecked() || n4.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so2.isChecked())
            {
                c=2;
                str2=tSo2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Upma");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  n4.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);            }
            else if(so3.isChecked())
            {
                c=2;
                str2=tSo3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Uttapam");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || n4.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so4.isChecked())
            {
                c=2;
                str2=tSo4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Sambar vada");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || n4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n4.isChecked() || d2.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || n4.isChecked() || d3.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || d2.isChecked() || n4.isChecked()
                        || d4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || d1.isChecked() || d2.isChecked() || d3.isChecked()
                        || n4.isChecked() || so1.isChecked() ||  so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(n4.isChecked())
        {
            str1=tN4.getText().toString();
            ob.putExtra("item1","Fried Rice");
            ob.putExtra("snacks1",str1);
            if(so1.isChecked())
            {
                c=2;
                str2=tSo1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Idli Dosa");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so2.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so2.isChecked())
            {
                c=2;
                str2=tSo2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Upma");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so1.isChecked() || so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so3.isChecked())
            {
                c=2;
                str2=tSo3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Uttapam");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so4.isChecked())
            {
                c=2;
                str2=tSo4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Sambar vada");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() || so3.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d2.isChecked() || so4.isChecked() ||
                        d3.isChecked() || d4.isChecked() || so1.isChecked() || so2.isChecked() ||so3.isChecked() ||  so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);       }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d1.isChecked() || d3.isChecked() ||
                        d4.isChecked() || so1.isChecked() || so3.isChecked() || so2.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() || d4.isChecked()
                        || so3.isChecked() || so1.isChecked() || so2.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || d1.isChecked() || d2.isChecked() ||
                        d3.isChecked() || so3.isChecked() || so1.isChecked() || so2.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(so1.isChecked())
        {
            str1=tSo1.getText().toString();
            ob.putExtra("item1","Idli Dosa");
            ob.putExtra("snacks1",str1);
            if(so2.isChecked())
            {
                c=2;
                str2=tSo2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Upma");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so3.isChecked())
            {
                c=2;
                str2=tSo3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Uttapam");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so2.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so4.isChecked())
            {
                c=2;
                str2=tSo4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Sambar vada");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so2.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || so2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || so2.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || so2.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(so2.isChecked())
        {
            str1=tSo2.getText().toString();
            ob.putExtra("item1","Upma");
            ob.putExtra("snacks1",str1);
            if(so3.isChecked())
            {
                c=2;
                str2=tSo3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Uttapam");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so1.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(so4.isChecked())
            {
                c=2;
                str2=tSo4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Sambar vada");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so3.isChecked() || so1.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so1.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || so1.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || so1.isChecked() || d4.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || so1.isChecked() || so1.isChecked() ||  so3.isChecked() || so4.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(so3.isChecked())
        {
            str1=tSo1.getText().toString();
            ob.putExtra("item1","Uttapam");
            ob.putExtra("snacks1",str1);
            if(so4.isChecked())
            {
                c=2;
                str2=tSo2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Sambar vada");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so4.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || so4.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || so4.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || so4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(so4.isChecked())
        {
            str1=tSo4.getText().toString();
            ob.putExtra("item1","Sambar vada");
            ob.putExtra("snacks1",str1);
            if(d1.isChecked())
            {
                c=2;
                str2=tD1.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Hot Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so3.isChecked() || d2.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || so3.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || so3.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || d1.isChecked() || d2.isChecked()
                        || d3.isChecked() || so3.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(d1.isChecked())
        {
            str1=tD1.getText().toString();
            ob.putExtra("item1","Hot Coffee");
            ob.putExtra("snacks1",str1);
            if(d2.isChecked())
            {
                c=2;
                str2=tD2.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Tea");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so3.isChecked() || so4.isChecked()
                        || d3.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so3.isChecked() || so4.isChecked()
                        || d2.isChecked() || d4.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so3.isChecked() || so4.isChecked()
                        || d3.isChecked() || d2.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(d2.isChecked())
        {
            str1=tD2.getText().toString();
            ob.putExtra("item1","Tea");
            ob.putExtra("snacks1",str1);
            if(d3.isChecked())
            {
                c=2;
                str2=tD3.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Coffee");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so3.isChecked() || so4.isChecked()
                        || d3.isChecked() || d1.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so3.isChecked() || so4.isChecked()
                        || d4.isChecked() || d1.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(d3.isChecked())
        {
            str1=tD3.getText().toString();
            ob.putExtra("item1","Cold Coffee");
            ob.putExtra("snacks1",str1);
            if(d4.isChecked())
            {
                c=2;
                str2=tD4.getText().toString();
                ob.putExtra("count",c);
                ob.putExtra("item2","Cold Drink");
                ob.putExtra("snacks2",str2);
                if(n1.isChecked() || n2.isChecked() || n3.isChecked() || n4.isChecked() || so3.isChecked() || so4.isChecked()
                        || d1.isChecked() || d2.isChecked() ||  so1.isChecked() || so2.isChecked())
                {
                    Toast.makeText(Main2Course.this, "At most 2 items can be selected ", Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(ob);
            }
            else
            {
                c=1;
                ob.putExtra("count",c);
                startActivity(ob);
            }
        }
        else if(d4.isChecked())
        {
            c=1;
            str1=tD4.getText().toString();
            ob.putExtra("count",c);
            ob.putExtra("item1","Cold Drink");
            ob.putExtra("snacks1",str1);
            startActivity(ob);
        }
        else
        {
            Toast.makeText(Main2Course.this, "Select at least one item ", Toast.LENGTH_SHORT).show();
        }

    }

}
