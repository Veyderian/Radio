public class Radio {


    private int maxRadioStation;
    private int minRadioStation;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


    public Radio() {
        this.maxRadioStation = 9;
        this.minRadioStation = 0;
        this.currentRadioStation = minRadioStation;


    }

    public Radio(int stationsCount) {
        this.maxRadioStation = stationsCount - 1;
    }


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
        } else currentRadioStation = minRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation != minRadioStation) {
            currentRadioStation--;
            return;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setToMaxRadioStation() {

        currentRadioStation = maxRadioStation;
    }

    public void setToMinRadioStation() {

        currentRadioStation = minRadioStation;
    }

    public void setToMaxVolume() {

        currentVolume = maxVolume;
    }

    public void setToMinVolume() {

        currentVolume = minVolume;
    }

    public void increaseVolumeOn1() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }


    public void volumeReduction() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }

}









