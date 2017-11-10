package C1110;

class Base {
    int baseValue;

    public Base(int baseValue) {// alt + insert
        this.baseValue = baseValue;
    }

    @Override
    protected Base clone() throws CloneNotSupportedException { //공변이기때문에 subtype이 나와도 됨
        return new Base(this.baseValue);
    }

    @Override
    public boolean equals(Object obj) { //추상적인 것, 일반적인 것부터 배제함. 그래야 오류가 안남. <쉴드패턴>
        if (obj== null) return false;
        if (!(obj instanceof Base)) return false;
        if (obj.hashCode() == this.hashCode()) return true;
        return this.baseValue==((Base)obj).baseValue;
    }

    @Override
    public String toString() {
        return "base: "+this.hashCode()+", value="+this.baseValue;
    }
}
