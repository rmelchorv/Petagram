package mx.edu.unistmo.repo.mobile.android.petagram.interactor;

import android.content.Context;

import java.util.ArrayList;

import mx.edu.unistmo.repo.mobile.android.petagram.model.PetModel;

public class PetInteractor {

    private final Context context;

    public PetInteractor(Context context) {
        this.context = context;
    }

    @SuppressWarnings("CommentedOutCode")
    public ArrayList<PetModel> fetchPetList() {

        /*
        ArrayList<PetModel> pets = new ArrayList<>();

        pets.add(new PetModel(0, "Happy", "Akita Inu", "@drawable/ic_pet_akita_inu", 0));
        pets.add(new PetModel(1, "Lucky", "Beagle", "@drawable/ic_pet_beagle", 0));
        pets.add(new PetModel(2, "Skipper", "Bulldog", "@drawable/ic_pet_bulldog", 0));
        pets.add(new PetModel(3, "Big Eyes", "Galgo", "@drawable/ic_pet_galgo", 0));
        pets.add(new PetModel(4, "Footprint", "Labrador", "@drawable/ic_pet_labrador", 0));
        pets.add(new PetModel(5, "Charmy", "Mastin", "@drawable/ic_pet_mastin", 0));
        pets.add(new PetModel(6, "Shorty", "Pug", "@drawable/ic_pet_pug", 0));
         */

        return new PetDbHelper(context).readPetList();
    }
}
