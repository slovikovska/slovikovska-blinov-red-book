package book.chapter3.task2.model;

public class Element {
    private Double element1;
    private Double element2;
    private Integer element3;
    private Long element4;
    private Integer element5;

    public Element(Double element1, Double element2, Integer element3, Long element4, Integer element5) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
        this.element5 = element5;
    }

    public Double getElement1() {
        return element1;
    }

    public void setElement1(Double element1) {
        this.element1 = element1;
    }

    public Double getElement2() {
        return element2;
    }

    public void setElement2(Double element2) {
        this.element2 = element2;
    }

    public Integer getElement3() {
        return element3;
    }

    public void setElement3(Integer element3) {
        this.element3 = element3;
    }

    public Long getElement4() {
        return element4;
    }

    public void setElement4(Long element4) {
        this.element4 = element4;
    }

    public Integer getElement5() {
        return element5;
    }

    public void setElement5(Integer element5) {
        this.element5 = element5;
    }

    public String toString() {
        StringBuilder listElements = new StringBuilder();
        listElements.append(this.element1).append(" ");
        listElements.append(this.element2).append(" ");
        listElements.append(this.element3).append(" ");
        listElements.append(this.element4).append(" ");
        listElements.append(this.element5).append(" ");
        return listElements.toString();
    }
}
