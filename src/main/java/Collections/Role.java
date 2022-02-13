package Collections;

public class Role {

    private String name;
    private String rang;
    private Integer visitCount;

    public Role(String name, String rang, Integer visitCount) {
        this.name = name;
        this.rang = rang;
        this.visitCount = visitCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }
}
