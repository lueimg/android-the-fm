package com.example.luismori.thefm.ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.IntegerRes;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by luismori on 7/14/15.
 */
public class ItemOffsetDecoration extends RecyclerView.ItemDecoration {

    // medida en pixeles del espaciado
    private int mItemOffset;

    // recibmos el contexto , para acceder a los recursos
    // para saber cual es la densidad de pantalla
    // @IntegerRes declara que el entero que manden pertenecera a la direccion de memora del archivo R
    public ItemOffsetDecoration(Context context, @IntegerRes int integerResId) {

        int itemOffsetDp = context.getResources().getInteger(integerResId);
        mItemOffset = convertToPx(itemOffsetDp, context.getResources().getDisplayMetrics());
    }

    public int convertToPx(int offsetDp, DisplayMetrics metrics){
        return offsetDp * (metrics.densityDpi / 160);
    }

    // coordenadas outRect
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        outRect.set(mItemOffset, mItemOffset, mItemOffset, mItemOffset);


    }
}
