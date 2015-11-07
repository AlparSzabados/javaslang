/*     / \____  _    _  ____   ______  / \ ____  __    _ _____
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  / /  _  \   Javaslang
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/  \__/  /   Copyright 2014-now Daniel Dietrich
 * /___/\_/  \_/\____/\_/  \_/\__\/__/___\_/  \_//  \__/_____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javaslang.collection.List;
import javaslang.collection.Seq;

/**
 * A tuple of 6 elements which can be seen as cartesian product of 6 components.
 *
 * @param <T1> type of the 1st element
 * @param <T2> type of the 2nd element
 * @param <T3> type of the 3rd element
 * @param <T4> type of the 4th element
 * @param <T5> type of the 5th element
 * @param <T6> type of the 6th element
 * @author Daniel Dietrich
 * @since 1.1.0
 */
public final class Tuple6<T1, T2, T3, T4, T5, T6> implements Tuple, Comparable<Tuple6<T1, T2, T3, T4, T5, T6>>, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The 1st element of this tuple.
     */
    public final T1 _1;

    /**
     * The 2nd element of this tuple.
     */
    public final T2 _2;

    /**
     * The 3rd element of this tuple.
     */
    public final T3 _3;

    /**
     * The 4th element of this tuple.
     */
    public final T4 _4;

    /**
     * The 5th element of this tuple.
     */
    public final T5 _5;

    /**
     * The 6th element of this tuple.
     */
    public final T6 _6;

    /**
     * Constructs a tuple of 6 elements.
     *
     * @param t1 the 1st element
     * @param t2 the 2nd element
     * @param t3 the 3rd element
     * @param t4 the 4th element
     * @param t5 the 5th element
     * @param t6 the 6th element
     */
    public Tuple6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        this._1 = t1;
        this._2 = t2;
        this._3 = t3;
        this._4 = t4;
        this._5 = t5;
        this._6 = t6;
    }

    public static <T1, T2, T3, T4, T5, T6> Comparator<Tuple6<T1, T2, T3, T4, T5, T6>> comparator(Comparator<? super T1> t1Comp, Comparator<? super T2> t2Comp, Comparator<? super T3> t3Comp, Comparator<? super T4> t4Comp, Comparator<? super T5> t5Comp, Comparator<? super T6> t6Comp) {
        return (Comparator<Tuple6<T1, T2, T3, T4, T5, T6>> & Serializable) (t1, t2) -> {
            final int check1 = t1Comp.compare(t1._1, t2._1);
            if (check1 != 0) {
                return check1;
            }

            final int check2 = t2Comp.compare(t1._2, t2._2);
            if (check2 != 0) {
                return check2;
            }

            final int check3 = t3Comp.compare(t1._3, t2._3);
            if (check3 != 0) {
                return check3;
            }

            final int check4 = t4Comp.compare(t1._4, t2._4);
            if (check4 != 0) {
                return check4;
            }

            final int check5 = t5Comp.compare(t1._5, t2._5);
            if (check5 != 0) {
                return check5;
            }

            final int check6 = t6Comp.compare(t1._6, t2._6);
            if (check6 != 0) {
                return check6;
            }

            // all components are equal
            return 0;
        };
    }

    @SuppressWarnings("unchecked")
    private static <U1 extends Comparable<? super U1>, U2 extends Comparable<? super U2>, U3 extends Comparable<? super U3>, U4 extends Comparable<? super U4>, U5 extends Comparable<? super U5>, U6 extends Comparable<? super U6>> int compareTo(Tuple6<?, ?, ?, ?, ?, ?> o1, Tuple6<?, ?, ?, ?, ?, ?> o2) {
        final Tuple6<U1, U2, U3, U4, U5, U6> t1 = (Tuple6<U1, U2, U3, U4, U5, U6>) o1;
        final Tuple6<U1, U2, U3, U4, U5, U6> t2 = (Tuple6<U1, U2, U3, U4, U5, U6>) o2;

        final int check1 = t1._1.compareTo(t2._1);
        if (check1 != 0) {
            return check1;
        }

        final int check2 = t1._2.compareTo(t2._2);
        if (check2 != 0) {
            return check2;
        }

        final int check3 = t1._3.compareTo(t2._3);
        if (check3 != 0) {
            return check3;
        }

        final int check4 = t1._4.compareTo(t2._4);
        if (check4 != 0) {
            return check4;
        }

        final int check5 = t1._5.compareTo(t2._5);
        if (check5 != 0) {
            return check5;
        }

        final int check6 = t1._6.compareTo(t2._6);
        if (check6 != 0) {
            return check6;
        }

        // all components are equal
        return 0;
    }

    @Override
    public int arity() {
        return 6;
    }

    @Override
    public int compareTo(Tuple6<T1, T2, T3, T4, T5, T6> that) {
        return Tuple6.compareTo(this, that);
    }

    /**
     * Getter of the 1st element of this tuple.
     *
     * @return the 1st element of this Tuple.
     */
    public T1 _1() {
        return _1;
    }

    /**
     * Getter of the 2nd element of this tuple.
     *
     * @return the 2nd element of this Tuple.
     */
    public T2 _2() {
        return _2;
    }

    /**
     * Getter of the 3rd element of this tuple.
     *
     * @return the 3rd element of this Tuple.
     */
    public T3 _3() {
        return _3;
    }

    /**
     * Getter of the 4th element of this tuple.
     *
     * @return the 4th element of this Tuple.
     */
    public T4 _4() {
        return _4;
    }

    /**
     * Getter of the 5th element of this tuple.
     *
     * @return the 5th element of this Tuple.
     */
    public T5 _5() {
        return _5;
    }

    /**
     * Getter of the 6th element of this tuple.
     *
     * @return the 6th element of this Tuple.
     */
    public T6 _6() {
        return _6;
    }

    public <U1, U2, U3, U4, U5, U6> Tuple6<U1, U2, U3, U4, U5, U6> flatMap(Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, Tuple6<U1, U2, U3, U4, U5, U6>> f) {
        return f.apply(_1, _2, _3, _4, _5, _6);
    }

    public <U1, U2, U3, U4, U5, U6> Tuple6<U1, U2, U3, U4, U5, U6> map(Function1<? super T1, ? extends U1> f1, Function1<? super T2, ? extends U2> f2, Function1<? super T3, ? extends U3> f3, Function1<? super T4, ? extends U4> f4, Function1<? super T5, ? extends U5> f5, Function1<? super T6, ? extends U6> f6) {
        return Tuple.of(f1.apply(_1), f2.apply(_2), f3.apply(_3), f4.apply(_4), f5.apply(_5), f6.apply(_6));
    }

    /**
     * Transforms this tuple to an arbitrary object (which may be also a tuple of same or different arity).
     *
     * @param f Transformation which takes this tuple and return a new tuple of type U
     * @param <U> New type
     * @return An object of type U
     */
    public <U> U transform(Function<? super Tuple6<T1, T2, T3, T4, T5, T6>, U> f) {
        Objects.requireNonNull(f, "f is null");
        return f.apply(this);
    }

    @Override
    public Seq<?> toSeq() {
        return List.of(_1, _2, _3, _4, _5, _6);
    }

    // -- Object

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Tuple6)) {
            return false;
        } else {
            final Tuple6<?, ?, ?, ?, ?, ?> that = (Tuple6<?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(this._1, that._1)
                  && Objects.equals(this._2, that._2)
                  && Objects.equals(this._3, that._3)
                  && Objects.equals(this._4, that._4)
                  && Objects.equals(this._5, that._5)
                  && Objects.equals(this._6, that._6);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s, %s)", _1, _2, _3, _4, _5, _6);
    }

}