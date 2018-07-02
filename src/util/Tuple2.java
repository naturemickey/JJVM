package util;

public class Tuple2<T, E> {
    T _1;
    E _2;

    private Tuple2(T _1, E _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static <T1, T2> Tuple2<T1, T2> create(T1 _1, T2 _2) {
        return new Tuple2<>(_1, _2);
    }
}
