package id.ac.poliban.sari.listmakananku;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private List<Food> data = new ArrayList<>();

    public FoodAdapter(List<Food> data){
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_food;
        TextView tvFoodName;
        TextView tvFoodDesc;
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_food, parent, false);
        return null;


    }
}

