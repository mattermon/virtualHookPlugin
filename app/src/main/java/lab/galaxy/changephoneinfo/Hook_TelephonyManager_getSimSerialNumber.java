package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 * Modified by zhangguopeng on 11/08/2017.
 */

public class Hook_TelephonyManager_getSimSerialNumber {
    public static String className = "android.telephony.TelephonyManager";
    public static String methodName = "getSimSerialNumber";
    public static String methodSig = "()Ljava/lang/String;";
    public static String hook(Object thiz) {
        Log.i("YAHFA_TelephonyManager_getSimSerialNumber", "getSimSerialNumber: [" + origin(thiz) + "]");
        return origin(thiz);
    }

    public static String origin(Object thiz) {
        Log.i("YAHFA", "TelephonyManager getSimSerialNumber: should not be here");
        return "";
    }
}
