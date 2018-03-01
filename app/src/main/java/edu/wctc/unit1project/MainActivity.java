package edu.wctc.unit1project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    protected TextView morse_out;
    protected Button in_dash;
    protected Button in_dot;
    protected Button in_break;

    protected TextView morse_outTop;
    protected Button in_dashTop;
    protected Button in_dotTop;
    protected Button in_breakTop;

    protected String currentText = "";
    protected String currentTextTop = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        morse_out = (TextView) findViewById(R.id.morse_out);

        in_dash = (Button) findViewById(R.id.in_dash);
        in_dash.setOnClickListener(this);

        in_dot = (Button) findViewById(R.id.in_dot);
        in_dot.setOnClickListener(this);

        in_break = (Button) findViewById(R.id.in_break);
        in_break.setOnClickListener(this);

        morse_outTop = (TextView) findViewById(R.id.morse_outTop);

        in_dashTop = (Button) findViewById(R.id.in_dashTop);
        in_dashTop.setOnClickListener(this);

        in_dotTop = (Button) findViewById(R.id.in_dotTop);
        in_dotTop.setOnClickListener(this);

        in_breakTop = (Button) findViewById(R.id.in_breakTop);
        in_breakTop.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        Character letter;
        Character letterTop;

        Log.println(Log.DEBUG,"BUTTONS" ,"Button pressed: " + view.getId());

        switch(view.getId()) {
            case R.id.in_dash:
                currentText = Coder.addDash(currentText);
                Log.println(Log.DEBUG,"ADDDASH" ,"New value: " + currentText);
                break;
            case R.id.in_dot:
                currentText = Coder.addDot(currentText);
                Log.println(Log.DEBUG,"ADDDOT" ,"New value: " + currentText);
                break;
            case R.id.in_break:
                letter = Coder.addBreak(currentText);
                Log.println(Log.DEBUG,"ADDBREAK" ,"New value: " + currentText);
                Log.println(Log.DEBUG,"RETURNLETTER" ,"Return letter: " + letter);
                morse_out.append(Character.toString(letter));
                currentText = "";
                Log.println(Log.DEBUG,"POSTAPPEND" ,"Post append (SHOULD BE EMPTY): " + currentText);
                break;
            case R.id.in_dashTop:
                currentTextTop = Coder.addDash(currentTextTop);
                break;
            case R.id.in_dotTop:
                currentTextTop = Coder.addDot(currentTextTop);
                break;
            case R.id.in_breakTop:
                letterTop = Coder.addBreak(currentTextTop);
                morse_outTop.append(Character.toString(letterTop));
                currentTextTop = "";
                break;
        }

    }
}
