package com.example.consultancyappexercice.ui.about;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.consultancyappexercice.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutFragment extends Fragment {

    private AboutViewModel mViewModel;

    public static AboutFragment newInstance() {
        return new AboutFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse " +
                "a sollicitudin nunc. Integer sem dui, fringilla nec dolor id, imperdiet posuere justo. " +
                "Ut pellentesque ligula urna, ut porttitor nisi convallis vel. Fusce faucibus neque semper, " +
                "porttitor elit in, ornare dui. Sed rutrum consequat laoreet. Pellentesque sed accumsan mi. " +
                "Quisque et vehicula tortor, ac porta urna. Praesent quis orci eu nisi pharetra fringilla in nec" +
                " risus. Aliquam lacinia quis risus at tincidunt";

        Element version = new Element();
        version.setTitle("version 1.7.2");

        return new AboutPage(getActivity())
                .setImage(R.drawable.ssss_round)
                .setDescription(description)
                .addGroup("Contact")
                .addEmail("sdmt@stmt.com", "email us!")
                .addWebsite("https://www.twitch.tv/akemy_sama", "Our Website")
                .addGroup("social media")
                .addFacebook("vinicius.scherer.395", "Facebook") // URL ID
                .addItem(version)
                .create();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AboutViewModel.class);
        // TODO: Use the ViewModel
    }

}