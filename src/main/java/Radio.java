public class Radio {

    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setNextRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation >= 9) {
            newCurrentRadioStation = -1;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setPrevRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation <= 0) {
            newCurrentRadioStation = 10;
        }
        if (newCurrentRadioStation >= 10) {
            newCurrentRadioStation = 10;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setChosenRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setIncreaseRadioVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            newCurrentVolume = -1;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public void setDecreaseRadioVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume >= 11) {
            newCurrentVolume = 11;
        }
        currentVolume = newCurrentVolume;
    }
}