package mx.edu.unistmo.repo.mobile.android.petagram.view.fragment;

import java.util.ArrayList;

import mx.edu.unistmo.repo.mobile.android.petagram.model.PetModel;

public interface IMainFragmentView {

    void setupRecyclerView(ArrayList<PetModel> pets);
}
