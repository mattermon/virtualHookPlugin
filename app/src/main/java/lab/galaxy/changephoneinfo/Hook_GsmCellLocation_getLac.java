package lab.galaxy.changephoneinfo;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 * Modified by zhangguopeng on 11/08/2017.
 */

public class Hook_GsmCellLocation_getLac {
    public static String className = "android.telephony.gsm.GsmCellLocation";
    public static String methodName = "getLac";
    public static String methodSig = "()I";
    public static int hook(Object thiz) {
        Log.i("YAHFA_GsmCellLocation_getLac", "getLac: [" + origin(thiz) + "]");
        return origin(thiz);
    }

    public static int origin(Object thiz) {
        Log.i("YAHFA", "GsmCellLocation getLac: should not be here.");
        return 0;
    }
}
