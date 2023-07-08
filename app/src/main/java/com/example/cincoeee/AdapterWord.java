package com.example.cincoeee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cincoeee.databinding.ItemBinding;

import java.util.List;

public class AdapterWord extends RecyclerView.Adapter<AdapterWord.ViewHolder> {
    private List<String> word;
    @NonNull
    @Override
    public AdapterWord.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWord.ViewHolder holder, int position) {
        String item = word.get(position);
    }

    @Override
    public int getItemCount() {
        return word.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemBinding itemBindingg;
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            itemBindingg = binding;
        }

        public void showInfo(String word){
            itemBindingg.textView.setText(word);
        }
    }
}
