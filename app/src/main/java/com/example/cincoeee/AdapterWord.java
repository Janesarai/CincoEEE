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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWord.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return word.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
        }
    }
}
