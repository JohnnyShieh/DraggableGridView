/**
 * 
 */
package com.animoto.android.views;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
/**
 * @ClassName: 	ImageAdapter
 * @Description:TODO
 * @author 	JohnnyShieh
 * @date	Jan 17, 2014		4:40:46 PM
 */
public class ImageAdapter extends ArrayAdapter<Bitmap>{

    private List<Bitmap> mList ;
    private Context mContext ;

    public ImageAdapter ( Context context, List<Bitmap> list ) {
        super ( context, 0, list );
        mContext = context ;
        mList = list ;
    }

    @Override
    public View getView ( int pos, View convertView, ViewGroup parentView) {
        ImageView view = new ImageView ( mContext) ;
        view.setImageBitmap ( mList.get ( pos ) ) ;
        
        return view ;
    }
    
    @Override
    public int getCount () {
        return mList.size () ;
    }
    
}
