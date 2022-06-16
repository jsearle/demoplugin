package es.fullcircle.demoplugin;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DemoPlugin")
public class DemoPluginPlugin extends Plugin {

    private DemoPlugin implementation = new DemoPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
    @PluginMethod
    public void initPlugin(PluginCall call) {
        String value = call.getString("value");
        implementation.initPlugin(getContext());
        JSObject ret = new JSObject();
        ret.put("value", "ok");
        call.resolve(ret);
    }

    @PluginMethod
    public void getPressure(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("pressure", implementation.getPressure());
        call.resolve(ret);
    }
    @PluginMethod
    public void getLight(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("light", implementation.getLight());
        call.resolve(ret);
    }
}
