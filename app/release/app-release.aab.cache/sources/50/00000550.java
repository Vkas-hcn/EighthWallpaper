package com.fast.us.eight.eighthwallpaper.view;

import CHcCnNc.NnnNCHHHH;
import HNhHnhn.CHcCnNc;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.adapter.Hh;
import cCn.hnN;
import cchC.CNNhCnH;
import com.bumptech.glide.cHNH;
import com.fast.us.eight.eighthwallpaper.R;
import com.fast.us.eight.eighthwallpaper.view.EndActivity;
import hNN.CHnnh;
import hNN.ChN;
import ncnhcNNcn.cnCNCCC;

/* loaded from: base/dex/classes.dex */
public final class EndActivity extends NnnNCHHHH {

    /* renamed from: CnnN  reason: collision with root package name */
    public static final /* synthetic */ int f4536CnnN = 0;

    /* renamed from: CcnCNH  reason: collision with root package name */
    public int f4537CcnCNH;

    /* renamed from: hhH  reason: collision with root package name */
    public final CHcCnNc f4538hhH = cnCNCCC.cCN(new hnN(this, R.xml.backup_rules));

    public final CNNhCnH nchc() {
        return (CNNhCnH) this.f4538hhH.Hh();
    }

    @Override // androidx.fragment.app.NcnnH, androidx.activity.CHNc, CcnCNH.CHnnh, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(nchc().f3000cnCNCCC);
        this.f4537CcnCNH = getIntent().getIntExtra(cHNH.nchc("G/f9n26IFnE=\n", "a5iO9hrheR8=\n"), R.xml.backup_rules);
        nchc().f4014HNhNH.setOnClickListener(new View.OnClickListener(this) { // from class: cCn.cCnHnN

            /* renamed from: cHNH  reason: collision with root package name */
            public final /* synthetic */ EndActivity f3650cHNH;

            {
                this.f3650cHNH = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r2;
                EndActivity endActivity = this.f3650cHNH;
                switch (i) {
                    case R.xml.backup_rules /* 0 */:
                        int i2 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("FBDu3g7N\n", "YHiHrSr9WSw=\n"));
                        endActivity.finish();
                        return;
                    case R.xml.data_extraction_rules /* 1 */:
                        int i3 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("P/ThDPAh\n", "S5yIf9QR/58=\n"));
                        endActivity.nchc().hh(Boolean.TRUE);
                        return;
                    case R.styleable.ActionMenuItemView /* 2 */:
                        int i4 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("GGlplmGg\n", "bAEA5UWQi1Q=\n"));
                        endActivity.nchc().hh(Boolean.FALSE);
                        return;
                    case R.styleable.ActionMenuView /* 3 */:
                        int i5 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("xh/oJDaQ\n", "sneBVxKg2lA=\n"));
                        CHnnh.CNNhCnH(endActivity, endActivity.f4537CcnCNH, cHNH.nchc("bkwcPz0SuMtL\n", "OS1wU21zyK4=\n"), cHNH.nchc("eAzEOJaCeJFd\n", "L22oVMbjCPQ=\n"));
                        return;
                    case R.styleable.ActionMode /* 4 */:
                        int i6 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("AVQ6oGNU\n", "dTxT00dkTBU=\n"));
                        int i7 = endActivity.f4537CcnCNH;
                        hnN hnn = new hnN(endActivity, R.xml.data_extraction_rules);
                        hnN hnn2 = new hnN(endActivity, R.styleable.ActionMenuItemView);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i7, R.styleable.ActionMenuItemView, hnn, hnn2, null), R.styleable.ActionMenuItemView);
                        return;
                    case R.styleable.ActivityChooserView /* 5 */:
                        int i8 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("ohpuIUyp\n", "1nIHUmiZ9h8=\n"));
                        int i9 = endActivity.f4537CcnCNH;
                        hnN hnn3 = new hnN(endActivity, R.styleable.ActionMenuView);
                        hnN hnn4 = new hnN(endActivity, R.styleable.ActionMode);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i9, R.xml.data_extraction_rules, hnn3, hnn4, null), R.styleable.ActionMenuItemView);
                        return;
                    default:
                        int i10 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("pOqz9Jws\n", "0ILah7gcnWE=\n"));
                        int i11 = endActivity.f4537CcnCNH;
                        hnN hnn5 = new hnN(endActivity, R.styleable.ActivityChooserView);
                        hnN hnn6 = new hnN(endActivity, R.styleable.AlertDialog);
                        cHNH.nchc("u88VeRF7lSo=\n", "2qxhEGcS4VM=\n");
                        cHNH.nchc("n/yzzZT+cbg=\n", "7IjSv+CtFMw=\n");
                        cHNH.nchc("uolA3HYpxj69\n", "yew0nxlEtl8=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new hNN.cnCNCCC(endActivity, i11, hnn5, hnn6, null), R.styleable.ActionMenuItemView);
                        return;
                }
            }
        });
        nchc().f4019hcNNcC.setOnClickListener(new View.OnClickListener(this) { // from class: cCn.cCnHnN

            /* renamed from: cHNH  reason: collision with root package name */
            public final /* synthetic */ EndActivity f3650cHNH;

            {
                this.f3650cHNH = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r2;
                EndActivity endActivity = this.f3650cHNH;
                switch (i) {
                    case R.xml.backup_rules /* 0 */:
                        int i2 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("FBDu3g7N\n", "YHiHrSr9WSw=\n"));
                        endActivity.finish();
                        return;
                    case R.xml.data_extraction_rules /* 1 */:
                        int i3 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("P/ThDPAh\n", "S5yIf9QR/58=\n"));
                        endActivity.nchc().hh(Boolean.TRUE);
                        return;
                    case R.styleable.ActionMenuItemView /* 2 */:
                        int i4 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("GGlplmGg\n", "bAEA5UWQi1Q=\n"));
                        endActivity.nchc().hh(Boolean.FALSE);
                        return;
                    case R.styleable.ActionMenuView /* 3 */:
                        int i5 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("xh/oJDaQ\n", "sneBVxKg2lA=\n"));
                        CHnnh.CNNhCnH(endActivity, endActivity.f4537CcnCNH, cHNH.nchc("bkwcPz0SuMtL\n", "OS1wU21zyK4=\n"), cHNH.nchc("eAzEOJaCeJFd\n", "L22oVMbjCPQ=\n"));
                        return;
                    case R.styleable.ActionMode /* 4 */:
                        int i6 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("AVQ6oGNU\n", "dTxT00dkTBU=\n"));
                        int i7 = endActivity.f4537CcnCNH;
                        hnN hnn = new hnN(endActivity, R.xml.data_extraction_rules);
                        hnN hnn2 = new hnN(endActivity, R.styleable.ActionMenuItemView);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i7, R.styleable.ActionMenuItemView, hnn, hnn2, null), R.styleable.ActionMenuItemView);
                        return;
                    case R.styleable.ActivityChooserView /* 5 */:
                        int i8 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("ohpuIUyp\n", "1nIHUmiZ9h8=\n"));
                        int i9 = endActivity.f4537CcnCNH;
                        hnN hnn3 = new hnN(endActivity, R.styleable.ActionMenuView);
                        hnN hnn4 = new hnN(endActivity, R.styleable.ActionMode);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i9, R.xml.data_extraction_rules, hnn3, hnn4, null), R.styleable.ActionMenuItemView);
                        return;
                    default:
                        int i10 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("pOqz9Jws\n", "0ILah7gcnWE=\n"));
                        int i11 = endActivity.f4537CcnCNH;
                        hnN hnn5 = new hnN(endActivity, R.styleable.ActivityChooserView);
                        hnN hnn6 = new hnN(endActivity, R.styleable.AlertDialog);
                        cHNH.nchc("u88VeRF7lSo=\n", "2qxhEGcS4VM=\n");
                        cHNH.nchc("n/yzzZT+cbg=\n", "7IjSv+CtFMw=\n");
                        cHNH.nchc("uolA3HYpxj69\n", "yew0nxlEtl8=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new hNN.cnCNCCC(endActivity, i11, hnn5, hnn6, null), R.styleable.ActionMenuItemView);
                        return;
                }
            }
        });
        nchc().f4022nn.setOnClickListener(new View.OnClickListener(this) { // from class: cCn.cCnHnN

            /* renamed from: cHNH  reason: collision with root package name */
            public final /* synthetic */ EndActivity f3650cHNH;

            {
                this.f3650cHNH = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r2;
                EndActivity endActivity = this.f3650cHNH;
                switch (i) {
                    case R.xml.backup_rules /* 0 */:
                        int i2 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("FBDu3g7N\n", "YHiHrSr9WSw=\n"));
                        endActivity.finish();
                        return;
                    case R.xml.data_extraction_rules /* 1 */:
                        int i3 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("P/ThDPAh\n", "S5yIf9QR/58=\n"));
                        endActivity.nchc().hh(Boolean.TRUE);
                        return;
                    case R.styleable.ActionMenuItemView /* 2 */:
                        int i4 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("GGlplmGg\n", "bAEA5UWQi1Q=\n"));
                        endActivity.nchc().hh(Boolean.FALSE);
                        return;
                    case R.styleable.ActionMenuView /* 3 */:
                        int i5 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("xh/oJDaQ\n", "sneBVxKg2lA=\n"));
                        CHnnh.CNNhCnH(endActivity, endActivity.f4537CcnCNH, cHNH.nchc("bkwcPz0SuMtL\n", "OS1wU21zyK4=\n"), cHNH.nchc("eAzEOJaCeJFd\n", "L22oVMbjCPQ=\n"));
                        return;
                    case R.styleable.ActionMode /* 4 */:
                        int i6 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("AVQ6oGNU\n", "dTxT00dkTBU=\n"));
                        int i7 = endActivity.f4537CcnCNH;
                        hnN hnn = new hnN(endActivity, R.xml.data_extraction_rules);
                        hnN hnn2 = new hnN(endActivity, R.styleable.ActionMenuItemView);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i7, R.styleable.ActionMenuItemView, hnn, hnn2, null), R.styleable.ActionMenuItemView);
                        return;
                    case R.styleable.ActivityChooserView /* 5 */:
                        int i8 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("ohpuIUyp\n", "1nIHUmiZ9h8=\n"));
                        int i9 = endActivity.f4537CcnCNH;
                        hnN hnn3 = new hnN(endActivity, R.styleable.ActionMenuView);
                        hnN hnn4 = new hnN(endActivity, R.styleable.ActionMode);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i9, R.xml.data_extraction_rules, hnn3, hnn4, null), R.styleable.ActionMenuItemView);
                        return;
                    default:
                        int i10 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("pOqz9Jws\n", "0ILah7gcnWE=\n"));
                        int i11 = endActivity.f4537CcnCNH;
                        hnN hnn5 = new hnN(endActivity, R.styleable.ActivityChooserView);
                        hnN hnn6 = new hnN(endActivity, R.styleable.AlertDialog);
                        cHNH.nchc("u88VeRF7lSo=\n", "2qxhEGcS4VM=\n");
                        cHNH.nchc("n/yzzZT+cbg=\n", "7IjSv+CtFMw=\n");
                        cHNH.nchc("uolA3HYpxj69\n", "yew0nxlEtl8=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new hNN.cnCNCCC(endActivity, i11, hnn5, hnn6, null), R.styleable.ActionMenuItemView);
                        return;
                }
            }
        });
        nchc().f4016NcnnH.setOnClickListener(new View.OnClickListener(this) { // from class: cCn.cCnHnN

            /* renamed from: cHNH  reason: collision with root package name */
            public final /* synthetic */ EndActivity f3650cHNH;

            {
                this.f3650cHNH = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r2;
                EndActivity endActivity = this.f3650cHNH;
                switch (i) {
                    case R.xml.backup_rules /* 0 */:
                        int i2 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("FBDu3g7N\n", "YHiHrSr9WSw=\n"));
                        endActivity.finish();
                        return;
                    case R.xml.data_extraction_rules /* 1 */:
                        int i3 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("P/ThDPAh\n", "S5yIf9QR/58=\n"));
                        endActivity.nchc().hh(Boolean.TRUE);
                        return;
                    case R.styleable.ActionMenuItemView /* 2 */:
                        int i4 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("GGlplmGg\n", "bAEA5UWQi1Q=\n"));
                        endActivity.nchc().hh(Boolean.FALSE);
                        return;
                    case R.styleable.ActionMenuView /* 3 */:
                        int i5 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("xh/oJDaQ\n", "sneBVxKg2lA=\n"));
                        CHnnh.CNNhCnH(endActivity, endActivity.f4537CcnCNH, cHNH.nchc("bkwcPz0SuMtL\n", "OS1wU21zyK4=\n"), cHNH.nchc("eAzEOJaCeJFd\n", "L22oVMbjCPQ=\n"));
                        return;
                    case R.styleable.ActionMode /* 4 */:
                        int i6 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("AVQ6oGNU\n", "dTxT00dkTBU=\n"));
                        int i7 = endActivity.f4537CcnCNH;
                        hnN hnn = new hnN(endActivity, R.xml.data_extraction_rules);
                        hnN hnn2 = new hnN(endActivity, R.styleable.ActionMenuItemView);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i7, R.styleable.ActionMenuItemView, hnn, hnn2, null), R.styleable.ActionMenuItemView);
                        return;
                    case R.styleable.ActivityChooserView /* 5 */:
                        int i8 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("ohpuIUyp\n", "1nIHUmiZ9h8=\n"));
                        int i9 = endActivity.f4537CcnCNH;
                        hnN hnn3 = new hnN(endActivity, R.styleable.ActionMenuView);
                        hnN hnn4 = new hnN(endActivity, R.styleable.ActionMode);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i9, R.xml.data_extraction_rules, hnn3, hnn4, null), R.styleable.ActionMenuItemView);
                        return;
                    default:
                        int i10 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("pOqz9Jws\n", "0ILah7gcnWE=\n"));
                        int i11 = endActivity.f4537CcnCNH;
                        hnN hnn5 = new hnN(endActivity, R.styleable.ActivityChooserView);
                        hnN hnn6 = new hnN(endActivity, R.styleable.AlertDialog);
                        cHNH.nchc("u88VeRF7lSo=\n", "2qxhEGcS4VM=\n");
                        cHNH.nchc("n/yzzZT+cbg=\n", "7IjSv+CtFMw=\n");
                        cHNH.nchc("uolA3HYpxj69\n", "yew0nxlEtl8=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new hNN.cnCNCCC(endActivity, i11, hnn5, hnn6, null), R.styleable.ActionMenuItemView);
                        return;
                }
            }
        });
        nchc().f4013HHnhh.setOnClickListener(new View.OnClickListener(this) { // from class: cCn.cCnHnN

            /* renamed from: cHNH  reason: collision with root package name */
            public final /* synthetic */ EndActivity f3650cHNH;

            {
                this.f3650cHNH = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r2;
                EndActivity endActivity = this.f3650cHNH;
                switch (i) {
                    case R.xml.backup_rules /* 0 */:
                        int i2 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("FBDu3g7N\n", "YHiHrSr9WSw=\n"));
                        endActivity.finish();
                        return;
                    case R.xml.data_extraction_rules /* 1 */:
                        int i3 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("P/ThDPAh\n", "S5yIf9QR/58=\n"));
                        endActivity.nchc().hh(Boolean.TRUE);
                        return;
                    case R.styleable.ActionMenuItemView /* 2 */:
                        int i4 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("GGlplmGg\n", "bAEA5UWQi1Q=\n"));
                        endActivity.nchc().hh(Boolean.FALSE);
                        return;
                    case R.styleable.ActionMenuView /* 3 */:
                        int i5 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("xh/oJDaQ\n", "sneBVxKg2lA=\n"));
                        CHnnh.CNNhCnH(endActivity, endActivity.f4537CcnCNH, cHNH.nchc("bkwcPz0SuMtL\n", "OS1wU21zyK4=\n"), cHNH.nchc("eAzEOJaCeJFd\n", "L22oVMbjCPQ=\n"));
                        return;
                    case R.styleable.ActionMode /* 4 */:
                        int i6 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("AVQ6oGNU\n", "dTxT00dkTBU=\n"));
                        int i7 = endActivity.f4537CcnCNH;
                        hnN hnn = new hnN(endActivity, R.xml.data_extraction_rules);
                        hnN hnn2 = new hnN(endActivity, R.styleable.ActionMenuItemView);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i7, R.styleable.ActionMenuItemView, hnn, hnn2, null), R.styleable.ActionMenuItemView);
                        return;
                    case R.styleable.ActivityChooserView /* 5 */:
                        int i8 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("ohpuIUyp\n", "1nIHUmiZ9h8=\n"));
                        int i9 = endActivity.f4537CcnCNH;
                        hnN hnn3 = new hnN(endActivity, R.styleable.ActionMenuView);
                        hnN hnn4 = new hnN(endActivity, R.styleable.ActionMode);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i9, R.xml.data_extraction_rules, hnn3, hnn4, null), R.styleable.ActionMenuItemView);
                        return;
                    default:
                        int i10 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("pOqz9Jws\n", "0ILah7gcnWE=\n"));
                        int i11 = endActivity.f4537CcnCNH;
                        hnN hnn5 = new hnN(endActivity, R.styleable.ActivityChooserView);
                        hnN hnn6 = new hnN(endActivity, R.styleable.AlertDialog);
                        cHNH.nchc("u88VeRF7lSo=\n", "2qxhEGcS4VM=\n");
                        cHNH.nchc("n/yzzZT+cbg=\n", "7IjSv+CtFMw=\n");
                        cHNH.nchc("uolA3HYpxj69\n", "yew0nxlEtl8=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new hNN.cnCNCCC(endActivity, i11, hnn5, hnn6, null), R.styleable.ActionMenuItemView);
                        return;
                }
            }
        });
        nchc().f4017cCHC.setOnClickListener(new View.OnClickListener(this) { // from class: cCn.cCnHnN

            /* renamed from: cHNH  reason: collision with root package name */
            public final /* synthetic */ EndActivity f3650cHNH;

            {
                this.f3650cHNH = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r2;
                EndActivity endActivity = this.f3650cHNH;
                switch (i) {
                    case R.xml.backup_rules /* 0 */:
                        int i2 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("FBDu3g7N\n", "YHiHrSr9WSw=\n"));
                        endActivity.finish();
                        return;
                    case R.xml.data_extraction_rules /* 1 */:
                        int i3 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("P/ThDPAh\n", "S5yIf9QR/58=\n"));
                        endActivity.nchc().hh(Boolean.TRUE);
                        return;
                    case R.styleable.ActionMenuItemView /* 2 */:
                        int i4 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("GGlplmGg\n", "bAEA5UWQi1Q=\n"));
                        endActivity.nchc().hh(Boolean.FALSE);
                        return;
                    case R.styleable.ActionMenuView /* 3 */:
                        int i5 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("xh/oJDaQ\n", "sneBVxKg2lA=\n"));
                        CHnnh.CNNhCnH(endActivity, endActivity.f4537CcnCNH, cHNH.nchc("bkwcPz0SuMtL\n", "OS1wU21zyK4=\n"), cHNH.nchc("eAzEOJaCeJFd\n", "L22oVMbjCPQ=\n"));
                        return;
                    case R.styleable.ActionMode /* 4 */:
                        int i6 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("AVQ6oGNU\n", "dTxT00dkTBU=\n"));
                        int i7 = endActivity.f4537CcnCNH;
                        hnN hnn = new hnN(endActivity, R.xml.data_extraction_rules);
                        hnN hnn2 = new hnN(endActivity, R.styleable.ActionMenuItemView);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i7, R.styleable.ActionMenuItemView, hnn, hnn2, null), R.styleable.ActionMenuItemView);
                        return;
                    case R.styleable.ActivityChooserView /* 5 */:
                        int i8 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("ohpuIUyp\n", "1nIHUmiZ9h8=\n"));
                        int i9 = endActivity.f4537CcnCNH;
                        hnN hnn3 = new hnN(endActivity, R.styleable.ActionMenuView);
                        hnN hnn4 = new hnN(endActivity, R.styleable.ActionMode);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i9, R.xml.data_extraction_rules, hnn3, hnn4, null), R.styleable.ActionMenuItemView);
                        return;
                    default:
                        int i10 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("pOqz9Jws\n", "0ILah7gcnWE=\n"));
                        int i11 = endActivity.f4537CcnCNH;
                        hnN hnn5 = new hnN(endActivity, R.styleable.ActivityChooserView);
                        hnN hnn6 = new hnN(endActivity, R.styleable.AlertDialog);
                        cHNH.nchc("u88VeRF7lSo=\n", "2qxhEGcS4VM=\n");
                        cHNH.nchc("n/yzzZT+cbg=\n", "7IjSv+CtFMw=\n");
                        cHNH.nchc("uolA3HYpxj69\n", "yew0nxlEtl8=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new hNN.cnCNCCC(endActivity, i11, hnn5, hnn6, null), R.styleable.ActionMenuItemView);
                        return;
                }
            }
        });
        nchc().f4018chhChnNC.setOnClickListener(new View.OnClickListener(this) { // from class: cCn.cCnHnN

            /* renamed from: cHNH  reason: collision with root package name */
            public final /* synthetic */ EndActivity f3650cHNH;

            {
                this.f3650cHNH = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r2;
                EndActivity endActivity = this.f3650cHNH;
                switch (i) {
                    case R.xml.backup_rules /* 0 */:
                        int i2 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("FBDu3g7N\n", "YHiHrSr9WSw=\n"));
                        endActivity.finish();
                        return;
                    case R.xml.data_extraction_rules /* 1 */:
                        int i3 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("P/ThDPAh\n", "S5yIf9QR/58=\n"));
                        endActivity.nchc().hh(Boolean.TRUE);
                        return;
                    case R.styleable.ActionMenuItemView /* 2 */:
                        int i4 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("GGlplmGg\n", "bAEA5UWQi1Q=\n"));
                        endActivity.nchc().hh(Boolean.FALSE);
                        return;
                    case R.styleable.ActionMenuView /* 3 */:
                        int i5 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("xh/oJDaQ\n", "sneBVxKg2lA=\n"));
                        CHnnh.CNNhCnH(endActivity, endActivity.f4537CcnCNH, cHNH.nchc("bkwcPz0SuMtL\n", "OS1wU21zyK4=\n"), cHNH.nchc("eAzEOJaCeJFd\n", "L22oVMbjCPQ=\n"));
                        return;
                    case R.styleable.ActionMode /* 4 */:
                        int i6 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("AVQ6oGNU\n", "dTxT00dkTBU=\n"));
                        int i7 = endActivity.f4537CcnCNH;
                        hnN hnn = new hnN(endActivity, R.xml.data_extraction_rules);
                        hnN hnn2 = new hnN(endActivity, R.styleable.ActionMenuItemView);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i7, R.styleable.ActionMenuItemView, hnn, hnn2, null), R.styleable.ActionMenuItemView);
                        return;
                    case R.styleable.ActivityChooserView /* 5 */:
                        int i8 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("ohpuIUyp\n", "1nIHUmiZ9h8=\n"));
                        int i9 = endActivity.f4537CcnCNH;
                        hnN hnn3 = new hnN(endActivity, R.styleable.ActionMenuView);
                        hnN hnn4 = new hnN(endActivity, R.styleable.ActionMode);
                        cHNH.nchc("vOy3YLoNrtI=\n", "3Y/DCcxk2qs=\n");
                        cHNH.nchc("ixV6KDi+MlM=\n", "+GEbWkztVyc=\n");
                        cHNH.nchc("UgHx0KmmY+1V\n", "IWSFk8bLE4w=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new ChN(endActivity, i9, R.xml.data_extraction_rules, hnn3, hnn4, null), R.styleable.ActionMenuItemView);
                        return;
                    default:
                        int i10 = EndActivity.f4536CnnN;
                        Hh.HNhNH(endActivity, cHNH.nchc("pOqz9Jws\n", "0ILah7gcnWE=\n"));
                        int i11 = endActivity.f4537CcnCNH;
                        hnN hnn5 = new hnN(endActivity, R.styleable.ActivityChooserView);
                        hnN hnn6 = new hnN(endActivity, R.styleable.AlertDialog);
                        cHNH.nchc("u88VeRF7lSo=\n", "2qxhEGcS4VM=\n");
                        cHNH.nchc("n/yzzZT+cbg=\n", "7IjSv+CtFMw=\n");
                        cHNH.nchc("uolA3HYpxj69\n", "yew0nxlEtl8=\n");
                        cnCNCCC.hh(com.bumptech.glide.CHcCnNc.CHnnh(endActivity), NNnHCcc.hnN.f1865CNNhCnH, new hNN.cnCNCCC(endActivity, i11, hnn5, hnn6, null), R.styleable.ActionMenuItemView);
                        return;
                }
            }
        });
        nchc().f4011CHNc.setImageResource(this.f4537CcnCNH);
    }

    @Override // androidx.fragment.app.NcnnH, androidx.activity.CHNc, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Hh.HNhNH(strArr, cHNH.nchc("MX+PJkrFwMQudI4=\n", "QRr9SyO2s60=\n"));
        Hh.HNhNH(iArr, cHNH.nchc("ugXCBkWCv0moG9cb\n", "3XejaDHQ2jo=\n"));
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1000) {
            CHnnh.CNNhCnH(this, this.f4537CcnCNH, cHNH.nchc("mFibE9YNAG29\n", "zzn3f4ZscAg=\n"), cHNH.nchc("1ud34vkehIDz\n", "gYYbjql/9OU=\n"));
        }
    }
}