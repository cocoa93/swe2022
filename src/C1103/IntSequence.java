package C1103;

public interface IntSequence {
    int next();
    default boolean hasNext(){return true;}
}