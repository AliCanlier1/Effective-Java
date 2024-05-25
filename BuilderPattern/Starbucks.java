package BuilderPattern;

public class Starbucks {

    private String size;
    private int lactoseAmount;
    private boolean isSoft;

    public Starbucks(Builder builder){
        this.size = builder.size;
        this.lactoseAmount = builder.lactoseAmount;
        this.isSoft = builder.isSoft;
    }

    public static class Builder{
        private final String size;
        private int lactoseAmount;
        private boolean isSoft;

        public Builder(String size){
            this.size = size;
        }

        public Builder notSoft(){
            this.isSoft = false;
            return this;
        }
        public Builder withoutLactose(){
            this.lactoseAmount = 0;
            return this;
        }

        public Builder withLactose(int lactoseAmount){
            this.lactoseAmount = lactoseAmount;
            return this;
        }

        public Starbucks build(){
            return new Starbucks(this);
        }
    }

}
