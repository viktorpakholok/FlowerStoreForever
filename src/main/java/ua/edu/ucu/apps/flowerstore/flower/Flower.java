package ua.edu.ucu.apps.flowerstore.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table
public class Flower extends Item {
    @Id
    private double sepalLength;
    private FlowerType flowertype;
    private double price;
}
