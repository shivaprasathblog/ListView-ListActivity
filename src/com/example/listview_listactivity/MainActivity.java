package com.example.listview_listactivity;

import android.R.animator;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity
{
	
	String[] cars={"Ferrari","BMW","Mercedes","Audi","Lamborghini","Ford","Rolls-Royce","Porsche","Volkswagen"};
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
	setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cars)) ;

	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) 
	{
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String itemselected=  l.getItemAtPosition(position).toString();
		
		Toast.makeText(MainActivity.this,"The selected item is "+itemselected,Toast.LENGTH_LONG).show();
	}

	

}
