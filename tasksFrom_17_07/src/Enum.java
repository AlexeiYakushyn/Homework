/**
 * Created by java2 on 20.07.17.
 */

    enum Season {
        JANUARY("31"), FEBRUARY("28"), MARCH("31"), APRIL("30"), MAY("31"), JUNE("30"), JULY("31"), AUGUST("31"), SEPTEMBER("30"), OCTOBER("31"), NOVEMBER("30"), DECEMBER("31");

       // private final int i;

        private  String days;
        private  int i;

        Season(String days) {
            this.days = days;
        }

        Season() {

        }

        @Override
        public String toString() {
            return this.days;
        }
    }

