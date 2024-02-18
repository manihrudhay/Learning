package designpatterns.creational.builder;

class Var {
    public static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private Var var;
        Builder() {
            this.var =  new Var();

        }
        public Builder one(String _one) {
            this.var.one = _one;
            return this;
        }
        public Builder two(String _two) {
            this.var.two = _two;
            return this;
        }

        public Var build() {
            return this.var;
        }

    }
    String one;
    String two;
}