package com.vuforia.samples.VuforiaSamples.app.ImageTargets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vuforia.samples.VuforiaSamples.R;


public class MyBottomSheetDialogFragment extends BottomSheetDialogFragment {

    String mString;
    View v;
    static MyBottomSheetDialogFragment newInstance(String string) {
        MyBottomSheetDialogFragment f = new MyBottomSheetDialogFragment();
        Bundle args = new Bundle();
        args.putString("string", string);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mString = getArguments().getString("string");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         v = inflater.inflate(R.layout.bottom_sheet_modal, container, false);
        return v;
    }

}
