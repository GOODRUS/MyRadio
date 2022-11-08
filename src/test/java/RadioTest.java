import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    /* Установка значения для оценки работы метода "Next" */

    @Test
    public void shouldCheckMethodNext() {

        Radio switcher = new Radio();
        switcher.currentRadioStation = 10;

        switcher.next();

        int actual = 10;
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

    /* Установка максимального значения при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setNextRadioStation(14);

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

    /* Установка минимального значения при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMinSize() {

        Radio switcher = new Radio(15);
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

    /* Установка значения за пределами максимального при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setNextRadioStation(15);

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


    /* Установка значения за пределами минимального при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMinSize() {

        Radio switcher = new Radio(15);
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

    /* Установка значений в пределах диапазона при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationInRangeSize() {

        Radio switcher = new Radio(15);
        switcher.setNextRadioStation(11);

        switcher.next();

        int actual = 12;
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

    /* Установка максимального значения при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setPrevRadioStation(14);

        switcher.prev();

        int actual = 13;
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

    /* Установка минимального значения при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMinSize() {

        Radio switcher = new Radio(15);
        switcher.setPrevRadioStation(0);

        switcher.prev();

        int actual = 14;
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

    /* Установка значения за пределами максимального при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setPrevRadioStation(15);

        switcher.prev();

        int actual = 14;
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

    /* Установка значения за пределами минимального при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMinSize() {

        Radio switcher = new Radio(15);
        switcher.setPrevRadioStation(-1);

        switcher.prev();

        int actual = 14;
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

    /* Установка значений в пределах диапазона при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverInRangeSize() {

        Radio switcher = new Radio(15);
        switcher.setPrevRadioStation(12);

        switcher.prev();

        int actual = 11;
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

    /* Установка максимально значения диапазона c указанием размера */

    @Test
    public void shouldSetNumberOfChosenRadioStationMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setChosenRadioStation(14);

        int actual = 14;
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

    /* Установка минимального значения диапазона c указанием размера */

    @Test
    public void shouldSetNumberOfChosenRadioStationMinSize() {

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

    /* Установка значения за пределами максимума диапазона c указанием размера */

    @Test
    public void shouldSetNumberOfChosenRadioStationOverMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setChosenRadioStation(15);

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

    /* Установка значения за пределами минимума диапазона c указанием размера */

    @Test
    public void shouldSetNumberOfChosenRadioStationOverMinSize() {

        Radio switcher = new Radio(15);
        switcher.setChosenRadioStation(-1);

        int actual = 14;
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

    /* Установка значений в пределах диапазона c указанием размера*/

    @Test
    public void shouldSetNumberOfChosenRadioStationInRangeSize() {

        Radio switcher = new Radio(15);
        switcher.setChosenRadioStation(12);

        int actual = 12;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения звука при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneMax() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(100);

        switcher.increaseVolume();

        int actual = 100;
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
        switcher.setIncreaseRadioVolume(101);

        switcher.increaseVolume();

        int actual = 100;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом минимума при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneOverMin() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(-2);

        switcher.increaseVolume();

        int actual = 0;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука в пределах диапазона при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneInRange() {

        Radio switcher = new Radio();
        switcher.setIncreaseRadioVolume(15);

        switcher.increaseVolume();

        int actual = 16;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения звука при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneMax() {

        Radio switcher = new Radio();
        switcher.setDecreaseRadioVolume(100);

        switcher.decreaseVolume();

        int actual = 99;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения звука при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneMin() {

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
        switcher.setDecreaseRadioVolume(102);

        switcher.decreaseVolume();

        int actual = 100;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом минимума при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneOverMin() {

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
        switcher.setDecreaseRadioVolume(15);

        switcher.decreaseVolume();

        int actual = 14;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeNewTest() {
        Radio switcher = new Radio();

        assertEquals(0, switcher.getMinStation());
        assertEquals(10, switcher.getMaxStation());
        assertEquals(0, switcher.getCurrentRadioStation());
    }
}
