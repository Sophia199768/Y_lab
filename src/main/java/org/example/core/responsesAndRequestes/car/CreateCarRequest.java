package org.example.core.responsesAndRequestes.car;


import java.util.Date;
import java.util.Objects;

/**
 * The {@code CreateCarRequest} class represents a request to create a new car
 * with specified details such as brand, model, release year, condition, and price.
 */

public class CreateCarRequest {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateCarRequest that)) return false;
        return Objects.equals(getCarBrand(), that.getCarBrand()) && Objects.equals(getCarModel(), that.getCarModel()) && Objects.equals(getReleaseYear(), that.getReleaseYear()) && Objects.equals(getCondition(), that.getCondition()) && Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarBrand(), getCarModel(), getReleaseYear(), getCondition(), getPrice());
    }

    /**
     * The brand of the car.
     */
    private String carBrand;

    /**
     * The model of the car.
     */
    private String carModel;

    /**
     * The release year of the car.
     */
    private Date releaseYear;

    /**
     * The condition of the car (e.g., new, used).
     */
    private String condition;

    /**
     * The price of the car.
     */
    private Long price;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
