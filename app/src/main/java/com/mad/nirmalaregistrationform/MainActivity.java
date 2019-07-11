package com.mad.nirmalaregistrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,mobile,email,password,conformpassword;
    TextView register;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et1);
        mobile=findViewById(R.id.et2);
        email=findViewById(R.id.et3);
        password=findViewById(R.id.et4);
        conformpassword=findViewById(R.id.et5);
        register=findViewById(R.id.tv1);
        submit=findViewById(R.id.b1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name=name.getText().toString();
                String Mobile=mobile.getText().toString();
                String Email=email.getText().toString();
                String Password=password.getText().toString();
                String Confirmpassword=conformpassword.getText().toString();

                if(Name.isEmpty())
                {
                    name.setError("Empty");
                }
                else
                    if(Mobile.isEmpty())
                    {

                        mobile.setError("Empty");
                    }
                    else
                        if(Email.isEmpty())
                        {
                            email.setError("Empty");
                        }
                        else
                            if(Password.isEmpty()) {
                                password.setError("Empty");
                            }
                            else if(Confirmpassword.isEmpty())
                            {
                                conformpassword.setError("Empty");

                            }
                            else if(Password.equals(Confirmpassword))
                            {
                                Toast.makeText(MainActivity.this,Name+Mobile+Email+Password,Toast.LENGTH_LONG).show();
                            }
                            else
                            {
                                Toast.makeText(MainActivity.this,"passwordmismatch",Toast.LENGTH_LONG).show();
                            }




            }
        });


    }
}
