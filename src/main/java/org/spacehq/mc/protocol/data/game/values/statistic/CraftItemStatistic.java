package org.spacehq.mc.protocol.data.game.values.statistic;

public class CraftItemStatistic implements Statistic {

    private String id;

    public CraftItemStatistic(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        CraftItemStatistic that = (CraftItemStatistic) o;

        if(!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
