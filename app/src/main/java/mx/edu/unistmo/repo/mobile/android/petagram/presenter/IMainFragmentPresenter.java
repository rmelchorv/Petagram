package mx.edu.unistmo.repo.mobile.android.petagram.presenter;

import java.util.ArrayList;

import mx.edu.unistmo.repo.mobile.android.petagram.model.PetModel;

public interface IMainFragmentPresenter {

    ArrayList<PetModel> getPetList();
    void loadPetList();
}
