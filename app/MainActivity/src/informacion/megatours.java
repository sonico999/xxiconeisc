package informacion;

import android.content.res.Configuration;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;
import com.ever.conesic.R;
public class megatours extends SherlockActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sherlock_Light_DarkActionBar);
        getSupportActionBar().setTitle("MegaTours");
    }
    
    protected void onResume() {
		// TODO Auto-generated method stub
		FadingActionBarHelper helper = new FadingActionBarHelper()
				.actionBarBackground(R.drawable.ab_background_light)
				.headerLayout(R.layout.header_light)
				.contentLayout(R.layout.megatours);
		setContentView(helper.createView(this));
		helper.initActionBar(this);
		super.onResume();

	}
    @Override
	public void onConfigurationChanged(Configuration newConfig) {
	    super.onConfigurationChanged(newConfig);
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getSupportMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
}
