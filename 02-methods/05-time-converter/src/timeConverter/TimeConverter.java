package timeConverter;

public class TimeConverter {
  final long ONE_DAY_IN_HOURS = 24;
  final long ONE_HOUR_IN_MINUTES = 60;
  final long ONE_MINUTE_IN_SECONDS = 60;

  public long dToS(int days) {
    return days * ONE_DAY_IN_HOURS * ONE_HOUR_IN_MINUTES * ONE_MINUTE_IN_SECONDS;
  }

  public long hToS(int hours) {
    return hours * ONE_HOUR_IN_MINUTES * ONE_MINUTE_IN_SECONDS;
  }

  public long mToS(int minutes) {
    return minutes * ONE_MINUTE_IN_SECONDS;
  }

  public long msToS(int minutes, int seconds) {
    return mToS(minutes) + seconds;
  }

  public long hmsToS(int hours, int minutes, int seconds) {
    return hToS(hours) + mToS(minutes) + seconds;
  }

  public long dhmsToS(int days, int hours, int minutes, int seconds) {
    return dToS(days) + hToS(hours) + mToS(minutes) + seconds;
  }
}
