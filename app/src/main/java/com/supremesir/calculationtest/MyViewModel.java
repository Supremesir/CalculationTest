package com.supremesir.calculationtest;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;

import java.util.logging.Handler;

/**
 * @author HaoFan Fang
 * @date 2020/3/21 07:46
 */

public class MyViewModel extends AndroidViewModel {

    SavedStateHandle handle;
    private static String KEY_HIGH_SCORE = "key_high_score";

    public MyViewModel(@NonNull Application application, SavedStateHandle handle) {
        super(application);
//        if (handle.contains())
    }
}
