package com.example.kidstales.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.kidstales.R;
import com.example.kidstales.model.Scene;

import java.util.List;

public class ScenesAdapter extends PagerAdapter {
    Context context;
    List<Scene> scenes;
    LayoutInflater layoutInflater;

    public ScenesAdapter(Context context,List<Scene> scenes) {
        this.context = context;
        this.scenes = scenes;
        layoutInflater=LayoutInflater.from(context);
    }



    @Override
    public int getCount() {
        return scenes.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view=layoutInflater.inflate(R.layout.item_scene,container,false);

        ImageView imageView=view.findViewById(R.id.imageView);
        TextView textView=view.findViewById(R.id.textView);

        imageView.setImageResource(scenes.get(position).getBackgroundResourceId());
        textView.setText(scenes.get(position).getText());

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
