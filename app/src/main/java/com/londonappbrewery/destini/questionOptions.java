package com.londonappbrewery.destini;

public class questionOptions {

    private int mQuestionID;
    private int mTopOptionID;
    private int mBottomOptionID;
    private int mNextQuestionTopID;
    private int mNextQuestionBottomID;

    public questionOptions(int questionID, int topOptionID, int bottomOptionID, int nextQuestionTopID, int nextQuestionBottomID) {
        mQuestionID = questionID;
        mTopOptionID = topOptionID;
        mBottomOptionID = bottomOptionID;
        mNextQuestionTopID = nextQuestionTopID;
        mNextQuestionBottomID = nextQuestionBottomID;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public int getTopOptionID() {
        return mTopOptionID;
    }

    public void setTopOptionID(int topOptionID) {
        mTopOptionID = topOptionID;
    }

    public int getBottomOptionID() {
        return mBottomOptionID;
    }

    public void setBottomOptionID(int bottomOptionID) {
        mBottomOptionID = bottomOptionID;
    }

    public int getNextQuestionTopID() {
        return mNextQuestionTopID;
    }

    public void setNextQuestionTopID(int nextQuestionTopID) {
        mNextQuestionTopID = nextQuestionTopID;
    }

    public int getNextQuestionBottomID() {
        return mNextQuestionBottomID;
    }

    public void setNextQuestionBottomID(int nextQuestionBottomID) {
        mNextQuestionBottomID = nextQuestionBottomID;
    }
}
