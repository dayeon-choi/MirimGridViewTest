package org.techtown.mirimgridviewtest;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter  extends BaseAdapter {
    Context context;
    int[] imgRes = {R.drawable.post1,R.drawable.post2,R.drawable.post3,R.drawable.post4,R.drawable.post5,R.drawable.post6,R.drawable.post7,R.drawable.post8,
                    R.drawable.post9,R.drawable.post10,R.drawable.post11,R.drawable.post12,R.drawable.post13,R.drawable.post14,R.drawable.post15,R.drawable.post16
                    };
    String[] titleRes={"기생충","설국열차","택시운전사","군함도","반도","레미제라블","라라랜드","메이즈러너","부산행","살아있다","비긴어게인","어바웃타임","마션","어벤저스","어벤저스","셜록홈즈"};

    public GridAdapter(Context context){
        this.context=context;
    }


    @Override
    public int getCount() {
        return imgRes.length;
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
        final ImageView imgv=new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(250,320));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(imgRes[position]);
        final int pos=position;
        imgv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                View dialogView=View.inflate(context,R.layout.dialog,null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(context);
                ImageView imgvPoster=dialogView.findViewById(R.id.imgv_dialog);
                imgvPoster.setImageResource(imgRes[pos]);
                dlg.setTitle(titleRes[pos]);
                dlg.setIcon(R.drawable.movieicon);
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });
        return imgv;
    }
}
