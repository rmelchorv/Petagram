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
import mx.edu.unistmo.repo.mobile.android.petagram.presenter.IMainFragmentPresenter;
import mx.edu.unistmo.repo.mobile.android.petagram.presenter.MainFragmentPresenter;

public class MainFragmentView extends Fragment implements IMainFragmentView {

    private IMainFragmentPresenter presenter;
    private RecyclerView rvPets;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        presenter =new MainFragmentPresenter(this, getContext());
        rvPets = view.findViewById(R.id.rvPetList);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.loadPetList();
    }

    @Override
    public void setupRecyclerView(ArrayList<PetModel> pets) {
        rvPets.setAdapter(new PetAdapter(getContext(), pets));
        rvPets.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}
