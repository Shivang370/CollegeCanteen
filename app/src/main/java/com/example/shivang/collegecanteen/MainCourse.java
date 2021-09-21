package com.example.shivang.collegecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.shivang.collegecanteen.Main2Course;

public class MainCourse extends AppCompatActivity {

    Button b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);
        b=(Button)findViewById(R.id.Review);
        c=(Button)findViewById(R.id.menu);
    }
    public void onClick(View v)
    {
        RadioGroup rg=findViewById(R.id.radiogroup);
        int id=rg.getCheckedRadioButtonId();
        Intent a=new Intent(MainCourse.this,Main3Course.class);
        switch(id)
        {
            case R.id.Chole :a.putExtra("count",1);
                             a.putExtra("item1","Chole Bhature");
                             a.putExtra("snacks1","40 Rs.");
                             startActivity(a);
                            break;
            case R.id.poha :a.putExtra("item1","Poha");
                            a.putExtra("snacks1","30 Rs.");
                            a.putExtra("count",1);
                            startActivity(a);
                            break;
            case R.id.kachori :a.putExtra("item1","Kachori");
                            a.putExtra("snacks1","60 Rs.");
                            a.putExtra("count",1);
                            startActivity(a);
                            break;
            case R.id.Gulab :a.putExtra("item1","Gulabjamun");
                            a.putExtra("snacks1","40 Rs.");
                            a.putExtra("count",1);
                            startActivity(a);
                            break;
            default:
                Toast.makeText(MainCourse.this, "Please Select one special item", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick2(View v)
    {
        RadioGroup rg=findViewById(R.id.radiogroup);
        int id=rg.getCheckedRadioButtonId();
        if(id==R.id.Chole || id==R.id.poha || id==R.id.kachori || id==R.id.Gulab)
        {
            Toast.makeText(MainCourse.this, "Special item(s) is to be ordered separately", Toast.LENGTH_SHORT).show();
        }
        else
            {
                Intent i=new Intent(MainCourse.this, Main2Course.class);
                startActivity(i);
        }
    }
}
