package com.example.caleal.testaltran.service.callback;

import com.google.gson.JsonObject;

/**
 * Created by CALEAL on 11/27/2017.
 */

public interface CallBackGetBrastlewark {

    void onSuccess(JsonObject brastlewarkModel);
    void onError(String msgError, int indError);

}
