package com.abhinav.quizmania;

import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;


public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
        //not useful
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    String JSoN= "[['1. Which of the following is a  non-communicable diseases?', 'Diabetes', 'Jaundice', 'Malaria', 'Common cold', 1],['2. Which of the following diseases is caused by a protozoan? ', 'Cholera', 'Tuberculosis', 'Malaria', 'Typhoid',3], ['3. Crimean-Congo Haemorrhagic fever, a few few cases of which were detected in India early this year is spread through - ', 'Mosquitoes', 'Flies', 'Birds', 'Animal ticks', 4], ['4. Acute lead poisoning is also known as &ndash;', 'Plumbism', 'Itai itai', 'Neuralgia', 'Byssinosis', 1], ['5. Which of the following is not a dietary deficiency disease? ', 'Anaemia', 'Scurvy', 'Beri beri', 'Diabetes', 4], ['6. Impaired blood clotting is a condition caused by the deficiency of which of the following nutrients?', 'Calcium', 'Vitamin K', 'Iodine', 'Vitamin A', 2], ['7. Common salt is enriched with iodine to prevent which of the following diseases? ', 'Goitre', 'Scurvy', 'Rickets', 'Night blindness', 1], ['8. Which of the following is not a viral disease? ', 'AIDS', 'Tetanus', 'Common cold', 'Measles', 2], ['9. Itai itai is a condition caused due to the poisoning effect of ', 'Arsenic', 'Mercury', 'Lead', 'Cadmium', 4], ['10. Which of the following is not a zoonotic disease? ', 'Dengue', 'Rabies', 'Kwashiorkor', 'Plague', 3], ['11. Deficiency of which of the following nutrients results in the condition Kwashiorkor? ', 'Iodine', 'Proteins', 'Calcium', 'Iron', 2], ['12. Which of the following is a degenerative disease? ', 'Cataract', 'Athelete’s foot', 'Tuberculosis', 'Asthma', 1], ['13. Which  of the following affects people working in cotton product factories? ', 'Silicosis', 'Byssinosis', 'Mad hatter’s disease', 'Mesothelioma', 2], ['14. Which  of the following diseases is caused by tsetse fly? ', 'Kala azar', 'Filaria', 'Sleeping sickness', 'Encephalitis', 3], ['15. Minamata disease is caused due to the poisoning effect of ', 'Cadmium', 'Mercury', 'Lead', 'Asbestos', 2], ['16. Which of the following is not a bacterial disease? ', 'Cholera', 'Ringworm', 'Leprosy', 'Typhoid', 2], ['17. For treatment of which of the following diseases is dosage of calcium prescribed? ', 'Sterility', 'Kwashiorkor', 'Anaemia', 'Osteoporosis', 4], ['18. Which of the following is incorrectly matched? ', 'Vit A – Night blindness', 'Vit B – Beri beri', 'Vit C - Influenza', 'Vit D - Rickets', 3], ['19. Which of the following diseases is not transmitted by mosquitoes? ', 'Kala azar', 'Yellow fever', 'Chikungunya', 'Dengue', 1], ['20. Warts, moles, cancer can be broadly classified as ', 'Hormonal disease', 'Neoplastic diseases', 'Immunological diseases', 'Congenital diseases', 2]]";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      //  Gson gson =new Gson();
      //  String[][] array = gson.fromJson(JSoN,String[][].class);
        View view =inflater.inflate(R.layout.fragment_one, container, false);
        Button temp = (Button) view.findViewById(R.id.button);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),QuizActivity.class));
            }
        });

        return view;
    }

}
