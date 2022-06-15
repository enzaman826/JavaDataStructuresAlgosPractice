package ch1.reinforcements;

public class R1_10 {

    private class Flower{

        String name;
        int petalCount;
        double price;

        public Flower(){

        }

        public Flower(String name, int petalCount, double price){
            this.name = name;
            this.petalCount = petalCount;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPetalCount() {
            return petalCount;
        }

        public void setPetalCount(int petalCount) {
            this.petalCount = petalCount;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Flower{" +
                    "name='" + name + '\'' +
                    ", petalCount=" + petalCount +
                    ", price=" + price +
                    '}';
        }
    }



}
