package com.example.looparrayandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.looparrayandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        in ra bang cuu chuong 9 ( 1-9 )

//        whileLoopExam();
//        whileLoopExam2();
//        infinityLoop();
//        doWhileLoopExam();

//        forLoopExam();

        array();


    }

    private void array() {

//
        String[] arrNote1 = new String[13];

        arrNote1[0] = "A";
        arrNote1[1] = "A#";
        arrNote1[2] = "B";
        arrNote1[3] = "C";
        arrNote1[4] = "C#";
        arrNote1[5] = "D";
        arrNote1[7] = "D#";
        arrNote1[8] = "E";
        arrNote1[9] = "F";
        arrNote1[10] = "F#";
        arrNote1[11] = "G";
        arrNote1[12] = "G#";

        String[] arrNote2 = {"A", "A#", "B", "C", "C#", "D", "D#",
                "E", "F", "F#", "G", "G#"};


        String result = "";
        // duyet tung phan tu cua array
        for (int i = 0; i < arrNote2.length; i++) {
//            result = result + arr[i] + "\n";
            result += arrNote2[i] + "\n";
        }

        binding.tvText.setText(result);

    }

    private void infinityLoop() {
        String text = "";
        int count = 0;

        while (true) {
            text = text + "I Love you \n";
            System.out.println(text);
            count++;

            if (count == 100)
                break;


        }

    }

    private void whileLoopExam2() {

        int index = 3;
        int number = 100;
        String result = "";

        while (index < number) {
            result = result + index + ",";
            // tang bien index len 2 sau moi vong lap
            index = index + 3;
        }

        binding.tvText.setText(result);


    }

    private void whileLoopExam() {
        int count = 10;

        String result = "";

        String firtName = "Phuong";
        String lastName = "Phung";
        String fullName = firtName + lastName; // Phuong Phung


        while (count <= 9) {
            // concat string
            result = result + "9 x" + count + " = " + 9 * count + "\n";
            count = count + 1;
        }

        binding.tvText.setText(result);


    }


    private void forLoopExam() {

        String result = "";

        int count;
        for (count = 1; count <= 9; count = count + 1) {
            result = result + "9 x" + count + " = " + 9 * count + "\n";

            if (count == 5)
                break;
        }

        binding.tvText.setText(result);


    }

    private void doWhileLoopExam() {

        int count = 10;
        String result = "";


        do {
            result = result + "9 x" + count + " = " + 9 * count + "\n";
            count++;
        } while (count <= 9);


        binding.tvText.setText(result);


    }


}