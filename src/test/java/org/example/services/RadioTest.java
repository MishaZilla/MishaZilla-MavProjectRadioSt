package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test1() {
        Radio rad = new Radio(16);

        Assertions.assertEquals(16, rad.getTotalRadioStations());
    }

    @Test
    public void test2() {
        Radio rad = new Radio();

        Assertions.assertEquals(10, rad.getTotalRadioStations());
    }

    @Test
    public void currentStation() {
        Radio rad = new Radio ();

        rad.setNumberCurrentRadioStation(4);

        int expected = 4;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationHigher9() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(11);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBelow0() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonNext() {
        Radio rad = new Radio(18);

        rad.setNumberCurrentRadioStation(13);

        rad.nextStation();

        int expected = 14;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonNext() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrev() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(8);

        rad.prevStation();

        int expected = 7;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonPrev() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentSoundLevel() {
        Radio rad = new Radio();

        rad.setCurrentSoundLevel(27);

        int expected = 27;
        int actual = rad.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentSoundLevelHigher100() {
        Radio rad = new Radio();

        rad.setCurrentSoundLevel(112);

        int expected = 0;
        int actual = rad.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentSoundLevelBelow0() {
        Radio rad = new Radio();

        rad.setCurrentSoundLevel(-3);

        int expected = 0;
        int actual = rad.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolume() {
        Radio sound = new Radio();

        sound.setCurrentSoundLevel(87);

        sound.increaseVolume();

        int expected = 88;
        int actual = sound.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderSoundVolume() {
        Radio sound = new Radio();

        sound.setCurrentSoundLevel(100);

        sound.increaseVolume();

        int expected = 100;
        int actual = sound.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio sound = new Radio();

        sound.setCurrentSoundLevel(74);

        sound.reduceVolume();

        int expected = 73;
        int actual = sound.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderDecreaseVolume() {
        Radio sound = new Radio();

        sound.setCurrentSoundLevel(0);

        sound.reduceVolume();

        int expected = 0;
        int actual = sound.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }
}