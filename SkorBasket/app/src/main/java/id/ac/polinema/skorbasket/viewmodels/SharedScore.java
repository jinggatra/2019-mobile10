package id.ac.polinema.skorbasket.viewmodels;

import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;

public class SharedScore {
    private MutableLiveData<Integer> scoreHome;
    private MutableLiveData<Integer> scoreVisitor;
    private MutableLiveData<Boolean> winner;

    public SharedScore(@NonNull Application application) {
        super(application);
        scoreHome = new MutableLiveData<>();
        scoreVisitor = new MutableLiveData<>();
        winner = new MutableLiveData<>();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedScore =  ViewModelProviders.of(requireActivity()).get(SharedScore.class);
    }
    public void setScoreHome(Integer score){
        scoreHome.setValue(score);
    }

    public LiveData<Integer> getScoreHome(){
        return scoreHome;
    }

    public void setScoreVisitor(Integer score){
        scoreVisitor.setValue(score);
    }

    public LiveData<Integer> getScoreVisitor(){
        return scoreVisitor;
    }

    public void setWinner(Boolean result){
        winner.setValue(result);
    }

    public LiveData<Boolean> getWinner(){
        return winner;
    }

}
