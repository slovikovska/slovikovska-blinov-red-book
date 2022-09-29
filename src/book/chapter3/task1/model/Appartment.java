package book.chapter3.task1.model;

public class Appartment {
    // id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации
    private long id;
    private long appartmentNumber;
    private long square;
    private long level;
    private long roomsNumber;
    private String street;
    private String buildingType;
    private long exploitationTerm;

    public Appartment(long id, long appartmentNumber, long square, long level, long roomsNumber, String street, String buildingType, long exploitationTerm) {
        this.id = id;
        this.appartmentNumber = appartmentNumber;
        this.square = square;
        this.level = level;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public long getAppartmentNumber() { return appartmentNumber; }
    public void setAppartmentNumber(long appartmentNumber) { this.appartmentNumber = appartmentNumber; }

    public long getSquare() { return square; }
    public void setSquare(long square) { this.square = square; }

    public long getLevel() { return level; }
    public void setLevel(long level) { this.level = level; }

    public long getRoomsNumber() { return roomsNumber; }
    public void setRoomsNumber(long roomsNumber) { this.roomsNumber = roomsNumber; }

    public String getStreet() { return street; }
    public void setStreet( String street) { this.street = street; }

    public String getBuildingType() { return buildingType; }
    public void setBuildingType( String buildingType) {this.buildingType = buildingType; }

    public long getExploitationTerm() { return exploitationTerm; }
    public void setExploitationTerm() { this.exploitationTerm = exploitationTerm; }

    public String toString() {
        StringBuilder appartmentList = new StringBuilder("Appartment{ ");
        appartmentList.append(" ID: ").append(this.id);
        appartmentList.append(", Number of Appartment: ").append(this.appartmentNumber);
        appartmentList.append(", Square: ").append(this.square);
        appartmentList.append(", Level: ").append(this.level);
        appartmentList.append(", Number of Rooms: ").append(this.roomsNumber);
        appartmentList.append(", Street: ").append(this.street);
        appartmentList.append(", Type of Building: ").append(this.buildingType);
        appartmentList.append(", Exploitation Term: ").append(this.exploitationTerm);
        appartmentList.append(" \n");
        return appartmentList.toString();
    }

}
