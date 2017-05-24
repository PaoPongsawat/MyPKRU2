package pkru.sansak.pongsawat.mypkru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //explicit ประกาศตัวแปร
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial View
        initialView();

        //Controller
        controller();


    } //main method

    private void controller() {

        textView.setOnClickListener(this);
        button.setOnClickListener(this);


    }

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegister);
        button = (Button) findViewById(R.id.btnLogin);

    }


    @Override
    public void onClick(View v) {

        //for Text View

        if (v == textView) {
            //Intent to NewRegister
            Intent intent = new Intent(MainActivity.this,NewRegisterActivity.class);
            startActivity(intent);

        }
        //for Button
        if (v == button) {

        }

    }
}   //main class
