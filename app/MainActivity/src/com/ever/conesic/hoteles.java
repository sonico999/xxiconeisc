package com.ever.conesic;

import utiles.fonts;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import br.com.dina.ui.widget.UITableView;
import br.com.dina.ui.widget.UITableView.ClickListener;
import informacion.estadias;
import com.actionbarsherlock.app.SherlockFragment;
import basedatos.basedatos;

public class hoteles extends SherlockFragment {
	UITableView tableView;
	Intent i;
	String[] dataBD;
	basedatos objetoBD;
	TextView titulo;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		tableView = (UITableView) getView().findViewById(R.id.tableView);
		titulo =(TextView) getView().findViewById(R.id.titulo);
		titulo.setText("Lista de Categorias de Hospedajes");
		fonts.cambiarfont_actionbar(getSherlockActivity(), "fonts/ArtistMedium.ttf");
		fonts.cambiarfont(getSherlockActivity(), R.id.titulo, "fonts/ArtistMedium.ttf");
		createList();
		tableView.commit();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.v("ListFragment", "onCreateView()");
		Log.v("ListContainer", container == null ? "true" : "false");
		Log.v("ListsavedInstanceState", savedInstanceState == null ? "true"
				: "false");
		if (container == null) {
			return null;
		}
		View view = inflater.inflate(R.layout.concursos, container, false);
		return view;
	}

	private void createList() {
		// ///
		CustomClickListener listener = new CustomClickListener();
		tableView.setClickListener(listener);
		try {
			if (objetoBD == null) {
				objetoBD = new basedatos(getSherlockActivity());
			}
				dataBD = objetoBD.getCategorias();
				for (int i = 0; i < dataBD.length; i++) {
					tableView.addBasicItem(dataBD[i], "");
				}
		} catch (Exception e) {
			Toast.makeText(getSherlockActivity(),
					"Hubo un Error al recuperar los datos", Toast.LENGTH_SHORT)
					.show();
		}
	}

	private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			i = new Intent(getSherlockActivity(), estadias.class);
			Log.d("MainActivity", "item clicked: " + index);

			switch (index) {

			case 0:
				i.putExtra("categoria", dataBD[0]);
				startActivity(i);
				break;

			case 1:
				i.putExtra("categoria", dataBD[1]);
				startActivity(i);
				break;

			case 2:
				i.putExtra("categoria", dataBD[2]);
				startActivity(i);
				break;

			case 3:
				i.putExtra("categoria", dataBD[3]);
				startActivity(i);
				break;

			case 4:
				i.putExtra("categoria", dataBD[4]);
				startActivity(i);
				break;

			default:
				break;
			}
		}

	}

}
