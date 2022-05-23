package solutions.caio.cavallieri.zueiraneverends;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //region linha 1

    public void faustao(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.faustao);
        play.start();
    }

    public void frodo(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.frodo);
        play.start();
    }

    public void marmota(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.marmota);
        play.start();
    }

    public void peppy(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.peppy);
        play.start();
    }

    //endregion

    //region linha 2

    public void ackbar(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.ackbar);
        play.start();
    }

    public void mario(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.mario);
        play.start();
    }

    public void item(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.item);
        play.start();
    }

    public void obiwan(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.obiwan);
        play.start();
    }

    //endregion

    //region linha 3

    public void tiro(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.tiro);
        play.start();
    }

    public void legendary(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.legendary2);
        play.start();
    }

    public void megaman(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.megaman);
        play.start();
    }

    public void mimi(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.mimi);
        play.start();
    }

    //endregion

    //region linha 4

    public void impostor(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.impostor);
        play.start();
    }

    public void spy(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.spy);
        play.start();
    }

    public void gandalf(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.gandalf);
        play.start();
    }

    public void fodase(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.fodase);
        play.start();
    }

    //endregion

    //region linha 5

    public void milkbar(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.milkbar);
        play.setLooping(true);
        play.start();
    }

    public void challengeAccepted(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.challengeaccepted);
        play.start();
    }

    public void awesome(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.awesome);
        play.start();
    }

    public void homer(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.homer);
        play.start();
    }

    //endregion

    //region linha 6

    public void manaMana(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.manamana);
        play.start();
    }

    public void ganondorf(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.ganon);
        play.start();
    }

    public void slippy(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.slippy);
        play.start();
    }

    public void navi(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.navi);
        play.start();
    }

    //endregion

    //region linha 7



    //endregion

    public void fatality(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.fatality);
        play.start();
    }

    public void missaoCumprida(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.mission);
        play.start();
    }

    public void pepper(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.goodluck);
        play.start();
    }

    public void teste(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.goodluck);
        play.start();
    }

    public void hyperBeam(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.hyperbeam);
        play.start();
    }

    public void saintSeiya(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.saintseiya);
        play.start();
    }

    public void kabum(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.kabum);
        play.start();
    }

    public void shoruyken(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.shoryuken);
        play.start();
    }

    public void clearshot(View view) {
        if(null != play){
            if(play.isPlaying())
                play.stop();

            play.release();
            play = null;
        }

        play = MediaPlayer.create(MainActivity.this, R.raw.clearshot);
        play.start();
    }

}
