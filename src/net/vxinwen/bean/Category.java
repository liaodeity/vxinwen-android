package net.vxinwen.bean;

public class Category {
    private long id;
    private String name;
    private String desc;
    private int unreadNewsCount;
    private long lastNewsId;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getLastNewsId() {
        return lastNewsId;
    }

    public void setLastNewsId(long lastNewsId) {
        this.lastNewsId = lastNewsId;
    }

    public int getUnreadNewsCount() {
        return unreadNewsCount;
    }

    public void setUnreadNewsCount(int unreadNewsCount) {
        this.unreadNewsCount = unreadNewsCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
