package com.fast.us.eight.eighthwallpaper.base;

import HNhHnhn.CHcCnNc;
import NNnHCcc.hhchh;
import NNnHCcc.hnN;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.viewpager2.adapter.Hh;
import com.bumptech.glide.cHNH;
import com.fast.us.eight.eighthwallpaper.R;
import hNN.CHNc;
import java.util.UUID;
import ncnhcNNcn.cnCNCCC;

/* loaded from: base/dex/classes.dex */
public final class App extends Application {

    /* renamed from: CNNhCnH  reason: collision with root package name */
    public static Context f4535CNNhCnH;

    public final void Hh(Context context, String str) {
        CHNc.f5387Hh.getClass();
        if (String.valueOf(((SharedPreferences) CHNc.f5385CHcCnNc.Hh()).getString(cHNH.nchc("ltOBVEGuNoSf24VXarAIiobf\n", "87rmPDXGaeY=\n"), "")).length() > 0) {
            return;
        }
        cnCNCCC.hh(hhchh.f1863CNNhCnH, hnN.f1865CNNhCnH, new nHH.cHNH(context, this, str, null), R.styleable.ActionMenuItemView);
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        Hh.nchc(applicationContext, cHNH.nchc("fL2yfdBWlRR4ubJVz0i6EnWso0TUDtdTNfE=\n", "G9jGPKAm+X0=\n"));
        f4535CNNhCnH = applicationContext;
        CHNc.f5387Hh.getClass();
        CHcCnNc cHcCnNc = CHNc.f5385CHcCnNc;
        if (String.valueOf(((SharedPreferences) cHcCnNc.Hh()).getString(cHNH.nchc("LOP5Tr33s2It\n", "SYqeJsmf7As=\n"), "")).length() == 0) {
            String uuid = UUID.randomUUID().toString();
            Hh.nchc(uuid, cHNH.nchc("MY9vVc4bZottzhIPlQ==\n", "ReA8IbxyCOw=\n"));
            cHNH.nchc("J4OPysY=\n", "UeLjv6PpHTo=\n");
            SharedPreferences.Editor edit = ((SharedPreferences) cHcCnNc.Hh()).edit();
            edit.putString(cHNH.nchc("wi5xYisrwI7D\n", "p0cWCl9Dn+c=\n"), uuid);
            edit.commit();
        }
        Hh(this, cHNH.nchc("ZF/SQTtOr419Xs9LMh3uxSJHz1YgAObDf1+IXSEa641jWc9eJBGvzGVAyV0pHa/HYVvOUDsd8w==\n", "DCumMUh0gKI=\n"));
    }
}