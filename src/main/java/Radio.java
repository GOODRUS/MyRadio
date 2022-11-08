public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    int currentRadioStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    public int currentVolume;

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public Radio(int size) {
        maxStation = minStation + size;
    }

    public Radio() {
        maxStation = minStation + 10;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setNextRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < minStation) {
            newCurrentRadioStation = maxStation;
        }
        if (newCurrentRadioStation >= maxStation - 1) {
            newCurrentRadioStation = minStation - 1;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void setPrevRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation <= minStation) {
            newCurrentRadioStation = maxStation;
        }
        if (newCurrentRadioStation >= maxStation) {
            newCurrentRadioStation = maxStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setChosenRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < minStation) {
            newCurrentRadioStation = maxStation - 1;
        }
        if (newCurrentRadioStation > maxStation - 1) {
            newCurrentRadioStation = minStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void setIncreaseRadioVolume(int newCurrentVolume) {

        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume - 1;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void setDecreaseRadioVolume(int newCurrentVolume) {

        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume >= maxVolume + 1) {
            newCurrentVolume = maxVolume + 1;
        }
        currentVolume = newCurrentVolume;
    }
}