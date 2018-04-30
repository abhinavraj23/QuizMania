package com.abhinav.quizmania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;

public class QuizActivity extends AppCompatActivity {
     int noOfQuestions;
    String value1,value2,value3,value4;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mDatabase= FirebaseDatabase.getInstance().getReference().child("developer").child("TopicWise").child("0");
//        String JSoN= "[['1. Which of the following is a  non-communicable diseases?', 'Diabetes', 'Jaundice', 'Malaria', 'Common cold', 1],['2. Which of the following diseases is caused by a protozoan? ', 'Cholera', 'Tuberculosis', 'Malaria', 'Typhoid',3], ['3. Crimean-Congo Haemorrhagic fever, a few few cases of which were detected in India early this year is spread through - ', 'Mosquitoes', 'Flies', 'Birds', 'Animal ticks', 4], ['4. Acute lead poisoning is also known as &ndash;', 'Plumbism', 'Itai itai', 'Neuralgia', 'Byssinosis', 1], ['5. Which of the following is not a dietary deficiency disease? ', 'Anaemia', 'Scurvy', 'Beri beri', 'Diabetes', 4], ['6. Impaired blood clotting is a condition caused by the deficiency of which of the following nutrients?', 'Calcium', 'Vitamin K', 'Iodine', 'Vitamin A', 2], ['7. Common salt is enriched with iodine to prevent which of the following diseases? ', 'Goitre', 'Scurvy', 'Rickets', 'Night blindness', 1], ['8. Which of the following is not a viral disease? ', 'AIDS', 'Tetanus', 'Common cold', 'Measles', 2], ['9. Itai itai is a condition caused due to the poisoning effect of ', 'Arsenic', 'Mercury', 'Lead', 'Cadmium', 4], ['10. Which of the following is not a zoonotic disease? ', 'Dengue', 'Rabies', 'Kwashiorkor', 'Plague', 3], ['11. Deficiency of which of the following nutrients results in the condition Kwashiorkor? ', 'Iodine', 'Proteins', 'Calcium', 'Iron', 2], ['12. Which of the following is a degenerative disease? ', 'Cataract', 'Athelete’s foot', 'Tuberculosis', 'Asthma', 1], ['13. Which  of the following affects people working in cotton product factories? ', 'Silicosis', 'Byssinosis', 'Mad hatter’s disease', 'Mesothelioma', 2], ['14. Which  of the following diseases is caused by tsetse fly? ', 'Kala azar', 'Filaria', 'Sleeping sickness', 'Encephalitis', 3], ['15. Minamata disease is caused due to the poisoning effect of ', 'Cadmium', 'Mercury', 'Lead', 'Asbestos', 2], ['16. Which of the following is not a bacterial disease? ', 'Cholera', 'Ringworm', 'Leprosy', 'Typhoid', 2], ['17. For treatment of which of the following diseases is dosage of calcium prescribed? ', 'Sterility', 'Kwashiorkor', 'Anaemia', 'Osteoporosis', 4], ['18. Which of the following is incorrectly matched? ', 'Vit A – Night blindness', 'Vit B – Beri beri', 'Vit C - Influenza', 'Vit D - Rickets', 3], ['19. Which of the following diseases is not transmitted by mosquitoes? ', 'Kala azar', 'Yellow fever', 'Chikungunya', 'Dengue', 1], ['20. Warts, moles, cancer can be broadly classified as ', 'Hormonal disease', 'Neoplastic diseases', 'Immunological diseases', 'Congenital diseases', 2]]";
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value1=dataSnapshot.getRef().toString();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /*
        Gson gson =new Gson();
        String[][] array = gson.fromJson(JSoN,String[][].class);
        noOfQuestions =array.length;
        String[] question = new String[noOfQuestions];
        String[][] option =new String[noOfQuestions][5];
        int[] answer = new int[noOfQuestions];
        for(int i=0;i<noOfQuestions;i++){
            question[i]= array[i][0];
            answer[i] =Integer.parseInt(array[i][5]);
            for (int j=1;j<5;j++){
                option[i][j]=array[i][j];
            }
        }*/
        Toast.makeText(this,value1, Toast.LENGTH_SHORT).show();

    }
}
