package homework;

    public record Person(String name, int age, String position) {

        public boolean isManager() {
            return position.equals("manager");
        }
    }

