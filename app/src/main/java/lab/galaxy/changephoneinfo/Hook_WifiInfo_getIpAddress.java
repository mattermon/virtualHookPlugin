package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 * Modified by zhangguopeng on 11/08/2017.
 */

public class Hook_WifiInfo_getIpAddress {
    public static String className = "android.net.wifi.WifiInfo";
    public static String methodName = "getIpAddress";
    public static String methodSig = "()I";
    public static int hook(Object thiz) {
        Log.i("YAHFA_WifiInfo_getIpAddress", "getIpAddress: [" + origin(thiz) +"]");
        return origin(thiz);
    }

    public static int origin(Object thiz) {
        Log.i("YAHFA", "WifiInfo getIpAddress: should not be here");
        return 0;
    }
}
