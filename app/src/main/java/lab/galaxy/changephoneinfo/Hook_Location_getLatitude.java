package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 * Modified by zhangguopeng on 11/08/2017.
 */

public class Hook_Location_getLatitude {
    public static String className = "android.location.Location";
    public static String methodName = "getLatitude";
    public static String methodSig = "()D";
    public static double hook(Object thiz) {
        Log.i("YAHFA_Location_getLatitude", "getLatitude: [" + origin(thiz) + "]");
        return origin(thiz);
    }

    public static double origin(Object thiz) {
        Log.e("YAHFA", "Location getLatitude should not be here");
        return 0.0;
    }
}
