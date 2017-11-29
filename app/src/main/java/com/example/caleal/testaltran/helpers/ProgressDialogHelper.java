package com.example.caleal.testaltran.helpers;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.example.caleal.testaltran.R;

/**
 * Created by CALEAL on 11/27/2017.
 */

public class ProgressDialogHelper {

    private ProgressDialog progressDialog;

    public void showProgressDialog(Context context, boolean cancelable) {
        hideProgressDialog();
        progressDialog = new ProgressDialog(context);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.setCancelable(cancelable);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    public void hideProgressDialog() {
        if (progressDialog != null) {
            try {
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                progressDialog = null;
            } catch (Exception e) {

            }
        }
    }

}
