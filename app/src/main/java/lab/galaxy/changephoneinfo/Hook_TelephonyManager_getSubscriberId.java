package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 * Modified by zhangguopeng on 11/08/2017.
 */

public class Hook_TelephonyManager_getSubscriberId {
    public static String className = "android.telephony.TelephonyManager";
    public static String methodName = "getSubscriberId";
    public static String methodSig = "()Ljava/lang/String;";
    public static String hook(Object thiz) {
        Log.i("YAHFA_TelephonyManager_getSubscriberId", "getSubscriberId: [" + origin(thiz) +"]");
        return origin(thiz);
    }

    public static String origin(Object thiz) {
        Log.i("YAHFA", "TelephonyManager getSubscriberId: should not be here");
        return "";
    }
}
