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

    public ScenesAdapter(Context context, List<Scene> scenes) {
        this.context = context;
        this.scenes = scenes;
        layoutInflater = LayoutInflater.from(context);
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
        View view = layoutInflater.inflate(R.layout.item_scene, container, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);

        // Récupérer la ressource d'arrière-plan de la scène et l'afficher dans l'ImageView
        imageView.setImageResource(scenes.get(position).getBackgroundResourceId());

        // Récupérer le texte à lire de la scène et l'afficher dans le TextView
        textView.setText(scenes.get(position).getText());

        // Ajouter la vue à l'élément parent (ViewPager)
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // Supprimer la vue de l'élément parent (ViewPager)
        container.removeView((View) object);
    }
}
