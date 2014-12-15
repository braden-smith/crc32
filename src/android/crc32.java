package org.apache.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.Long;

/**
 * This class echoes a string called from JavaScript..
 */
public class crc32 extends CordovaPlugin {

	@Override
	public long execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("getLong")) {
			JSONObject arg_object = args.getJSONObject(0);
			String strContent = arg_object.getString("strContent");
			this.getLong(strContent); 
			return 1; 
		}
		return 0;
	}

	private long getLong(String content) {
		return 1;
	}
}
