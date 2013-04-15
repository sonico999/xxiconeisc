package aerea;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.ShareActionProvider;
import com.ever.mapas.mapa;

import br.com.dina.ui.model.BasicItem;
import br.com.dina.ui.widget.UITableView;
import br.com.dina.ui.widget.UITableView.ClickListener;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import utiles.paginaweb;
import br.com.dina.ui.widget.UIButton;
import com.ever.conesic.R;

public class taca extends SherlockActivity {
	UITableView tableView;
	UIButton mButton1;
	Intent intent;
	paginaweb pagina ;
	private static final String SHARED_FILE_NAME = "shared.png";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setTheme(R.style.Theme_Sherlock_Light);
		getSupportActionBar().setIcon(R.drawable.taca);
		getSupportActionBar().setTitle("Taca Peru");
		setContentView(R.layout.taca);
		
		mButton1 = (UIButton) findViewById(R.id.myButton1);
		
		UIButton.setTitle("Taca Peru");
		UIButton.setSubTitle("Aerolinea del Per�");
		UIButton.setImage(R.drawable.tacatitle);

		//mButton3 = (UIButton) findViewById(R.id.myButton3);*/
		tableView = (UITableView) findViewById(R.id.tableView);        
	    createList();
	    tableView.commit();

		/*mButton2.addClickListener(listener);
		mButton3.addClickListener(listener);*/
	    //setContentView(R.layout.text);
        //((TextView)findViewById(R.id.text)).setText("La Mejor Aerolinea del Peru - Taca");
        copyPrivateRawResuorceToPubliclyAccessibleFile();

	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate your menu.
        getSupportMenuInflater().inflate(R.menu.share_action_provider, menu);

        // Set file with share history to the provider and set the share intent.
        MenuItem actionItem = menu.findItem(R.id.menu_item_share_action_provider_action_bar);
        ShareActionProvider actionProvider = (ShareActionProvider) actionItem.getActionProvider();
        actionProvider.setShareHistoryFileName(ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
        actionProvider.setShareIntent(createShareIntent());
        return true;
    }
    
    private Intent createShareIntent() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        Uri uri = Uri.fromFile(getFileStreamPath("shared.png"));
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        return shareIntent;
    }
    
   
	private void copyPrivateRawResuorceToPubliclyAccessibleFile() {
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = getResources().openRawResource(R.drawable.taca);
            outputStream = openFileOutput(SHARED_FILE_NAME,
                    Context.MODE_WORLD_READABLE | Context.MODE_APPEND);
            byte[] buffer = new byte[1024];
            int length = 0;
            try {
                while ((length = inputStream.read(buffer)) > 0){
                    outputStream.write(buffer, 0, length);
                }
            } catch (IOException ioe) {
                /* ignore */
            }
        } catch (FileNotFoundException fnfe) {
            /* ignore */
        } finally {
            try {
                inputStream.close();
            } catch (IOException ioe) {
               /* ignore */
            }
            try {
                outputStream.close();
            } catch (IOException ioe) {
               /* ignore */
            }
        }
    }
    private void createList() {
    	CustomClickListener listener = new CustomClickListener();
    	tableView.setClickListener(listener);
    	tableView.addBasicItem(R.drawable.ubicacion,"Ubicaci�n", "Mapa");
    	tableView.addBasicItem(new BasicItem(R.drawable.celular,"Telefeno", "9428954114 - #245215"));
    	tableView.addBasicItem(R.drawable.firefox,"Pagina Web", "http://www.taca.com/");
    	tableView.addBasicItem(R.drawable.facebook,"Facebook", "https://www.facebook.com/tacaairlines");
    	tableView.addBasicItem(R.drawable.twitter,"Twitter", "@tacaperu");
    	tableView.addBasicItem(R.drawable.google,"Google+", "Taca Peru");
    	tableView.addBasicItem(R.drawable.email,"Correo", "support@taca.com.pe");
    	//tableView.addBasicItem("Costos", "");
    	/*tableView.addBasicItem(R.drawable.piedra,"Example 4 - UITableView", "only one item");
    	tableView.addBasicItem("Example 5 - UITableViewActivity", "a sample activity");
    	tableView.addBasicItem("Example 6 - UITableViewActivity temp", "item with custom view");
    	tableView.addBasicItem("Example 7 - UIButton", "some floating buttons");
    	tableView.addBasicItem("Example 8 - Clear List", "this button will clear the list");*/
    	
    }
    
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Log.d("MainActivity", "item clicked: " + index);
			if(index == 0) {
				Intent i = new Intent(taca.this, mapa.class);
				startActivity(i);
				Toast.makeText(taca.this, ""+index, Toast.LENGTH_LONG).show();
			}
			else if(index == 1) {
								
			}
			else if(index == 2) {
				pagina = new paginaweb();
				pagina.paginaWeb(taca.this, "http://www.taca.com/");		
			}
			else if(index == 3) {
								
			}
			else if(index == 4) {
								
			}
			else if(index == 5) {
								
			}
			else if(index == 6) {
							
			}
			else if(index == 7) {
				tableView.clear();		
			}
			
		}
    	
    }

}