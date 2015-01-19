package th.ac.tu.siit.cholwich.lab1exercise2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }







    public void convert(View v) {
        EditText etInput = (EditText)findViewById(R.id.etInput);
        String s = etInput.getText().toString();
        Double input = Double.parseDouble(s);
        Double temp = 0.0;
        RadioGroup rgFrom = (RadioGroup) findViewById(R.id.rgFrom);
        RadioGroup rgTo = (RadioGroup) findViewById(R.id.rgTo);

        int selFrom = rgFrom.getCheckedRadioButtonId();
        int selTo = rgTo.getCheckedRadioButtonId();

        if (selFrom == R.id.rbFrmC) {
            temp = input;
        } else if(selFrom == R.id.rbFrmF) {
            temp = (input - 32) * 5 / 9;
        } else if (selFrom == R.id.rbFrmK) {
            temp = input-273.15;
        }

        if (selTo == R.id.rbToC) {

        } else if (selTo == R.id.rbToF){
            temp = temp *9 /5 +32;
        } else if (selTo == R.id.rbToK){
            temp = temp +273.15;
        }
          /**

            if(selTo == R.id.rbToC){

            } else if (selTo == R.id.rbToF) {
                // Celcius *9 /5 +32
                in = in*9/5+32;
            } else if (selTo == R.id.rbToK){
                in = in+273.15;
            }
        } else if (selFrom == R.id.rbFrmF) {
            if(selTo == R.id.rbToC){
                in = (in - 32)*5/9;
            } else if (selTo == R.id.rbToF) {

            } else if (selTo == R.id.rbToK){
                in = (in + 459.67) *5 /9;
            }
        } else if (selFrom == R.id.rbFrmK) {
            if(selTo == R.id.rbToC){

            } else if (selTo == R.id.rbToF) {
                in= in *9/5 -459.67;
            } else if (selTo == R.id.rbToK){

            }
        }

       */

        TextView tvOutput;
        tvOutput = (TextView) findViewById(R.id.tvOutput);
        tvOutput.setText(Double.toString(temp));
    }
}
