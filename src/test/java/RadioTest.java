import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    /* Установка значения для оценки работы метода "Next" */

    @Test
    public void shouldCheckMethodNext() {

        Radio switcher = new Radio();
        switcher.currentRadioStation = 9;

        switcher.next();

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения для оценки работы метода "Prev" */

    @Test
    public void shouldCheckMethodPrev() {

        Radio switcher = new Radio();
        switcher.currentRadioStation = 0;

        switcher.prev();

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMax() {

        Radio switcher = new Radio();
        switcher.setNextRadioStation(9);

        switcher.next();

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMin() {

        Radio switcher = new Radio();
        switcher.setNextRadioStation(0);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами максимального при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMax() {

        Radio switcher = new Radio();
        switcher.setNextRadioStation(10);

        switcher.next();

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами минимального при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMin() {

        Radio switcher = new Radio();
        switcher.setNextRadioStation(-1);

        switcher.next();

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значений в пределах диапазона при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationInRange() {

        Radio switcher = new Radio();
        switcher.setNextRadioStation(5);

        switcher.next();

        int actual = 6;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMax() {

        Radio switcher = new Radio();
        switcher.setPrevRadioStation(9);

        switcher.prev();

        int actual = 8;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMin() {

        Radio switcher = new Radio();
        switcher.setPrevRadioStation(0);

        switcher.prev();

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами максимального при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMax() {

        Radio switcher = new Radio();
        switcher.setPrevRadioStation(10);

        switcher.prev();

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами минимального при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMin() {

        Radio switcher = new Radio();
        switcher.setPrevRadioStation(-1);

        switcher.prev();

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значений в пределах диапазона при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverInRange() {

        Radio switcher = new Radio();
        switcher.setPrevRadioStation(6);

        switcher.prev();

        int actual = 5;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимально значения диапазона */

    @Test
    public void shouldSetNumberOfChosenRadioStationMax() {

        Radio switcher = new Radio();
        switcher.setChosenRadioStation(9);

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения диапазона */

    @Test
    public void shouldSetNumberOfChosenRadioStationMin() {

        Radio switcher = new Radio();
        switcher.setChosenRadioStation(0);

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами максимума диапазона */

    @Test
    public void shouldSetNumberOfChosenRadioStationOverMax() {

        Radio switcher = new Radio();
        switcher.setChosenRadioStation(10);

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами минимума диапазона */

    @Test
    public void shouldSetNumberOfChosenRadioStationOverMin() {

        Radio switcher = new Radio();
        switcher.setChosenRadioStation(-1);

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значений в пределах диапазона */

    @Test
    public void shouldSetNumberOfChosenRadioStationInRange() {

        Radio switcher = new Radio();
        switcher.setChosenRadioStation(5);

        int actual = 5;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения звука при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneMax() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(10);

        switcher.increaseVolume();

        int actual = 10;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения звука при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneMin() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(0);

        switcher.increaseVolume();

        int actual = 1;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом максимума при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneOverMax() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(11);

        switcher.increaseVolume();

        int actual = 10;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом минимума при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneOverMix() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(-1);

        switcher.increaseVolume();

        int actual = 0;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука в пределах диапазона при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneInRange() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(5);

        switcher.increaseVolume();

        int actual = 6;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения звука при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneMax() {

        Radio switcher = new Radio();
        switcher.setDecreaseRadioVolume(10);

        switcher.decreaseVolume();

        int actual = 9;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения звука при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneMix() {

        Radio switcher = new Radio();
        switcher.setDecreaseRadioVolume(0);

        switcher.decreaseVolume();

        int actual = 0;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом максимума при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneOverMax() {

        Radio switcher = new Radio();
        switcher.setDecreaseRadioVolume(11);

        switcher.decreaseVolume();

        int actual = 10;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом минимума при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneOverMix() {

        Radio switcher = new Radio();
        switcher.setDecreaseRadioVolume(-1);

        switcher.decreaseVolume();

        int actual = 0;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука в пределах диапазона при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneInRange() {

        Radio switcher = new Radio();
        switcher.setDecreaseRadioVolume(5);

        switcher.decreaseVolume();

        int actual = 4;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
