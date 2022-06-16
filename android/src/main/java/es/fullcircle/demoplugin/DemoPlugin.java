package es.fullcircle.demoplugin;

import android.util.Log;

public class DemoPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
