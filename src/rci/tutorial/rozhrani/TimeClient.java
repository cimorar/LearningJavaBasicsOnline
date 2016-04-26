package rci.tutorial.rozhrani;

import java.time.LocalDateTime;

/**
 * Created by cimorads on 4/26/2016, update from home.
 */
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                        int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
