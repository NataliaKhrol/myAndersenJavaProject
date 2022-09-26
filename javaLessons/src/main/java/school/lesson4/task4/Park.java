package school.lesson4.task4;

public class Park {
    private Attraction[] attractions = new Attraction[15];
    String name;
    private int attractionsCount = 0;

    public Park(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("You can enjoy the following attractions in the park " + name + ": ");
        for (int i = 0; i < attractionsCount; i++) {
            System.out.println(attractions[i].getAttraction() + " Cost: " + attractions[i].getAttractionCost()
                    + " Timetable: " + attractions[i].getTimeTable());
        }
    }

    void addAttraction(String attraction, int attractionCost, String timeTable) {
        Attraction a = new Attraction(attraction, attractionCost, timeTable);
        attractions[attractionsCount] = a;
        attractionsCount++;
    }

    // private class можно использовать  только внутри класса Payment
    private class Attraction {
        private String attraction;
        private int attractionCost;
        private String timeTable;

        public String getAttraction() {
            return attraction;
        }

        public int getAttractionCost() {
            return attractionCost;
        }

        public String getTimeTable() {
            return timeTable;
        }

        public void setAttraction(String attraction) {
            this.attraction = attraction;
        }

        public void setAttractionCost(int attractionCost) {
            this.attractionCost = attractionCost;
        }

        public void setTimeTable(String timeTable) {
            this.timeTable = timeTable;
        }

        public Attraction(String attraction, int attractionCost, String timeTable) {
            this.attraction = attraction;
            this.attractionCost = attractionCost;
            this.timeTable = timeTable;
        }
    }
}
