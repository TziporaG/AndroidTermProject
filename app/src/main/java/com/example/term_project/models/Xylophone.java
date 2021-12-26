package com.example.term_project.models;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;

import com.example.term_project.R;
import com.google.gson.Gson;

public class Xylophone
{

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float lft_vol = 1.0f;
    private final float rgt_vol = 1.0f;
    private final int loop = 0;
    private final int prty = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId1;
    private int mDSoundId2;
    private int mESoundId3;
    private int mFSoundId4;
    private int mGSoundId5;
    private int mASoundId6;
    private int mBSoundId7;

    private Context mContext;

    public Xylophone(Context context)
    {
        mContext = context;
        // Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // Load and get the IDs to identify the sounds
        mCSoundId1 = mSoundPool.load(context.getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId2 = mSoundPool.load(context.getApplicationContext(), R.raw.note2_d, 1);
        mESoundId3 = mSoundPool.load(context.getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId4 = mSoundPool.load(context.getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId5 = mSoundPool.load(context.getApplicationContext(), R.raw.note5_g, 1);
        mASoundId6 = mSoundPool.load(context.getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId7 = mSoundPool.load(context.getApplicationContext(), R.raw.note7_b, 1);

    }

    public String getInfo() {
        return "Click on each key to hear the notes and play a song.";

    }
    // Add the play methods triggered by the buttons
    public void c (View v){
        mSoundPool.play(mCSoundId1, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE);
    }

    public void d (View v){
        mSoundPool.play(mDSoundId2, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE);
    }

    // Add the play methods triggered by the buttons
    public void e (View v){
        mSoundPool.play(mESoundId3, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE);
    }

    public void f (View v){
        mSoundPool.play(mFSoundId4, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE);
    }

    public void g (View v){
        mSoundPool.play(mGSoundId5, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE);
    }

    public void a (View v){
        mSoundPool.play(mASoundId6, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE);
    }

    public void b (View v){
        mSoundPool.play(mBSoundId7, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE);
    }

    /**
     * Reverses the game object's serialization as a String
     * back to a Xylophone game object
     *
     * @param json The serialized String of the game object
     * @return The game object
     */
    public static Xylophone getGameFromJSON (String json)
    {
        Gson gson = new Gson ();
        return gson.fromJson (json, Xylophone.class);
    }

    /**
     * Serializes the game object to a JSON-formatted String
     *
     * @param obj Game Object to serialize
     * @return JSON-formatted String
     */
    public static String getJSONFromGame (Xylophone obj)
    {
        Gson gson = new Gson ();
        return gson.toJson (obj);
    }

    public String getJSONFromCurrentGame()
    {
        return getJSONFromGame(this);
    }
}
