package mx.edu.unistmo.repo.mobile.android.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mx.edu.unistmo.repo.mobile.android.petagram.view.fragment.MainFragmentView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inflating a fragment to show pet list...
            and send contact info via extra parameters
         */
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fcMainFragment, MainFragmentView.class, null)
                    .commit();
        }
    }
}