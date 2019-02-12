package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView mQuestion;
    public TextView mTopOption;
    public TextView mBottomOption;
    public int mStoryIndex = 0;


    private questionOptions[] mQuestionOptionsBank = new questionOptions[]{
            new questionOptions(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 2, 1),
            new questionOptions(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 2, 3),
            new questionOptions(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 5, 4),
            new questionOptions(R.string.T4_Story, R.string.T4_Ans1, R.string.T4_Ans2, 5, 5),
            new questionOptions(R.string.T5_Story, R.string.T5_Ans1, R.string.T5_Ans2, 5, 5),
            new questionOptions(R.string.T6_Story, R.string.T6_Ans1, R.string.T6_Ans2, 5, 5),
    };

    public void mUpdateQuestion(int storyIndex) {
        mQuestion.setText(mQuestionOptionsBank[storyIndex].getQuestionID());
        mTopOption.setText(mQuestionOptionsBank[storyIndex].getTopOptionID());
        mBottomOption.setText(mQuestionOptionsBank[storyIndex].getBottomOptionID());
    }

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mQuestion = findViewById(R.id.storyTextView);
        mTopOption = findViewById(R.id.buttonTop);
        mBottomOption = findViewById(R.id.buttonBottom);

        mTopOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mQuestionOptionsBank[mStoryIndex].getNextQuestionTopID();
                mUpdateQuestion(mStoryIndex);
            }
        });

        mBottomOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mQuestionOptionsBank[mStoryIndex].getNextQuestionBottomID();
                mUpdateQuestion(mStoryIndex);
            }
        });

    }
}
