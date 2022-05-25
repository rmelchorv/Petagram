package mx.edu.unistmo.repo.mobile.android.petagram.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mx.edu.unistmo.repo.mobile.android.petagram.R;
import mx.edu.unistmo.repo.mobile.android.petagram.model.PetModel;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {

    private final LayoutInflater inflater;
    private final ArrayList<PetModel> pets;

    public PetAdapter(Context context, ArrayList<PetModel> pets) {
        this.inflater = LayoutInflater.from(context);
        this.pets = pets;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.cardview_pet, parent, false);

        return new PetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        PetModel pet = pets.get(position);

        holder.ivAvatar.setImageResource(
                holder.itemView.getContext().getResources().getIdentifier(pet.getAvatar(),
                        "drawable", holder.itemView.getContext().getPackageName()));
        holder.tvBones.setText(String.valueOf(pet.getBones()));
        holder.tvBreed.setText(String.format(" | %s", pet.getBreed()));
        holder.tvName.setText(pet.getName());
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    static class PetViewHolder extends RecyclerView.ViewHolder {

        private final ImageView ivAvatar;
        //private final ImageView ivBoneLess;
        //private final ImageView ivBonePlus;
        private final TextView tvBones;
        private final TextView tvBreed;
        private final TextView tvName;

        public PetViewHolder(View itemView) {
            super(itemView);

            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            //ivBoneLess = itemView.findViewById(R.id.ivAvatar);
            //ivBonePlus = itemView.findViewById(R.id.ivAvatar);
            tvBones = itemView.findViewById(R.id.tvBones);
            tvBreed = itemView.findViewById(R.id.tvBreed);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
