package builderpattern;

public class House {
    private String door;
    private String window;
    private String roof;


    public static class Builder {
        private String door;
        private String window;
        private String roof;

        public Builder door(String d){
            door = d;
            System.out.println("Build door");
            return this;
        }

        public Builder window(String w){
            window = w;
            System.out.println("Build window");
            return this;
        }

        public Builder roof(String r){
            roof = r;
            System.out.println("Build roof");
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

    private House(Builder builder) {
        this.door = builder.door;
        this.window = builder.window;
        this.roof = builder.roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", window='" + window + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
