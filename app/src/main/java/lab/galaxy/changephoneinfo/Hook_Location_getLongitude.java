package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 * Modified by zhangguopeng on 11/08/2017.
 */

public class Hook_Location_getLongitude {
    public static String className = "android.location.Location";
    public static String methodName = "getLongitude";
    public static String methodSig = "()D";
    public static double hook(Object thiz) {
        Log.i("YAHFA_Location_getLongitude", "getLongitude: [" + origin(thiz) + "]");
        return origin(thiz);
    }

    public static double origin(Object thiz) {
        Log.i("YAHFA", "Location getLongitude: should not be here");
        return 0.0;
    }
}
