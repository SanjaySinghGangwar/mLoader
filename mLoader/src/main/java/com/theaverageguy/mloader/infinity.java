package com.theaverageguy.mloader;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;

public class infinity {
    Context context;
    private Dialog dialog;

    public infinity(Context context) {
        this.context = context;
        dialog = new Dialog(context, R.style.DialogFragmentTheme);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.infinity);
        dialog.setCancelable(false);
    }

    public void showLoader() {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        dialog.show();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void showLoader(String text) {
        TextView textView = dialog.findViewById(R.id.title);
        textView.setText(text);
        if (!dialog.isShowing()) {
            dialog.show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
    }

    public void hideLoader() {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }

    }

    public boolean isShowing() {
        return dialog.isShowing();
    }

}
