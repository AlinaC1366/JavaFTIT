package homework11;

public class Exercise4 {
    public enum DayOfTheWeek {
        MONDAY("MO"),
        TUESDAY("TUE"),
        WEDNESDAY("WED"),
        THURSDAY("THU"),
        FRIDAY("FRI"),
        SATURDAY("SAT"),
        SUNDAY("SUN");


        private final String symbol;

        DayOfTheWeek(String symbol) {
            this.symbol = symbol;
        }

        public String listOfActivities() {
            return switch (this) {
                case MONDAY -> "Fishing";
                case TUESDAY -> "Picnic";
                case WEDNESDAY -> "Homework";
                case THURSDAY -> "Gym";
                case FRIDAY -> "Cycling";
                case SATURDAY -> "Rest";
                case SUNDAY -> "Rest";
            };
        }
    }
}

