package der_vogel.foursquareAutoLogin;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class FoursquareAutoLoginActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	private Button HomeLogin;	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        HomeLogin = (Button)findViewById(R.id.HomeLogin);
        HomeLogin.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		new AlertDialog.Builder(this) 
        .setMessage(R.string.error_name_missing)
        .show();
		
	}
}