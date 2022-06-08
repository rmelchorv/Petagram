package mx.edu.unistmo.repo.mobile.android.petagram.presenter;

import android.content.Context;

import java.util.ArrayList;

import mx.edu.unistmo.repo.mobile.android.petagram.interactor.PetInteractor;
import mx.edu.unistmo.repo.mobile.android.petagram.model.PetModel;
import mx.edu.unistmo.repo.mobile.android.petagram.view.fragment.IMainFragmentView;

public class MainFragmentPresenter implements IMainFragmentPresenter {

    private final Context context;
    private final IMainFragmentView view;

    public MainFragmentPresenter(IMainFragmentView view, Context context) {
        this.context = context;
        this.view = view;
    }

    @Override
    public ArrayList<PetModel> getPetList() {
        PetInteractor interactor = new PetInteractor(context);

        return interactor.fetchPetList();
    }

    @Override
    public void loadPetList() {
        view.setupRecyclerView(getPetList());
    }
}
