package hNN;

import NNnHCcc.hnN;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.Toast;
import com.fast.us.eight.eighthwallpaper.R;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: base/dex/classes.dex */
public final class CHnnh {
    public static void CNNhCnH(Activity activity, int i, String str, String str2) {
        OutputStream openOutputStream;
        String[] strArr;
        androidx.viewpager2.adapter.Hh.HNhNH(activity, com.bumptech.glide.cHNH.nchc("JmyoeY3bdKE=\n", "Rw/cEPuyANg=\n"));
        com.bumptech.glide.cHNH.nchc("NiNmFc0=\n", "QkoSeaguTVg=\n");
        com.bumptech.glide.cHNH.nchc("rFvFwiG4VcqhUdg=\n", "yD62oVPRJb4=\n");
        int i2 = Build.VERSION.SDK_INT;
        if (CnnN.CHcCnNc.Hh(activity, com.bumptech.glide.cHNH.nchc("YxetUFvEDyNyHLtPXd4YZG0X53Vm5D9IXTyRdnH/JUxOJpp2e/8qSkc=\n", "AnnJIjStaw0=\n")) != 0) {
            String[] strArr2 = {com.bumptech.glide.cHNH.nchc("jcRpKhej0cmcz381EbnGjoPEIw8qg+Gis+9VDD2Y+6ag9V4MN5j0oKk=\n", "7KoNWHjKtec=\n")};
            int i3 = CcnCNH.ChcnN.f801CNNhCnH;
            HashSet hashSet = new HashSet();
            if (!TextUtils.isEmpty(strArr2[R.xml.backup_rules])) {
                if (i2 < R.styleable.ClockHandView && TextUtils.equals(strArr2[R.xml.backup_rules], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf((int) R.xml.backup_rules));
                }
                int size = hashSet.size();
                if (size > 0) {
                    strArr = new String[1 - size];
                } else {
                    strArr = strArr2;
                }
                if (size > 0) {
                    if (size != R.xml.data_extraction_rules) {
                        if (!hashSet.contains(Integer.valueOf((int) R.xml.backup_rules))) {
                            strArr[R.xml.backup_rules] = strArr2[R.xml.backup_rules];
                        }
                    } else {
                        return;
                    }
                }
                if (activity instanceof CcnCNH.cnCNCCC) {
                    CcnCNH.cnCNCCC cncnccc = (CcnCNH.cnCNCCC) activity;
                }
                CcnCNH.cHNH.CNNhCnH(activity, strArr2, 1000);
                return;
            }
            throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr2) + " must not contain null or empty values");
        }
        Drawable CNNhCnH2 = CnnN.CNNhCnH.CNNhCnH(activity, i);
        androidx.viewpager2.adapter.Hh.HhHh(CNNhCnH2, com.bumptech.glide.cHNH.nchc("FWh4quK1FnIVcmDmoLNXfxpuYOa2uVdyFHM5qLe6GzwPZGSj4rcZeAlyfaLssQV9C3V9pbH4E24a\nanWkrrNZXhJpeaeykgV9DHx2qqc=\n", "ex0UxsLWdxw=\n"));
        Bitmap bitmap = ((BitmapDrawable) CNNhCnH2).getBitmap();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.bumptech.glide.cHNH.nchc("ixOS8us=\n", "/3rmno61g3w=\n"), str);
        contentValues.put(com.bumptech.glide.cHNH.nchc("uWP3YWiBWu60aeo=\n", "3QaEAhroKpo=\n"), str2);
        contentValues.put(com.bumptech.glide.cHNH.nchc("61TZrPD5xSXj\n", "hj20ya+NvFU=\n"), com.bumptech.glide.cHNH.nchc("gCslgQqKShCMIQ==\n", "6UZE5m+lIGA=\n"));
        if (i2 >= R.styleable.Chip) {
            contentValues.put(com.bumptech.glide.cHNH.nchc("Q5EE0ZcXne5uhAnEiw==\n", "MfRosON+64s=\n"), Environment.DIRECTORY_PICTURES);
        }
        Uri insert = activity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert != null && (openOutputStream = activity.getContentResolver().openOutputStream(insert)) != null) {
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, R.styleable.MotionHelper, openOutputStream);
                Toast.makeText(activity, com.bumptech.glide.cHNH.nchc("dPVeQS1I291L/VsGPAeI21z0U0M6EQ==\n", "PZg/JkhoqLw=\n"), (int) R.xml.backup_rules).show();
                ncnhcNNcn.cnCNCCC.cccNnCh(openOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ncnhcNNcn.cnCNCCC.cccNnCh(openOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    public static final Object Hh(WallpaperManager wallpaperManager, Bitmap bitmap, int i, hcHhCh.cnCNCCC cncnccc) {
        kotlinx.coroutines.scheduling.CHcCnNc cHcCnNc = hnN.f1866Hh;
        Object NCnnH2 = ncnhcNNcn.cnCNCCC.NCnnH(kotlinx.coroutines.internal.NnnNCHHHH.f5996Hh, new ChcnN(wallpaperManager, bitmap, i, null), cncnccc);
        if (NCnnH2 != CcnH.Hh.f813CNNhCnH) {
            return HNhHnhn.cccNnCh.f1263Hh;
        }
        return NCnnH2;
    }
}