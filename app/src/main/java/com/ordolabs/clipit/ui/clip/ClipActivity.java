package com.ordolabs.clipit.ui.clip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.ordolabs.clipit.ui.base.BaseActivity;

/**
 * Created by ordogod on 28.06.19.
 **/

public class ClipActivity extends BaseActivity implements ClipMvpContract.View {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static Intent getStartingIntent(@NonNull Context callingContext) {
        return new Intent(callingContext, ClipActivity.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}