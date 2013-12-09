package com.domandtom.bitcoinchart;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.glass.app.Card;

public class MainActivity extends Activity {
	
	private class JSONBitcoinChartTask extends AsyncTask<String, Void, SpotRate> {
		private MainActivity context;
		protected SpotRate spotRate;
		
		public JSONBitcoinChartTask(final MainActivity context) {
            super();

            this.context = context;
        }
		
		@Override
		protected SpotRate doInBackground(String... params) {
			spotRate = new SpotRate();
			
		    String data = ( (new CoinbaseHttpClient()).getSpotRate());
		    spotRate = JSONCoinbaseParser.getSpotRate(data);
			
			Log.d("doInBackground", "data: " + data);
			
		    return spotRate;
		}
		
		@Override
		protected void onPostExecute(SpotRate result) {
			/* Create output */
			Card card = new Card(context);
			String cardText = "*** Bitcoin Price ***\n" + spotRate.getAmount() + "\n" + spotRate.getCurrency();
			card.setText(cardText);
			View cardView = card.toView();
			setContentView(cardView);
			
			Log.d("onPostExecute", "cardText: " + cardText);
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
	    
	   	JSONBitcoinChartTask task = new JSONBitcoinChartTask(this);
	    task.execute();
	}
	
	@Override
	protected void onStop()
	{
	    super.onStop();
	}
}
