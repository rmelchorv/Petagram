package mx.edu.unistmo.repo.mobile.android.petagram.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mx.edu.unistmo.repo.mobile.android.petagram.R;
import mx.edu.unistmo.repo.mobile.android.petagram.adapter.PetAdapter;
import mx.edu.unistmo.repo.mobile.android.petagram.model.PetModel;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        /* Setting pet list */
        ArrayList<PetModel> pets = new ArrayList<>();
        pets.add(new PetModel("@drawable/ic_pet_akita_inu", 0,"Akita Inu","Happy"));
        pets.add(new PetModel("@drawable/ic_pet_beagle", 0,"Beagle","Lucky"));
        pets.add(new PetModel("@drawable/ic_pet_bulldog", 0,"Bulldog","Jumper"));
        pets.add(new PetModel("@drawable/ic_pet_galgo", 0,"Galgo","Eyes"));
        pets.add(new PetModel("@drawable/ic_pet_labrador", 0,"Labrador","Shorty"));
        pets.add(new PetModel("@drawable/ic_pet_mastin", 0,"Mastin","Charm"));
        pets.add(new PetModel("@drawable/ic_pet_pug", 0,"Pug","Foot"));

        RecyclerView rvPets = view.findViewById(R.id.rvPetList);

        rvPets.setAdapter(new PetAdapter(view.getContext(), pets));
        rvPets.setLayoutManager(new LinearLayoutManager(view.getContext()));

        super.onViewCreated(view, savedInstanceState);
    }
}
