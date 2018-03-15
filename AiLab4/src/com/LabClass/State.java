package com.LabClass;

/**
 * Created by student on 3/15/2018.
 */
public class State {

    int a;
    int b;

    /*
     * Parent of current State
     */
    State pre;

    public State(int a) {
        this.a = a;

    }

    public State(int b, State pre) {
        super();
        this.b = b;
        this.pre = pre;
    }

    @Override
    public int hashCode() {

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        State other = (State) obj;
        if (a != other.a) {
            return false;
        }
        if (b != other.b) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (pre != null) {
            builder.append(pre);
        }
        builder.append(a);
        builder.append("    ").append(b).append("\n");
        return builder.toString();
    }
}
