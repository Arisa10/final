package com.ct0292477.afinal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Icon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }

    public class ImageAdapter extends PagerAdapter {
        Context context;
        private int[] Gallery = new int[]{
                R.drawable.incomeicon_1,
                R.drawable.incomeicon_2,
                R.drawable.expenses_1,
                R.drawable.expenses_2,
                R.drawable.expenses_3,
        };

        ImageAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return Gallery.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((ImageView) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = new ImageView(context);

            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(Gallery[position]);
            ((ViewPager) container).addView(imageView, 0);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((ImageView) object);
        }
    }
}