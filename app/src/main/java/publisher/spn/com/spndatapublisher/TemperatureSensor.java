package publisher.spn.com.spndatapublisher;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.spn.communication.connector.ISPNConnector;
import com.spn.communication.connector.SPNConnector;
import com.spn.communication.data.AbstractSPNDataObject;
import com.spn.communication.data.TemperatureSPNDataObject;

public class TemperatureSensor extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "publisher.spn.com.spndatapublisher.SPNDataPublisher.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_sensor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



         NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker.setMaxValue(100);
        numberPicker.setMaxValue(0);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperature_sensor, menu);
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

    /** Called when the user clicks the Send button
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);

        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);


    }
                                                    */

    public void publishCurrentTemperature(View view){
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
                   ;

        Integer temperature = numberPicker.getValue() ;

        TemperatureSPNDataObject tempObject = new TemperatureSPNDataObject();
        tempObject.setTemperature(temperature);

        ISPNConnector spnConnector = new SPNConnector();

        Integer result = spnConnector.sendObject(tempObject);


        String logMsg = "Sent: Temperature: " +
                temperature + ", id: " + tempObject.getId() +
                " result: " +
                result;

        TextView textView = new TextView(this);
        textView.setTextSize(12);
        textView.setText(logMsg);
        LinearLayout layout = (LinearLayout) findViewById(R.id.spn_log);

        if (layout != null)
            layout.addView(textView);




























    }

}
