package com.example.reg_18f11a0567;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.Spinner;
        import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        EditText r,n, c, m,e;


        RadioButton m1,f1;

        TextView textView;

        String gender;

        Spinner branch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        branch = findViewById(R.id.sp);


        textView = findViewById(R.id.tv);
        r=findViewById(R.id.rollnum);

        n = findViewById(R.id.name);
        c = findViewById(R.id.college);
        m = findViewById(R.id.phone);
        e=findViewById(R.id.email);

        m1 = findViewById(R.id.male);

        f1 = findViewById(R.id.female);
    }

    public void getdata(View view) {
        String rollnumber=n.getText().toString();

        String username = n.getText().toString();

        String collegename = c.getText().toString();

        String mobile = m.getText().toString();
        String email=e.getText().toString();


        textView.setText(rollnumber +"\n" + username + "\n" + email + "\n" + collegename + "\n" + mobile + "\n" + gender);


    }
}
