package com.example.srirama.task1;

import android.annotation.SuppressLint;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    TextView name, gender, degree, answer;
    RadioGroup radiogroup;
    RadioButton rb;
    CheckBox cb1, cb2, cb3, cb4;
      Spinner spin;
    Button form;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.eteditname);
        name = (TextView) findViewById(R.id.tvusername);
        gender = (TextView) findViewById(R.id.tvgender);
        form=(Button)findViewById(R.id.btnform);
        degree = (TextView) findViewById(R.id.tvdegree);
        answer = (TextView) findViewById(R.id.tvanswer);
        radiogroup = (RadioGroup) findViewById(R.id.rg);
        cb1 = (CheckBox) findViewById(R.id.cbjava);
        cb2 = (CheckBox) findViewById(R.id.cbc);
        spin=(Spinner)findViewById(R.id.spindegree);
        cb3 = (CheckBox) findViewById(R.id.cbcsharp);
        cb4 = (CheckBox) findViewById(R.id.cbandroid);
          addlistneronspinneritemselected();
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(spin.getSelectedItem());
                String course ="";
                if(cb1.isChecked())
                    course += "\n"+cb1.getText();
                if(cb2.isChecked())
                    course +="\n"+cb2.getText();
                if(cb3.isChecked())
                    course +="\n"+cb3.getText();
                if(cb4.isChecked())
                    course+="\n"+cb4.getText();
 answer.setText(username.getText() + "\n" + rb.getText() + "\n" + s + "\n" + course);
                }
        });
    }
    public void rbclick(View view) {
        int rbi= radiogroup.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(rbi);
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
    }
    public void addlistneronspinneritemselected(){
        spin.setOnItemSelectedListener(new CustomOnIemSelectedListner());
    }
}