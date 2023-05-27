public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else currentRadioStation = 0;
    }

    public void prevRadioStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
            return;
        } else {
            currentRadioStation = 9;

        }

    }
    int getCurrentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }
    public void setToMinRadioStation() {
        currentVolume = 0;
    }
    public void setToMaxVolume() {
        currentVolume = 100;
    }
    public void setToMinVolume() {
        currentVolume = 0;
    }
    public void increaseVolumeOn1() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }



    public void volumeReduction() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }





   // public void increaseRadioStationOn1() {
      //  int target = currentRadioStation + 1;
       // setCurrentRadioStation(target);
  //  }

    }









