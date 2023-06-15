public class Test {

    private String first;
    private String last;

    public Test(builder builder){
        this.first = builder.first;
        this.last = builder.last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public static class builder{
        private String first,last;

        public builder setFirst(String first) {
            this.first = first;
            return this;
        }

        public builder setLast(String last) {
            this.last = last;
            return this;
        }

        public Test build(){
            return new Test(this);
        }
    }
}
