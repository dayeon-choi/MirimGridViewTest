package org.techtown.mirimgridviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter  extends BaseAdapter {
    Context context;
    int[] imgRes = {R.drawable.post1,R.drawable.post2,R.drawable.post3,R.drawable.post4,R.drawable.post5,R.drawable.post6,R.drawable.post7,R.drawable.post8,
                    R.drawable.post9,R.drawable.post10,R.drawable.post12,R.drawable.post13,R.drawable.post14,R.drawable.post15,R.drawable.post16
                    };

    public GridAdapter(Context context){
        this.context=context;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imgv=new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(200,300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(imgRes[position]);
        return imgv;
    }
}