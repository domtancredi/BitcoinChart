package com.domandtom.bitcoinchart;

import org.json.JSONException;
import org.json.JSONObject;

import android.location.Location;

public class JSONCoinbaseParser {

	private static JSONObject getObject(String tagName, JSONObject jObj)  throws JSONException {
	    JSONObject subObj = jObj.getJSONObject(tagName);
	    return subObj;
	}

	private static String getString(String tagName, JSONObject jObj) throws JSONException {
	    return jObj.getString(tagName);
	}

	private static float getFloat(String tagName, JSONObject jObj) throws JSONException {
	    return (float) jObj.getDouble(tagName);
	}

	private static int getInt(String tagName, JSONObject jObj) throws JSONException {
	    return jObj.getInt(tagName);
	}
	
	public static SpotRate getSpotRate(String data) {
		SpotRate spotRate = new SpotRate();
		
		try {		
			JSONObject jObj = new JSONObject(data);

			spotRate.setAmount(getFloat("amount", jObj));
			spotRate.setCurrency(getString("currency", jObj));
	    } catch (JSONException e) {                
	        e.printStackTrace();
	    }

		return spotRate;
	}
}
