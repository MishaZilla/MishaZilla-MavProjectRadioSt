package org.junit.jupiter.api;

public class Radio {

    private int numberCurrentRadioStation;
    private int currentSoundVolumeLevel;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > 9) {
            return;
        }
        numberCurrentRadioStation = currentNumber;
    }

    public void nextStation() {
        if (numberCurrentRadioStation < 9) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        } else {
            numberCurrentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (numberCurrentRadioStation > 0) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        } else {
            numberCurrentRadioStation = 9;
        }
    }

    public int getCurrentSoundLevel() {
        return currentSoundVolumeLevel;
    }

    public void setCurrentSoundLevel(int currentSound) {
        if (currentSound < 0) {
            return;
        }
        if (currentSound > 100) {
            return;
        }
        currentSoundVolumeLevel = currentSound;
    }

    public void increaseVolume() {
        if (currentSoundVolumeLevel < 100) {
            currentSoundVolumeLevel = currentSoundVolumeLevel + 1;
        } else {
            currentSoundVolumeLevel = 100;
        }
    }

    public void reduceVolume() {
        if (currentSoundVolumeLevel > 0) {
            currentSoundVolumeLevel = currentSoundVolumeLevel - 1;
        } else {
            currentSoundVolumeLevel = 0;
        }
    }
}